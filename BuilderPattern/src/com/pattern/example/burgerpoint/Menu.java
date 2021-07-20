package com.pattern.example.burgerpoint;

import java.util.ArrayList;
import java.util.List;

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
	
	private List<Meal> meals = new ArrayList<>();
	
	public int getTotalPrice() {
		return totalPrice;
	}
	
	public void display() {
		if(!meals.isEmpty()) {
			meals.forEach(meal -> meal.display());
		} else {
			System.out.println("Menu is blank! Prepare items first.");
		}
	}
	
	public List<Meal> getMeals() {
		return meals;
	}
	
	public void clear() {
		meals = new ArrayList<>();
	}
	
	public Menu prepareHappyMealVeg() {
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
		meals.add(happyMeal);
		totalPrice += happyMeal.getPrice();
		return this;
	}
	
	public Menu prepareHappyMealNonVeg() {
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
		meals.add(happyMeal);
		totalPrice += happyMeal.getPrice();
		return this;
	}
	
	public Menu prepareZingerMealVeg() {
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
		meals.add(zingerMeal);
		totalPrice += zingerMeal.getPrice();
		return this;
	}
	
	public Menu prepareZingerMealNonVeg() {
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
		meals.add(zingerMeal);
		totalPrice += zingerMeal.getPrice();
		return this;
	}
	
	public Menu prepareDrink(DrinkType type) {
		Meal drink = new Meal();
		drink.addItem(new Drink.Builder().prepare(type));
		meals.add(drink);
		totalPrice += drink.getPrice();
		return this;
	}
	
	public Menu prepareBurger(PattyType type, Toppings[] toppings) {
		Meal burger = new Meal();
		burger.addItem(new Burger.Builder().preparePatty(type).prepareToppings(toppings).prepare());
		meals.add(burger);
		totalPrice += burger.getPrice();
		return this;
	}
	
	public Menu prepareFries(FriesType type) {
		Meal fries = new Meal();
		fries.addItem(new Fries.Builder().prepare(type));
		meals.add(fries);
		totalPrice += fries.getPrice();
		return this;
	}
}
