package br.com.xmacedo.casesofdesignpatternsinspringboot.builder;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmailService {

    public void sendWelcomeEmail(User user) {
        EmailMessage message = new EmailMessage.Builder()
                .from("noreply@example.com")
                .to(List.of(user.getEmail()))
                .subject("Welcome to our platform")
                .body("<h1>Welcome, " + user.getName() + "!</h1><p>Thanks for joining us.</p>")
                .html(true)
                .build();

        sendEmail(message);
    }

    private void sendEmail(EmailMessage message) {
        //logic to send email
        System.out.println(message);
    }
}
