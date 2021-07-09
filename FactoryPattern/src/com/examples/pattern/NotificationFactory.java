package com.examples.pattern;

public class NotificationFactory {
	public Notification createNotification(NotificationType type) {
		Notification notification;
		switch(type) {
		case EMAIL:
			notification = new EMailNotification();
			break;
		case PUSH:
			notification = new PushNotification();
			break;
		case SMS:
			default:
			notification = new SMSNotification();
			break;
		}
		return notification;
	}
}
