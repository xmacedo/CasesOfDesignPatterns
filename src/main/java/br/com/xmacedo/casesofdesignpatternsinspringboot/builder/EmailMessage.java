package br.com.xmacedo.casesofdesignpatternsinspringboot.builder;

public class EmailMessage {
    private String from;
    private List<String> to;
    private List<String> cc;
    private String subject;
    private String body;
    private boolean html;
    private List<String> attachments;
    private LocalDateTime scheduledTime;

    private EmailMessage(){}

    public static class Builder{
        private EmailMessage message;

        public Builder from(String from){

        }
    }
}
