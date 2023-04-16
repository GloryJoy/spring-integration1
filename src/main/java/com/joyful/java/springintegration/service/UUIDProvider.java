package com.joyful.java.springintegration.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UUIDProvider {

    public UUID getUUID(){
        return UUID.randomUUID();
    }
}
