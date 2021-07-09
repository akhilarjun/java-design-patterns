package com.examples.pattern;

public class PushNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("Push Notification is going out");

	}

	@Override
	public NotificationType getNotificationType() {
		return NotificationType.PUSH;
	}

}
