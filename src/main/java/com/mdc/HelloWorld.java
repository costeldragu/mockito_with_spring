package com.mdc;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {
    private String message;
    public String getMessage() {
        return message;
    }

    @Autowired
    public void setMessage(String message) {
        this.message = message;
    }

    public void myInit() {
        System.out.println("custom myInit is called ");
    }

    public void myDestroy() {
        System.out.println("custom myDestroy is called ");
    }
}
