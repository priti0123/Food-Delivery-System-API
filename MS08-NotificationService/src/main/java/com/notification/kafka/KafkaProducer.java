package com.notification.kafka;


import com.notification.entity.Notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

 private static final String TOPIC = "order-notification";

      @Autowired
       private static   KafkaTemplate<String, Notification> kafkaTemplate;

       public void sendNotification(Notification notification){
                kafkaTemplate.send(TOPIC, notification);
       }
}