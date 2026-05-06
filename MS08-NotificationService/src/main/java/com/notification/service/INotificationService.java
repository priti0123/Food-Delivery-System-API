package com.notification.service;

import com.notification.entity.Notification;

public interface INotificationService {

	void processNotification(Notification notification);
	public String sendNotificationToEmail(String msg, String email) throws Exception;

}
