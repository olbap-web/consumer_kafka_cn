package com.example.consumerkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "alertas_topic", groupId = "group_id")
    public void consume_alertas(String message) {
        System.out.println("A: " + message);
    }
    
}