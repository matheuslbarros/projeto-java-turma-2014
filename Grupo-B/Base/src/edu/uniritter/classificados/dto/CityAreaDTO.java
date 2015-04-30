package edu.uniritter.classificados.dto;

import java.util.ArrayList;
import java.util.List;

import edu.uniritter.classificados.domain.CityArea;

public class CityAreaDTO {
	
	private Long id;
	private String name;
	private Long cityId;
	private String cityName;
	
	public static List<CityAreaDTO> convertList(List<CityArea> entities) {
		List<CityAreaDTO> dtos = new ArrayList<CityAreaDTO>();
		
		for (CityArea entity : entities) {
			dtos.add(new CityAreaDTO(entity));
		}
		
		return dtos;
	}
	
	public CityAreaDTO() {
	}
	
	public CityAreaDTO(CityArea entity) {
		
		this.id = entity.getId();
		this.cityName = entity.getCity().getName();
		this.name = entity.getName();
		
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

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
}
