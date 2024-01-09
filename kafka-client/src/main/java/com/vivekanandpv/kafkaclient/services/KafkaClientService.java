package com.vivekanandpv.kafkaclient.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaClientService {
    private final Logger logger;

    public KafkaClientService() {
        logger = LoggerFactory.getLogger(this.getClass().getName());
    }

    @KafkaListener(topics = "kafka-demo", groupId = "user-group")
    public void printLogMessage(String message) {
        logger.info(message);
    }
}
