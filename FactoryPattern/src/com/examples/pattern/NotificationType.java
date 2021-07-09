package com.examples.pattern;

/**
 * 
 * It is best practice to use a enum as a differentiating factor
 * between different factory implementations. As they tend to reduce the 
 * mistakes which we might face while using simple string params
 * 
 * @author Akhil Arjun
 *
 */
public enum NotificationType {
	SMS, EMAIL, PUSH
}
