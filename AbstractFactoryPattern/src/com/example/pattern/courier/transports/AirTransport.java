package com.example.pattern.courier.transports;

public class AirTransport implements Transport {

	@Override
	public void deliver(String item) {
		System.out.println("Delivering " + item + " by AIR!");
	}

}
