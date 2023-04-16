package com.joyful.java.springintegration.configuration;

import com.joyful.java.springintegration.service.CustomChannelInterceptor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.PollableChannel;

import java.util.Arrays;

@Configuration
@EnableIntegration
public class ChannelConfiguration {

    @Bean(name="pollableChannel")
    public PollableChannel pollableChannel(){
        QueueChannel channel = new QueueChannel(10);
//        channel.setInterceptors(Arrays.asList(new CustomChannelInterceptor()));
        channel.addInterceptor(new CustomChannelInterceptor());
        return channel;

    }

    @Bean(name = "intChannel")
    public PollableChannel integerChannel() {
        QueueChannel channel = new QueueChannel(10);
        return channel;
    }

    @Bean(name = "stringChannel")
    public PollableChannel stringChannel(){
        QueueChannel channel = new QueueChannel(10);
        return channel;
    }
}
