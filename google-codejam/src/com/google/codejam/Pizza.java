package com.google.codejam;

import java.util.HashSet;
import java.util.Set;
public class Pizza  implements Comparable<Pizza>{
	
	int nbr;
	Set<String> ingredients;

	public Pizza(int nbr, String... i) {
		this.nbr = nbr;
		ingredients = new HashSet<>();
		for (String x : i)
			ingredients.add(x);
	}
	
	@Override
	public String toString() {
		return "Pizza [nbr=" + nbr + ", ingredients=" + ingredients + "]";
	}



	
	@Override
	public int compareTo(Pizza other) {
		return other.ingredients.size() -this.ingredients.size();
	}

}
