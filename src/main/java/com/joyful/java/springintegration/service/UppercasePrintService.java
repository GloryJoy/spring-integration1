package com.joyful.java.springintegration.service;

import org.springframework.messaging.Message;

public class UppercasePrintService {
    public void print(Message<?> message) {
        System.out.println("[UPPER] " + message.getPayload().toString().toUpperCase());
    }

    public String execute(Message<?> message){
        return message.getPayload().toString().toUpperCase();
    }
}
