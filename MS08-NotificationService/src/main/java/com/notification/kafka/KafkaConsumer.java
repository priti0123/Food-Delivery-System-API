package com.notification.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.notification.entity.Notification;
import com.notification.service.INotificationService;

@Service
public class KafkaConsumer {

	  @Autowired
      private  static INotificationService notificationService;

     @KafkaListener(topics = "order-notification", groupId = "notification-group")
     public void consume(Notification notification){
                notificationService.processNotification(notification);
      }
}
