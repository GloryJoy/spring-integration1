package com.joyful.java.springintegration.service;

import com.joyful.java.springintegration.model.JoyfulModel;
import org.springframework.stereotype.Component;

@Component
public interface EnhancedPrintingServiceGateway {
    public void print(JoyfulModel model);
    public void printUpperCase(JoyfulModel model);
    public void registerationRequest(JoyfulModel model);
}
