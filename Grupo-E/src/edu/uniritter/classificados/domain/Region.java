package edu.uniritter.classificados.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Region implements Serializable {
	
        @Id
	@Column(name="REGION_ID")
	private Long id;
        
        @Column(name="REGION_NAME")
	private String name;
        
        @ManyToOne
	@JoinColumn(name="COUNTRY_ID")
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
