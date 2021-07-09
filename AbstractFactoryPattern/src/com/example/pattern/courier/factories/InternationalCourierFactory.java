package com.example.pattern.courier.factories;

import com.example.pattern.courier.constants.TransportType;
import com.example.pattern.courier.transports.AirTransport;
import com.example.pattern.courier.transports.SeaTransport;
import com.example.pattern.courier.transports.Transport;

public class InternationalCourierFactory {
	public static void deliverProduct(TransportType type, String item) {
		Transport transport;
		switch(type) {
		case AIR:
			transport = new AirTransport();
			break;
		case SEA:
			transport = new SeaTransport();
			break;
		case ROAD:
		default:
			transport = null;
			System.out.println("Sorry Road transport is not valid for International Location");
			break;
		}
		if (null != transport) {
			System.out.println("Thank you, for using International Couriers");
			transport.deliver(item);
		}
	}
}
