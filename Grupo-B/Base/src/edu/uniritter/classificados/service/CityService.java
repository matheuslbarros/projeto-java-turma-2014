package edu.uniritter.classificados.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import edu.uniritter.classificados.dao.CityDAO;
import edu.uniritter.classificados.domain.City;
import edu.uniritter.classificados.dto.CityDTO;

@Stateless
public class CityService {
	
	@Inject
	CityDAO cityDAO;
	
	public List<CityDTO> listCitiesByCountry(Long countryId) {
		
		List<City> entities = cityDAO.listCitiesByCountry(countryId);
		
		return CityDTO.convertList(entities);
	}

	public List<CityDTO> listAllCities() {
		List<City> entities = cityDAO.listAllCities();
		
		return CityDTO.convertList(entities);
	}
	
	
}
