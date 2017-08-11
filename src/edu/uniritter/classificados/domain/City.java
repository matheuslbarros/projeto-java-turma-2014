package edu.uniritter.classificados.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CITY")
public class City implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8837147211556470665L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CITY_ID")
	private Long id;

	@Column(name = "CITY_NAME")
	private String name;

	@ManyToOne
	@JoinColumn(name = "REGION_ID")
	private Region region;

	@ManyToOne
	@JoinColumn(name = "COUNTRY_ID")
	private Country country;

	@OneToMany(mappedBy = "city")
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
