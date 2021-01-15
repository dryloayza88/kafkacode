package com.truelogic.challenge.kafkacode.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class KafkaProducerService {

    private static final String KAFKA_TOPIC = "novice-players";

    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendKafkaMessage(Object object) {
        this.kafkaTemplate.send(KAFKA_TOPIC, object);
    }
}
