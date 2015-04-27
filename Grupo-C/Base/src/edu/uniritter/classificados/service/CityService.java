package edu.uniritter.classificados.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import edu.uniritter.classificados.dao.CityDAO;
import edu.uniritter.classificados.dao.CountryDAO;
import edu.uniritter.classificados.dao.RegionDAO;
import edu.uniritter.classificados.domain.City;
import edu.uniritter.classificados.domain.Country;
import edu.uniritter.classificados.domain.Region;
import edu.uniritter.classificados.dto.CityDTO;

@Stateless
public class CityService {
	
	@Inject CityDAO cityDAO;
	@Inject CountryDAO countryDAO;
	@Inject RegionDAO regionDAO;
	
	public List<CityDTO> listCitiesByCountry(Long countryId) {
		return null;
	}

	public List<CityDTO> listAllCities() {
		List<City> entities = cityDAO.listAllCities();
		
		return CityDTO.convertList(entities);
	}
	
	public Long createCity(CityDTO cityDto){
		
		//TODO Antes de criar e salvar um country, verificar se já não exite um com o mesmo nome, se já exitir, buscar e utilizar o mesmo.
		//Cria e salva um Contry.
		Country country = new Country();
		country.setName(cityDto.getCountryName());
		
		countryDAO.save(country);

		//TODO Antes de criar e salvar um region, verificar se já não exite um com o mesmo nome, se já exitir, buscar e utilizar o mesmo.		
		//Cria um region e salva utilizando o contry já criado e já salvo. 
		Region region = new Region();
		region.setCountry(country);
		region.setName(cityDto.getRegionName());
		
		regionDAO.save(region);
		
		//Cria a city e salva a mesma utilizando o contry e a region já criados e salvos. 
		City city = new City();
		city.setName(cityDto.getName());
		city.setCountry(country);
		city.setRegion(region);
		
		cityDAO.save(city);
		
		return city.getId();
	}
	
	
}
