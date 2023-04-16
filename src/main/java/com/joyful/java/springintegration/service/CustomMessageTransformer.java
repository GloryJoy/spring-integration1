package com.joyful.java.springintegration.service;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class CustomMessageTransformer {

    public Message<?> transform(Message<?> message) {
        return null;
    }
}
