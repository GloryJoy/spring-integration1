package com.joyful.java.springintegration.service;

import com.joyful.java.springintegration.model.AvailableChannels;
import com.joyful.java.springintegration.model.JoyfulModel;
import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomSplitter extends AbstractMessageSplitter {
    @Override
    protected Object splitMessage(Message<?> message) {
        var messageList = new ArrayList<JoyfulModel>();
        var model = (JoyfulModel) message.getPayload();
        if (model.getMessage().contains("with 7")) {
            messageList.add(new JoyfulModel(AvailableChannels.DEFAULTCHANNEL, "[SPLITTER]"));
        }

//        messageList.add(model);

        return messageList;
    }
}
