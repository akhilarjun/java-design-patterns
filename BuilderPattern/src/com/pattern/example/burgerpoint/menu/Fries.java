package com.pattern.example.burgerpoint.menu;

import com.pattern.example.burgerpoint.blueprints.Item;
import com.pattern.example.burgerpoint.blueprints.Packing;
import com.pattern.example.burgerpoint.menu.options.FriesType;
import com.pattern.example.burgerpoint.packing.PaperWrap;

public class Fries implements Item{
	
	private int price;
	private FriesType type;

	@Override
	public Packing pack() {
		return new PaperWrap();
	}

	@Override
	public int getPrice() {
		return price;
	}
	
	public Fries(FriesType type,int price) {
		this.price = price;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type + " Fries in a " + pack().getPacking()
				+ "\nCost: " + price + "Rs";
	}
	
	public static class Builder {
		private int price = 0;
		
		public Fries prepare(FriesType type) {
			if (null == type) {
				type = FriesType.CLASSIC;
			}
			switch (type) {
			case CLASSIC:
				price += 40;
				break;
			case CHEESY:
				price += 50;
				break;
			case PAPRIKA:
				price +=50;
				break;
			case TANDOORI_SPECIAL:
				price += 60;
			}
			return new Fries(type, price);
		}
		
		public Fries prepare() {
			return prepare(FriesType.CLASSIC);
		}
	}

}
