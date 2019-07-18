package org.backstreet.collective.hellospring;

public class HelloBean {

    private String message;

    public HelloBean() {}

    public HelloBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void play(){
        for (int i = 0; i < 6; i++){
            System.out.println(message);
        }
    }
}
