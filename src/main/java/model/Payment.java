package model;

public class Payment {
	
	private int id;
	
	private Order order;
	
	private String name;
	
	private String cc_mode;
	
	private String cc_number;
	
	private String cc_name;
	
	private String cc_valid;
	
	private String cc_security_code;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCc_mode() {
		return cc_mode;
	}

	public void setCc_mode(String cc_mode) {
		this.cc_mode = cc_mode;
	}

	public String getCc_number() {
		return cc_number;
	}

	public void setCc_number(String cc_number) {
		this.cc_number = cc_number;
	}

	public String getCc_name() {
		return cc_name;
	}

	public void setCc_name(String cc_name) {
		this.cc_name = cc_name;
	}

	public String getCc_valid() {
		return cc_valid;
	}

	public void setCc_valid(String cc_valid) {
		this.cc_valid = cc_valid;
	}

	public String getCc_security_code() {
		return cc_security_code;
	}

	public void setCc_security_code(String cc_security_code) {
		this.cc_security_code = cc_security_code;
	}

	public Payment(int id, Order order, String name, String cc_mode, String cc_number, String cc_name, String cc_valid,
			String cc_security_code) {
		this.id = id;
		this.order = order;
		this.name = name;
		this.cc_mode = cc_mode;
		this.cc_number = cc_number;
		this.cc_name = cc_name;
		this.cc_valid = cc_valid;
		this.cc_security_code = cc_security_code;
	}

	public Payment() {
	}

}
