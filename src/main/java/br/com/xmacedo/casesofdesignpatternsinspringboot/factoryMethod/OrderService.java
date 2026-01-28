package br.com.xmacedo.casesofdesignpatternsinspringboot.factoryMethod;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentProcessorFactory paymentProcessorFactory;

    public OrderService(PaymentProcessorFactory paymentProcessorFactory) {
        this.paymentProcessorFactory = paymentProcessorFactory;
    }

    public void processOrder(String paymentMethod, double amount) {
        PaymentProcessor paymentProcessor = paymentProcessorFactory.getProcessor(paymentMethod);
        paymentProcessor.processPayment(amount);
    }

}
