package br.com.xmacedo.casesofdesignpatternsinspringboot.factoryMethod;

import org.springframework.stereotype.Component;

@Component
public class PayPalProcessor implements PaymentProcessor{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of R$" + amount);
    }

}
