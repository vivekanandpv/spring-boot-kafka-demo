package com.vivekanandpv.springbootkafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(@Value("${topic.name}")String topicName) {
        return TopicBuilder
                .name(topicName)
                .build();
    }
}
