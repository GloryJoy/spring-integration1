package com.joyful.java.springintegration;

import com.joyful.java.springintegration.model.AvailableChannels;
import com.joyful.java.springintegration.model.JoyfulModel;
import com.joyful.java.springintegration.service.EnhancedPrintingServiceGateway;
import com.joyful.java.springintegration.service.PrintService;
import com.joyful.java.springintegration.service.PrinterGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.PriorityChannel;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.support.MessageBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@SpringBootApplication
@Configuration
@ImportResource("integration-config2.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

    @Autowired
    private EnhancedPrintingServiceGateway enhancedPrintingServiceGateway;

    public static void main(String[] args) {
        SpringApplication.run(SpringIntegrationApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        process();
    }

    public void process() {
        Boolean toggle = false;

        for (int x = 0; x < 10; x++) {
            AvailableChannels ch = AvailableChannels.DEFAULTCHANNEL;
            if (toggle) {
                ch = AvailableChannels.INTCHANNEL;
                toggle = false;
            } else {
                ch = AvailableChannels.STRINGCHANNEL;
                toggle = true;
            }
            JoyfulModel model = new JoyfulModel(ch, String.format("for %s Channel with %d", ch.toString(), x), "Joy");

            System.out.printf("Sending message %s, %s\n", x, model.toString());
//            this.enhancedPrintingServiceGateway.print(model);
            this.enhancedPrintingServiceGateway.printUpperCase(model);
//            this.enhancedPrintingServiceGateway.registerationRequest(model);
        }

        System.out.println("---- system thread -----");
        Thread currentThread = Thread.currentThread();
        ThreadGroup threadGroup = currentThread.getThreadGroup();
        while (threadGroup.getParent() != null){
            threadGroup = threadGroup.getParent();
        }

        threadGroup.list();

        Thread [] threads = new Thread[10];
        int n = threadGroup.enumerate(threads);

        for (int i =0; i< n;i++){
            System.out.printf("Thread Name: %s \nisDemon: %s \n", threads[i].getName(), threads[i].isDaemon());
        }

    }


}
