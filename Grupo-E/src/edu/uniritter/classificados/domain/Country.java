package edu.uniritter.classificados.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Country implements Serializable {
	
	   
	private static final long serialVersionUID = 1L;
	
        @Id
	@Column(name="COUNTRY_ID")
	private Long id;
	
        @Column(name="COUNTRY_NAME")
	private String name;
	
        //TODO por enquanto fica transiente
        @Transient
        private Set<Region> regions; //VERIFICAR
           
        
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
