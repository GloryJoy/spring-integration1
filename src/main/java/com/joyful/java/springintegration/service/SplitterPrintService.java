package com.joyful.java.springintegration.service;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class SplitterPrintService implements PrintingService {
    @Override
    public void print(Message<?> message) {
        System.out.printf("[SPLITTER] %s\n", message.getPayload().toString());
    }
}
