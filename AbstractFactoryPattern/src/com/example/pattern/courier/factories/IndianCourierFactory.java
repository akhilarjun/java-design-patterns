package com.example.pattern.courier.factories;

import com.example.pattern.courier.constants.TransportType;
import com.example.pattern.courier.transports.AirTransport;
import com.example.pattern.courier.transports.RoadTransport;
import com.example.pattern.courier.transports.Transport;

public class IndianCourierFactory {
	public static void deliverProduct(TransportType type, String item) {
		Transport transport;
		switch(type) {
		case AIR:
			transport = new AirTransport();
			break;
		case SEA:
			System.out.println("Sorry Sea transport is not valid for Indian Location");
			transport = null;
			break;
		case ROAD:
		default:
			transport = new RoadTransport();
			break;
		}
		if (null != transport) {
			System.out.println("Thank you, for using Indian Couriers");
			transport.deliver(item);
		}
	}
}
