package com.kafkaconsumer.kafkaconsumer.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.kafkaproducer.util.ProductCreate;

@Component
@KafkaListener(topics = "product")
public class ProductCreateHandler {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@KafkaHandler
	public void handle(ProductCreate productCreate) {
		logger.info("message Received:" + productCreate.getTitle() );

	}

}
