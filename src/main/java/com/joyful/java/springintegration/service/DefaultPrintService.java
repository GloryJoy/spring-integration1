package com.joyful.java.springintegration.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class DefaultPrintService implements PrintingService {

    @ServiceActivator(inputChannel = "defaultChannel")
    @Override
    public void print(Message<?> message) {
        System.out.printf("DEFAULT: %s", message.getPayload().toString());
    }
}
