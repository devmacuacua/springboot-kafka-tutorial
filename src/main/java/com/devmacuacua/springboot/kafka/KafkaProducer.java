package com.devmacuacua.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
	private KafkaTemplate<String, String> kakfaTemplate;

	public KafkaProducer(KafkaTemplate<String, String> kakfaTemplate) {
		this.kakfaTemplate = kakfaTemplate;
	}

	public void sendMessage(String message) {
		LOGGER.info(String.format("Message Sent %s", message));
		kakfaTemplate.send("devmacuacua", message);
	}
}
