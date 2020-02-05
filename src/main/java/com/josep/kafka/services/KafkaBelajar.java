package com.josep.kafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaBelajar {
    public static String TOPIC = "belajar";

    @Autowired
    private KafkaTemplate<String, String> template;

    public void send(String message) {
        this.template.send(TOPIC, message);
    }
}
