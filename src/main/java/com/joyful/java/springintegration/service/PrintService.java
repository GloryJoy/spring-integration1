package com.joyful.java.springintegration.service;

import com.joyful.java.springintegration.model.JoyfulModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Service
public class PrintService {

    @ServiceActivator(inputChannel = "stringChannel")
    public void print(@Header("globalTrackingID") Optional<String> globalTrackingID,  @Payload JoyfulModel payload){


        System.out.printf("[PRINT SERVICE] globalTrackingID=%s\n Payload=%s\n",
                globalTrackingID.isPresent() ? globalTrackingID.get() : "",
//                printServiceTrackingID.isPresent() ? printServiceTrackingID : "",
                payload.toString());
    }
}
