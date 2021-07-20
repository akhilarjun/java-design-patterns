package com.pattern;

import com.pattern.example.burgerpoint.Menu;
import com.pattern.example.burgerpoint.menu.options.DrinkType;
import com.pattern.example.burgerpoint.menu.options.FriesType;
import com.pattern.example.burgerpoint.menu.options.PattyType;
import com.pattern.example.burgerpoint.menu.options.Toppings;

public class Main {
	
	/**
	 * Builder pattern is used when a set of complex objects
	 * are to be created using varying levels of configurations and parameters.
	 * 
	 * We could use factory pattern to achieve this result, but the number of
	 * subclasses will increase with each variation of product.
	 * Also, the number of variables will increase with the new varieties being added.
	 * 
	 * Builder pattern will allow us to take a step-by-step approach
	 * in building complex objects using simple steps.
	 * 
	 * We can take it to next level using a director which will dictate what
	 * each builder does and the end-user does not have to worry about knowing
	 * exact steps required to build the end product.
	 *
	 */
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		
		menu.prepareHappyMealVeg()
			.prepareZingerMealNonVeg()
			.prepareBurger(PattyType.DOUBLE_CHICKEN, 
				new Toppings[] {Toppings.CHEESE, Toppings.CHEESE, Toppings.ONION, 
						Toppings.LETTUCE, Toppings.PICKLE, Toppings.PICKLE})
			.prepareFries(FriesType.TANDOORI_SPECIAL)
			.prepareFries(FriesType.CLASSIC)
			.prepareDrink(DrinkType.COLD_COFEE)
			.prepareDrink(DrinkType.ESPRESSO);
		
		menu.display();
		
		System.out.println("Total Bill: " + menu.getTotalPrice() + "Rs");
	}
}
