package model;

public class Address {
	
	private int id;
	
	private String street;
	
	private String number;
	
	private String complement;
	
	private int cep;
	
	private String neighborhood;
	
	private String city;
	
	private String state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address(int id, String street, String number, String complement, int cep, String neighborhood, String city,
			String state) {
		this.id = id;
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.cep = cep;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
	}

	public Address() {
	}
}
