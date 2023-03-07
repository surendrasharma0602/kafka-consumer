package com.example.kafkademo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class TopicConsumer  {

	public static void main(String[] args) {
		SpringApplication.run(TopicConsumer.class, args);
	}
	@KafkaListener(topics = "general-topic", groupId = "g1")
	public void listen_g1c1(String message) {
		System.out.println("===>>>>>>>Received Messasge in group - g1c1: " + message);
	}
//	@KafkaListener(topics = "general-topic", groupId = "g1")
//	public void listen_g1c2(String message) {
//		System.out.println("===>>>>>>>Received Messasge in group - g1c2: " + message);
//	}
//	@KafkaListener(topics = "general-topic", groupId = "g2")
//	public void listen_g2c1(String message) {
//		System.out.println("===>>>>>>>Received Messasge in group - g2c1: " + message);
//	}

}