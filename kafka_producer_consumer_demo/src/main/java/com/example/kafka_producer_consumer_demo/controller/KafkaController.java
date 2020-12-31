package com.example.kafka_producer_consumer_demo.controller;

import com.example.kafka_producer_consumer_demo.consumer.MyTopicConsumer;
import com.example.kafka_producer_consumer_demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KafkaController {
    private KafkaTemplate<String, Student> template;
    private MyTopicConsumer myTopicConsumer;

    @Autowired
    public KafkaController(KafkaTemplate<String, Student> template, MyTopicConsumer myTopicConsumer) {
        this.template = template;
        this.myTopicConsumer = myTopicConsumer;
    }

    @PostMapping("/kafka/produce")
    public void produce(@RequestBody Student student) {
        template.send("myTopic", student);
    }

    @GetMapping("/kafka/messages")
    public List<String> getMessages() {
        return myTopicConsumer.getMessages();
    }
}
