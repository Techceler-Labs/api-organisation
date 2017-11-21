package com.techceler.api.organisation.model;

import java.util.List;

public class Organisation {

	private String name;
	private String address;
	private String city;
	private String country;
	private String postcode;
	
	private List<Branch> branches;
	
	public Organisation(final String name,final String address,final String city,final String country) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.country = country;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(final List<Branch> branches) {
		this.branches = branches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(final String postcode) {
		this.postcode = postcode;
	}
	
	
}
