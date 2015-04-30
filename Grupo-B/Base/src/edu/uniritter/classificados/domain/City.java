package edu.uniritter.classificados.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class City {
	
	@Id
	@Column(name="CITY_ID")
	private Long id;
	
	@Column(name="CITY_NAME")
	private String name;
	private transient Region region;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="COUNTRY_ID")
	private Country country;
		
	@OneToMany(mappedBy="city")
	private Set<CityArea> areas;
	
	public City() {
	}
	
	public City(Long id) {
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

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Set<CityArea> getAreas() {
		return areas;
	}

	public void setAreas(Set<CityArea> areas) {
		this.areas = areas;
	}
	
	
}
