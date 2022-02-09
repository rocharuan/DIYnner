package model;

import java.math.BigDecimal;

public class Ingredient {
	
	private int id;
	
	private String name;
	
	private BigDecimal price;
	
	private float quantity;
	
	private String metric;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}
	
	public Ingredient(int id, String name, BigDecimal price, float quantity, String metric) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.metric = metric;
	}

	public Ingredient() {
	}

}
