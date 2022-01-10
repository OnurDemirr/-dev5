package Entities.concretes;

import Entities.abstracts.Entities;

public class Product implements Entities {
	
	String firtName;
	String lastName;
	String email;
	String parola;
	
	public Product(String firtName, String lastName, String email, String parola) {
		super();
		this.firtName = firtName;
		this.lastName = lastName;
		this.email = email;
		this.parola = parola;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
	
	

}
