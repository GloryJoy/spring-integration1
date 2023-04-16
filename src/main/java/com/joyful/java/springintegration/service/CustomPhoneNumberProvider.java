package com.joyful.java.springintegration.service;

import org.springframework.stereotype.Service;

@Service
public class CustomPhoneNumberProvider {
    private String phoneNumber = "+665673456";

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPhoneNumberByUserName(String userName){
        return phoneNumber + " " + userName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
