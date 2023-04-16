package com.joyful.java.springintegration.service;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class TransformerPrintService implements PrintingService{
    @Override
    public void print(Message<?> message) {
        System.out.printf("[JSON] %s\n", message.getPayload());
    }
}
