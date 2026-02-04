package br.com.xmacedo.casesofdesignpatternsinspringboot.builder;

import java.time.LocalDateTime;
import java.util.List;

public class EmailMessage {
    private String from;
    private List<String> to;
    private List<String> cc;
    private String subject;
    private String body;
    private boolean html;
    private List<String> attachments;
    private LocalDateTime scheduledTime;

    public static class Builder {
        private EmailMessage message;

        public Builder() {
            message = new EmailMessage();
            message.to = List.of();
            message.cc = List.of();
            message.attachments = List.of();
        }

        public Builder from(String from) {
            message.from = from;
            return this;
        }

        public Builder to(List<String> to) {
            message.to = to;
            return this;
        }

        public Builder cc(List<String> cc) {
            message.cc = cc;
            return this;
        }

        public Builder subject(String subject) {
            message.subject = subject;
            return this;
        }

        public Builder body(String body) {
            message.body = body;
            return this;
        }

        public Builder html(boolean html) {
            message.html = html;
            return this;
        }

        public Builder attachments(List<String> attachments) {
            message.attachments = attachments;
            return this;
        }

        public EmailMessage build() {
            if (message.from == null || message.to.isEmpty() || message.subject == null) {
                throw new IllegalStateException("Invalid email message");
            }
            return message;
        }
    }
}
