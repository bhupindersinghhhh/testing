package com.sirion.bean;

public class Address {
	private int aId;
	private String city;
	private String country;

	public Address() {

	}

	public Address(int aId, String city, String country) {
		super();
		this.aId = aId;
		this.city = city;
		this.country = country;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
