package com.joyful.java.springintegration.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class HttpPrintService {

    @ServiceActivator(inputChannel = "httpChannel")
    public void print(Message<?> msg){
        System.out.println("[HTTP] " + msg);

    }
}
