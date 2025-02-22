package com.example.consumerkafka.service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private final List<String> alertasMessages = new CopyOnWriteArrayList<>();


    @KafkaListener(topics = "alertas_topic", groupId = "group_id")
    public void consume_alertas(String message) {
        System.out.println("A: " + message);
        alertasMessages.add(message);
    }

    public List<String> getAlertasMessages() {
        return alertasMessages;
    }
    
}