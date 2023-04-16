package com.joyful.java.springintegration.model;

public class JoyfulModel {
    private AvailableChannels preferredChannel = AvailableChannels.DEFAULTCHANNEL;
    private String message = "";
    private String phoneNumber = "";
    private String userName = "";

    public JoyfulModel() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public JoyfulModel(AvailableChannels preferredChannel, String message) {
        this.preferredChannel = preferredChannel;
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public JoyfulModel(AvailableChannels preferredChannel, String message, String userName) {
        this.preferredChannel = preferredChannel;
        this.message = message;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "JoyfulModel{" +
                "preferredChannel=" + preferredChannel +
                ", message='" + message + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AvailableChannels getPreferredChannel() {
        return preferredChannel;
    }

    public void setPreferredChannel(AvailableChannels preferredChannel) {
        this.preferredChannel = preferredChannel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
