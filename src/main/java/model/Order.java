package model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public class Order {
	
	private int id;
	
	private List<Ingredient> ingredients;
	
	private Payment payment;
	
	private Address address;
	
	private BigDecimal total_price;
	
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BigDecimal getTotal_price() {
		return total_price;
	}

	public void setTotal_price(BigDecimal total_price) {
		this.total_price = total_price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Order(int id, List<Ingredient> ingredients, Payment payment, Address address, BigDecimal total_price,
			Date date) {
		this.id = id;
		this.ingredients = ingredients;
		this.payment = payment;
		this.address = address;
		this.total_price = total_price;
		this.date = date;
	}

	public Order() {
	}
	
}
