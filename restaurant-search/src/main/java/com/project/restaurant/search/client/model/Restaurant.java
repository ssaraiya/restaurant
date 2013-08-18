package com.project.restaurant.search.client.model;

public class Restaurant {

	private String id;
	private String name;
	private String address;
	private String phoneNumber;
	private String longitude;
	private String latitude;
	private String cuisine;
	private long openTime;
	private long closeTime;
	private String city;
	private String state;
	private String zipcode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public long getOpenTime() {
		return openTime;
	}

	public void setOpenTime(long openTime) {
		this.openTime = openTime;
	}

	public long getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(long closeTime) {
		this.closeTime = closeTime;
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", longitude="
				+ longitude + ", latitude=" + latitude + ", cuisine=" + cuisine
				+ ", openTime=" + openTime + ", closeTime=" + closeTime
				+ ", city=" + city + ", state=" + state + ", zipcode="
				+ zipcode + "]";
	}
}
