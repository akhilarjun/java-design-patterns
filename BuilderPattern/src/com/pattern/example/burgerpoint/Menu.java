package com.pattern.example.burgerpoint;

import com.pattern.example.burgerpoint.blueprints.Meal;
import com.pattern.example.burgerpoint.menu.Burger;
import com.pattern.example.burgerpoint.menu.Drink;
import com.pattern.example.burgerpoint.menu.Fries;
import com.pattern.example.burgerpoint.menu.options.DrinkType;
import com.pattern.example.burgerpoint.menu.options.FriesType;
import com.pattern.example.burgerpoint.menu.options.PattyType;
import com.pattern.example.burgerpoint.menu.options.Toppings;

/**
 * 
 * This class will act as our Director Class
 * 
 * @author Akhil Arjun
 *
 */

public class Menu {
	
	private int totalPrice = 0;
	
	public int getTotalPrice() {
		return totalPrice;
	}
	
	public Meal prepareHappyMealVeg() {
		Burger burger = new Burger.Builder()
							.preparePatty(PattyType.VEG)
							.prepareToppings(new Toppings[] {Toppings.ONION, Toppings.CHEESE, Toppings.LETTUCE})
							.prepare();
		Drink drink = new Drink.Builder()
							.prepare();
		Fries fries = new Fries.Builder()
							.prepare();
		Meal happyMeal = new Meal();
		happyMeal.addItem(burger);
		happyMeal.addItem(drink);
		happyMeal.addItem(fries);
		totalPrice += happyMeal.getPrice();
		return happyMeal;
	}
	
	public Meal prepareHappyMealNonVeg() {
		Burger burger = new Burger.Builder()
							.preparePatty(PattyType.CHICKEN)
							.prepareToppings(new Toppings[] {Toppings.ONION, Toppings.CHEESE, Toppings.LETTUCE})
							.prepare();
		Drink drink = new Drink.Builder()
							.prepare();
		Fries fries = new Fries.Builder()
							.prepare();
		Meal happyMeal = new Meal();
		happyMeal.addItem(burger);
		happyMeal.addItem(drink);
		happyMeal.addItem(fries);
		totalPrice += happyMeal.getPrice();
		return happyMeal;
	}
	
	public Meal prepareZingerMealVeg() {
		Burger burger = new Burger.Builder()
							.preparePatty(PattyType.ZINGER_VEG)
							.prepareToppings(new Toppings[] {Toppings.ONION, Toppings.CHEESE, Toppings.LETTUCE})
							.prepare();
		Drink drink = new Drink.Builder()
							.prepare();
		Fries fries = new Fries.Builder()
							.prepare();
		Meal zingerMeal = new Meal();
		zingerMeal.addItem(burger);
		zingerMeal.addItem(drink);
		zingerMeal.addItem(fries);
		totalPrice += zingerMeal.getPrice();
		return zingerMeal;
	}
	
	public Meal prepareZingerMealNonVeg() {
		Burger burger = new Burger.Builder()
							.preparePatty(PattyType.ZINGER_CHICKEN)
							.prepareToppings(new Toppings[] {Toppings.ONION, Toppings.CHEESE, Toppings.LETTUCE})
							.prepare();
		Drink drink = new Drink.Builder()
							.prepare();
		Fries fries = new Fries.Builder()
							.prepare();
		Meal zingerMeal = new Meal();
		zingerMeal.addItem(burger);
		zingerMeal.addItem(drink);
		zingerMeal.addItem(fries);
		totalPrice += zingerMeal.getPrice();
		return zingerMeal;
	}
	
	public Meal prepareDrink(DrinkType type) {
		Meal drink = new Meal();
		drink.addItem(new Drink.Builder().prepare(type));
		totalPrice += drink.getPrice();
		return drink;
	}
	
	public Meal prepareBurger(PattyType type, Toppings[] toppings) {
		Meal burger = new Meal();
		burger.addItem(new Burger.Builder().preparePatty(type).prepareToppings(toppings).prepare());
		totalPrice += burger.getPrice();
		return burger;
	}
	
	public Meal prepareFries(FriesType type) {
		Meal fries = new Meal();
		fries.addItem(new Fries.Builder().prepare(type));
		totalPrice += fries.getPrice();
		return fries;
	}
}
