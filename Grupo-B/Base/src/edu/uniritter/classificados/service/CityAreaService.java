package edu.uniritter.classificados.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import edu.uniritter.classificados.dao.CityAreaDAO;
import edu.uniritter.classificados.domain.CityArea;
import edu.uniritter.classificados.dto.CityAreaDTO;

@Stateless
public class CityAreaService {
	
	@Inject
	CityAreaDAO cityAreaDAO;
	
	public List<CityAreaDTO> listCityAreasByCity(Long cityId) {
		List<CityArea> entities = cityAreaDAO.listCityAreasByCity(cityId);		
		return CityAreaDTO.convertList(entities);
	}
	
	
}
