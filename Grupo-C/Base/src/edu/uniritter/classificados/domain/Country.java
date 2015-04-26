package edu.uniritter.classificados.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	
	@Id
	@GeneratedValue
	@Column(name="COUNTRY_ID")
	private Long id;
	
	@Column(name="COUNTRY_NAME")
	private String name;
	
	@OneToMany(mappedBy="country")
	private Set<Region> regions;
	
	public Country() {
	}
	
	public Country(Long id) {
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

	public Set<Region> getRegions() {
		return regions;
	}

	public void setRegions(Set<Region> regions) {
		this.regions = regions;
	}
	

}
