package com.joyful.java.springintegration.service;

import org.springframework.stereotype.Service;

@Service
public class CustomHeaderEnricher {
    private final String packageId = "PACKAGE:1234556";

    public String getPackageId() {
        return packageId;
    }
}
