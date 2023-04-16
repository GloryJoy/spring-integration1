package com.joyful.java.springintegration.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class FilePrinter {


    @ServiceActivator(inputChannel = "ibFileChannel")
    public void print(@Payload File file){
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));

            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println("[FILE]" + line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
