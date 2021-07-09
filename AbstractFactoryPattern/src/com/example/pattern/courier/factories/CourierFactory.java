package com.example.pattern.courier.factories;

import com.example.pattern.courier.constants.Location;
import com.example.pattern.courier.constants.TransportType;

public class CourierFactory {
	public static void deliverProduct(TransportType type, Location location, String item) {
		switch(location) {
		case INDIA:
			IndianCourierFactory.deliverProduct(type, item);
			break;
		default:
			InternationalCourierFactory.deliverProduct(type, item);
			break;
		}
	 }
}
