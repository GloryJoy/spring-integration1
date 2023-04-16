package com.joyful.java.springintegration.service;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;

@Service
public class CustomFilter implements MessageSelector {
    @Override
    public boolean accept(Message<?> message) {

        return message.getHeaders().get("value").equals(7);
    }
}
