package com.joyful.java.springintegration.service;

import com.joyful.java.springintegration.model.JoyfulModel;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class AppRegisteration {

    @ServiceActivator(inputChannel = "registerationInBound")
    public void process(@Payload JoyfulModel model){
        String result = String.format("[IB] registeration %s\n", model.toString());
//        return result;
    }
}
