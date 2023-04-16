package com.joyful.java.springintegration.model;

public enum AvailableChannels {
    INTCHANNEL("intChannel"),
    STRINGCHANNEL("stringChannel"),
    DEFAULTCHANNEL("defaultChannel");

    private final String label;
    private AvailableChannels(String label){
        this.label = label;
    }
}
