package com.examples.pattern;

public class Main {
	/**
	 * Factory pattern is used when we need to have multiple similar functioning
	 * objects with concrete differences.
	 * 
	 * eg: a notification system with multiple delivery types
	 * like email notification, sms notification, push notification etc.
	 * Here all the notification systems are trying to do similar functionality
	 * of sending notifications to the end-user. But, they will have different implementation
	 * strategies to do so. That is why this is a perfect candidate for factory pattern
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Notification smsNotification = 
				new NotificationFactory().createNotification(NotificationType.SMS);
		Notification emailNotification = 
				new NotificationFactory().createNotification(NotificationType.EMAIL);
		Notification pushNotification = 
				new NotificationFactory().createNotification(NotificationType.PUSH);
		
		smsNotification.sendNotification();
		emailNotification.sendNotification();
		pushNotification.sendNotification();
	}
}
