package model;

import java.util.Currency;

public class Box {
	
	private int id;
	
	private Currency money;
	
	private Recipe recipe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Currency getMoney() {
		return money;
	}

	public void setMoney(Currency money) {
		this.money = money;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public Box(int id, Currency money, Recipe recipe) {
		this.id = id;
		this.money = money;
		this.recipe = recipe;
	}

	public Box() {
	}

}
