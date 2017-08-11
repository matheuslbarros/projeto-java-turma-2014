package edu.uniritter.classificados.domain;

public class Location {
	
	private Long id;
	private String name;
	private User user;
	private Country country;
	private String address;
	private String zipCode;
	private Region region;
	private City city;
	private CityArea cityArea;
	
	public Location() {
	}
	
	public Location(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public CityArea getCityArea() {
		return cityArea;
	}
	public void setCityArea(CityArea cityArea) {
		this.cityArea = cityArea;
	}
	

}
