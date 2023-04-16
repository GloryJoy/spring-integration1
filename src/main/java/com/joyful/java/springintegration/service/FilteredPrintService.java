package com.joyful.java.springintegration.service;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class FilteredPrintService implements PrintingService{
    @Override
    public void print(Message<?> message) {
        System.out.printf("[FILTERED] %s\n", message.getPayload().toString());
    }
}
