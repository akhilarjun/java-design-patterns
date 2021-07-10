package com.pattern.example.burgerpoint.menu;

import com.pattern.example.burgerpoint.blueprints.Item;
import com.pattern.example.burgerpoint.blueprints.Packing;
import com.pattern.example.burgerpoint.menu.options.DrinkType;
import com.pattern.example.burgerpoint.packing.Bottle;
import com.pattern.example.burgerpoint.packing.Cup;

public class Drink implements Item{
	
	private int price;
	private DrinkType type;
	private Packing pack;

	@Override
	public Packing pack() {
		return pack;
	}

	@Override
	public int getPrice() {
		return price;
	}
	
	public Drink(DrinkType type, Packing pack, int price) {
		this.type = type;
		this.pack = pack;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "One " + pack().getPacking() + " of " + type
				+ "\nCost: " + price + "Rs";
	}
	
	public static class Builder {
		private int price = 0;
		private Packing pack;
		
		public Drink prepare(DrinkType type) {
			if (null == type) {
				type = DrinkType.COLA;
			}
			switch (type) {
			case COFFEE:
				pack = new Cup();
				price += 40;
				break;
			case COLD_COFEE:
				pack = new Cup();
				price += 70;
				break;
			case COLA:
			case PEPSI:
			case SPRITE:
				pack = new Bottle();
				price += 50;
				break;
			case ESPRESSO:
				pack = new Cup();
				price += 60;
				break;
			case LATTE:
				pack = new Cup();
				price += 90;
				break;
			}
			return new Drink(type, pack, price);
		}
		
		public Drink prepare() {
			return prepare(DrinkType.COLA);
		}
	}

}
