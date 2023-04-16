package com.joyful.java.springintegration.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

public class NumericPrintService {

    @ServiceActivator(inputChannel = "intChannel")
    public void print(Message<?> message){
        System.out.printf("[NUMERIC]: %s\n", message.getPayload().toString());
    }
}
