package com.joyful.java.springintegration.service;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ConfirmationMailTransformer {

    public String toMailText(@Payload String message){
        System.out.printf("[EMAIL] %s", message);

        return "Your registeration has been confirmed - " + message;

    }
}
