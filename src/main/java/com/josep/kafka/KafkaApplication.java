package com.josep.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

	@KafkaListener(id = "kafka", topics = "belajar")
	public void kafkakonsumer(String in) {
		System.out.println("Data yang ditarik : " + in);
	}
}
