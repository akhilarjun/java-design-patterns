package com.pattern.example.burgerpoint.blueprints;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items = new ArrayList<>();
	private int price = 0;
	
	public void addItem(Item item) {
		this.items.add(item);
		price += item.getPrice();
	}
	
	public int getPrice() {
		return price;
	}
	
	public void display() {
		if (null == this.items || this.items.isEmpty()) {
			return;
		}
		this.items.forEach(item -> System.out.println(item));
		if (this.items.size() > 1) {
			System.out.println("Cost for meal: " + getPrice() + "Rs\n");
		} else {
			System.out.println("");
		}
	}
}
