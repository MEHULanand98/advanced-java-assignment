package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class Customer {
	private int id;
	private String name;
	private String email;
	private long phoneno;
	private String address;

	public Customer() {}

	public Customer(int id, String name, String email, long phoneno, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.address = address;
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

	public final long getPhoneno() {
		return phoneno;
	}

	public final void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public final String getAddress() {
		return address;
	}

	public final void setAddress(String address) {
		this.address = address;
	}
	
}


