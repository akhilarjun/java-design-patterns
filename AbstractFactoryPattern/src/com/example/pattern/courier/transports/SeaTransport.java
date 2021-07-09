package com.example.pattern.courier.transports;

public class SeaTransport implements Transport {

	@Override
	public void deliver(String item) {
		System.out.println("Delivering " + item + " by SEA!");
	}

}
