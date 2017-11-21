package com.techceler.api.organisation.model;

import java.util.List;

public class Branch {
	
	private String name;
	private String code;
	private String description;
	private String address;
	private Location location;
	private String region;
	private String city;
	private String country;
	private String postcode;
	private List<OpeningTime> openingtiming;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public List<OpeningTime> getOpeningtiming() {
		return openingtiming;
	}
	public void setOpeningtiming(List<OpeningTime> openingtiming) {
		this.openingtiming = openingtiming;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
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
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

}
