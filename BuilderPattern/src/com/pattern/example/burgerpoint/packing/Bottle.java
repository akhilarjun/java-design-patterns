package com.pattern.example.burgerpoint.packing;

import com.pattern.example.burgerpoint.blueprints.Packing;

public class Bottle implements Packing {

	@Override
	public String getPacking() {
		return "Bottle";
	}

}
