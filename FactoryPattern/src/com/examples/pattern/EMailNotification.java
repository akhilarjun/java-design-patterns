package com.examples.pattern;

public class EMailNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("E-Mail Notification is going out");

	}

	@Override
	public NotificationType getNotificationType() {
		return NotificationType.EMAIL;
	}

}
