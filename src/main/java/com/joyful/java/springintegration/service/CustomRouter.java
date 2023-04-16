package com.joyful.java.springintegration.service;

import com.joyful.java.springintegration.model.AvailableChannels;
import com.joyful.java.springintegration.model.JoyfulModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.router.AbstractMessageRouter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class CustomRouter extends AbstractMessageRouter {

    @Autowired
    private MessageChannel intChannel;

    @Autowired
    private MessageChannel defaultChannel;

    @Autowired
    private MessageChannel stringChannel;


    @Override
    protected Collection<MessageChannel> determineTargetChannels(Message<?> message) {
        Collection<MessageChannel> destinationChannels = new ArrayList<MessageChannel>();

        JoyfulModel model = (JoyfulModel) message.getPayload();
        AvailableChannels preferredChannel = model.getPreferredChannel();
        switch (preferredChannel) {
            case INTCHANNEL: {
                destinationChannels.add(intChannel);
                break;
            }
            case STRINGCHANNEL: {
                destinationChannels.add(stringChannel);
                break;
            }
            default: {
                destinationChannels.add(defaultChannel);
                break;
            }
        }

        return destinationChannels;
    }
}
