package br.com.xmacedo.casesofdesignpatternsinspringboot.factoryMethod;

import org.springframework.stereotype.Component;

@Component
public class CreditCardProcessor  implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of R$" + amount);
    }
}
