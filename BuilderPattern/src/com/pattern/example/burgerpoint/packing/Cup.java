package com.pattern.example.burgerpoint.packing;

import com.pattern.example.burgerpoint.blueprints.Packing;

public class Cup implements Packing {

	@Override
	public String getPacking() {
		return "Cup";
	}

}
