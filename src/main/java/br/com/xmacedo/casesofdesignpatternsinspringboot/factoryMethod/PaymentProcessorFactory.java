package br.com.xmacedo.casesofdesignpatternsinspringboot.factoryMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class PaymentProcessorFactory {
    @Autowired
    private Map<String, PaymentProcessor> processors;

    public PaymentProcessor getProcessor(String paymentMethod) {
        PaymentProcessor paymentProcessor = processors.get(paymentMethod);
        if (paymentProcessor == null) {
            throw new IllegalArgumentException("Invalid payment method");
        }
        return paymentProcessor;
    }
}
