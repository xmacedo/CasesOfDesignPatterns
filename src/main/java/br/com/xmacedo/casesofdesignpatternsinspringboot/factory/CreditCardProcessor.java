package br.com.xmacedo.casesofdesignpatternsinspringboot.factory;

import org.springframework.stereotype.Component;

@Component
public class CreditCardProcessor  implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of R$" + amount);
    }
}
