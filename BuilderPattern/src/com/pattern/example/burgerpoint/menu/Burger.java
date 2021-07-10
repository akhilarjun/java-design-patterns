package com.pattern.example.burgerpoint.menu;

import java.util.Arrays;

import com.pattern.example.burgerpoint.blueprints.Item;
import com.pattern.example.burgerpoint.blueprints.Packing;
import com.pattern.example.burgerpoint.menu.options.PattyType;
import com.pattern.example.burgerpoint.menu.options.Toppings;
import com.pattern.example.burgerpoint.packing.PaperWrap;

public class Burger implements Item {
	
	private int price;
	private PattyType patty;
	private Toppings[] toppings;

	@Override
	public Packing pack() {
		return new PaperWrap();
	}

	@Override
	public int getPrice() {
		return price;
	};
	
	public Burger (int price, PattyType patty, Toppings[] toppings) {
		this.price = price;
		this.patty = patty;
		this.toppings = toppings;
	}
	
	@Override
	public String toString() {
		return patty + " Burger with " + Arrays.toString(toppings) + " topings"
				+ " packed in a " + pack().getPacking()
				+ "\nCost: " + price + "Rs";
	}
	
	public static class Builder {
		private int price = 0;
		private PattyType patty;
		private Toppings[] toppings;
		
		public Builder preparePatty(PattyType patty) {
			this.patty = patty;
			return this;
		}
		
		public Builder prepareToppings(Toppings[] toppings) {
			this.toppings = toppings;
			return this;
		}
		
		public Burger prepare() {
			if (null == patty) {
				patty = PattyType.VEG;
			}
			switch(patty) {
			case VEG:
				price += 50;
				break;
			case CHICKEN:
				price += 90;
				break;
			case DOUBLE_CHICKEN:
				price += 180;
				break;
			case ZINGER_CHICKEN:
				price += 120;
				break;
			case ZINGER_VEG:
				price += 80;
				break;
			}
			if (null != toppings && toppings.length > 0) {
				price += toppings.length * 20;
			}
			return new Burger (price, patty, toppings);
		}
	}

}
