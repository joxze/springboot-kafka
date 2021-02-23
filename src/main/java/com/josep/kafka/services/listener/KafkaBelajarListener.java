package com.josep.kafka.services.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaBelajarListener {

    @KafkaListener(topics = "belajar", groupId = "group")
    public void kafkakonsumer(String in) {
        System.out.println("Data yang ditarik 2 :" + in);
    }
}
