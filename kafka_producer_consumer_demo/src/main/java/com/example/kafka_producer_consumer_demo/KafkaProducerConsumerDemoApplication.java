package com.example.kafka_producer_consumer_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaProducerConsumerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerConsumerDemoApplication.class, args);
    }

}
