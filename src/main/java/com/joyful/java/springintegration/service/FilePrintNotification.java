package com.joyful.java.springintegration.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class FilePrintNotification {

    @ServiceActivator(inputChannel = "fileTransformedChannelReply")
    public void notify(@Payload String msg){
        System.out.printf("[FILE-NOTI] %s\n", msg);
    }
}
