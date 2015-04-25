package edu.uniritter.classificados.domain;

import java.io.Serializable;

public class Region implements Serializable {
	
	private Long id;
	private String name;
	private Country country;
	
	public Region() {
	}
	public Region(Long id) {
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
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}
