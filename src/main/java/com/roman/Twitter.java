package com.roman;

public class Twitter implements Quoter {

    @InjectRandomString(min = 2, max = 7)
    private int repeat;

    private String message;

    public Twitter() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {

        for (int i = 0; i < repeat;i++) {

            System.out.println("message = " + message);
        }
    }
}
