package com.joyful.java.springintegration.service;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public interface PrinterGateway {
    public Future<Message<?>> print(Message<?> message);
}
