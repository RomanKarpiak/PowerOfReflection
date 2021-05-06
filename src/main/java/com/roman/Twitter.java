package com.roman;

import javax.annotation.PostConstruct;

public class Twitter implements Quoter {

    @InjectRandomInt(min = 1, max = 7)
    private int repeat;

    @InjectRandomString(rows = {"Row1", "Row2", "Row3", "Row4", "Row5", "Row6"})
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("Phase2");
        System.out.println(repeat);
    }

    public Twitter() {
        System.out.println("Phase1");

    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}

