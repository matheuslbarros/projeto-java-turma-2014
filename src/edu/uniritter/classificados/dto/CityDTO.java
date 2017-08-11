package edu.uniritter.classificados.dto;

import java.util.ArrayList;
import java.util.List;

import edu.uniritter.classificados.domain.City;

public class CityDTO {

	private Long id;
	private String name;
	private String regionName;
	private String countryName;

	public static List<CityDTO> convertList(List<City> entities) {
		List<CityDTO> dtos = new ArrayList<CityDTO>();
		
		for (City entity : entities) {
			dtos.add(new CityDTO(entity));
		}
		
		return dtos;
	}
	
	public CityDTO() {
	}
	
	public CityDTO(City entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.regionName = entity.getRegion() != null ? entity.getRegion().getName() : "";
		this.countryName = entity.getCountry() != null ? entity.getCountry().getName() : "";
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

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
