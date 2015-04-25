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
		return null;
	}

	public List<CityDTO> listAllCities() {
		List<City> entities = cityDAO.listAllCities();
		
		return CityDTO.convertList(entities);
	}
	
	public Long createCity(CityDTO cityDto){
		
		//TODO Salvar Contry
		//TODO Salvar Region
		//TODO Seter o Contry e Region salvados no objeto city
		
		City city = new City();
		city.setName(cityDto.getName());
		
		
		return cityDAO.save(city);
	}
	
	
}
