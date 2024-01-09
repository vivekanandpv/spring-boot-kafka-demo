package com.vivekanandpv.springbootkafkademo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    private final KafkaTemplate<String,Object> kafkaTemplate;
    private final String topicName;

    public SampleService(KafkaTemplate<String, Object> kafkaTemplate, @Value("${topic.name}") String topicName) {
        this.kafkaTemplate = kafkaTemplate;
        this.topicName = topicName;
    }

    public void log(String message) {
        kafkaTemplate.send(topicName, message);
    }
}
