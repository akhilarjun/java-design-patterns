package com.example.pattern;

import com.example.pattern.courier.constants.Location;
import com.example.pattern.courier.constants.TransportType;
import com.example.pattern.courier.factories.CourierFactory;

public class Main {
	/**
	 * Abstract Factory pattern is similar to factory pattern.
	 * It has an additional layer of abstraction over the factories
	 * depending upon the scenarios/ condition. 
	 * 
	 * This type of pattern is used where the factories generate
	 * products of the similar category but has very little to none functional differences
	 * 
	 * eg: Consider a Courier service which will have different 
	 * delivery options depending upon if it will be a local courier or international courier
	 * 
	 */
	public static void main(String[] args) {
		CourierFactory.deliverProduct(TransportType.SEA, Location.USA, "Mobiles");
		System.out.println("------------------------------------------");
		CourierFactory.deliverProduct(TransportType.SEA, Location.INDIA, "TV");
		System.out.println("------------------------------------------");
		CourierFactory.deliverProduct(TransportType.AIR, Location.INDIA, "Headphones");
		System.out.println("------------------------------------------");
		CourierFactory.deliverProduct(TransportType.ROAD, Location.UK, "Radio");
	}
}
