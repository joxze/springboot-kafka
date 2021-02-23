package com.josep.kafka.services.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaBelajarProducer {
    public static String TOPIC = "belajar";

    @Autowired
    private KafkaTemplate<String, String> template;

    public void send(String message) {
        this.template.send(TOPIC, message);
    }
}
