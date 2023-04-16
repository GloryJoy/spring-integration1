package com.joyful.java.springintegration.service;

import org.springframework.messaging.Message;

import java.util.concurrent.Future;

public interface PrintingService {
    public void print(Message<?> message);
}
