package com.roman;

public class Twitter implements Quoter {


    @InjectRandomString(rows = {"Row1", "Row2", "Row3", "Row4","Row5","Row6"})
    private String message;

    public Twitter() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        System.out.println("message = " + message);
    }
}

