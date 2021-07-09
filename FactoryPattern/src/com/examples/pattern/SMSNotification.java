package com.examples.pattern;

public class SMSNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("SMS Notification is going out");

	}

	@Override
	public NotificationType getNotificationType() {
		return NotificationType.SMS;
	}

}
