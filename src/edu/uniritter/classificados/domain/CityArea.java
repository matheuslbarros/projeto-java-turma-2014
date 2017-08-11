package edu.uniritter.classificados.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CITY_AREA")
public class CityArea implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3689724238847438328L;

	@Id
	@Column(name = "CITY_AREA_ID")
	private Long id;

	@Column(name = "CITY_AREA_NAME")
	private String name;

	@ManyToOne
	@JoinColumn(name = "CITY_ID")
	private City city;

	public CityArea() {
	}

	public CityArea(Long id) {
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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
