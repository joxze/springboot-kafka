package com.josep.kafka.controllers;

import com.josep.kafka.services.KafkaBelajar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller will send message to Kafka
 */
@RestController
public class KafkaClient {
	@Autowired
	private KafkaBelajar kafkaBelajar;

    @GetMapping("/")
    public void index() {
		for (int i = 1; i <= 10; i++) {
			this.kafkaBelajar.send("Ini Pesan ke " + i);
		}
    }
}
