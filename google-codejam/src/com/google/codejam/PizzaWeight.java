package com.google.codejam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PizzaWeight {
	
	LinkedList<Pizza> total_pizza ;
	
	public PizzaWeight() {
		total_pizza = new LinkedList<>();
	}
	
	public void addPizza(int nbr, String... ingredients) {
		total_pizza.add(new Pizza(nbr, ingredients));
	}

	public int cost(Pizza... pizzas) {
		Set<String> common_ingredients = new HashSet<>();
		for (Pizza p : pizzas)
			common_ingredients.addAll(p.ingredients);

		return (common_ingredients.size() * common_ingredients.size());
	}

	
	
	public void sort(){
		Collections.sort(this.total_pizza);
	}
	
	public Pizza getPizza(){
		if(total_pizza.size() == 0) return null;
		return total_pizza.removeLast();
	}
	
	
	public static void main(String args[]){
		PizzaWeight pw =  new PizzaWeight();
		pw.addPizza(0, new String[] {"o","p" ,"ol"});
		pw.addPizza(1, new String[] {"m", "t" ,"b"});
		pw.addPizza(4, new String[] {"c","m" ,"p"});
		pw.addPizza(3, new String[] {"t","m" ,"b"});
		pw.addPizza(4, new String[] {"c","b" });
		
		pw.sort();
		System.out.println(pw.total_pizza);
	}

}
