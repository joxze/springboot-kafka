package com.josep.kafka.controllers;

import com.josep.kafka.services.listener.KafkaBelajarListener;
import com.josep.kafka.services.producer.KafkaBelajarProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller will send message to Kafka
 */
@RestController
public class KafkaBelajarController {
	private KafkaBelajarProducer kafkaBelajarProducer;

	public KafkaBelajarController(KafkaBelajarProducer kafkaBelajarProducer) {
		this.kafkaBelajarProducer = kafkaBelajarProducer;
	}

	@GetMapping("/")
    public void index() {
		for (int i = 1; i <= 10; i++) {
			this.kafkaBelajarProducer.send("Ini Pesan ke " + i);
		}
    }
}
