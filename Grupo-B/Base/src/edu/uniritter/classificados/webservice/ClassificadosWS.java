package edu.uniritter.classificados.webservice;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebService;

import edu.uniritter.classificados.dto.CategoryDTO;
import edu.uniritter.classificados.dto.CityAreaDTO;
import edu.uniritter.classificados.dto.CityDTO;
import edu.uniritter.classificados.dto.CountryDTO;
import edu.uniritter.classificados.dto.ItemCommentDTO;
import edu.uniritter.classificados.dto.ItemDTO;
import edu.uniritter.classificados.dto.LocationDTO;
import edu.uniritter.classificados.dto.RegionDTO;
import edu.uniritter.classificados.dto.UserDTO;
import edu.uniritter.classificados.service.CategoryService;
import edu.uniritter.classificados.service.CityAreaService;
import edu.uniritter.classificados.service.CityService;

@WebService
public class ClassificadosWS {
	
	@EJB
	CityService cityService;
	
	@EJB
	CategoryService categoryService;
	
	@EJB
	CityAreaService cityAreaService;
	
	// Seguir o padrao.
	//
	//@EJB
	//CountryService countryService;
	//
	// etc...
	
	
	/* CITY */
	
	//Lista todas as cidades
	public List<CityDTO> listAllCities() {
		return cityService.listAllCities();
	}
	
	public List<CityDTO> listCitiesByCountry(Long countryId) {
		return cityService.listCitiesByCountry(countryId);
	}
	
	public Long createCity(CityDTO city) {
		//TODO Implementar
		return null;
	}
	
	/* COUNTRY */
	
	public List<CountryDTO> listCountries() {
		//TODO Implementar
		return null;
	}
	
	/* CITYAREA */
	
	public List<CityAreaDTO> listCityAreasByCity(Long cityId) {
		return cityAreaService.listCityAreasByCity(cityId);
	}
	
	/* REGION */
	
	public List<RegionDTO> listRegionsByCountry(Long countryId) {
		//TODO Implementar
		return null;
	}
	
	public Long createRegion(RegionDTO region) {
		//TODO Implementar
		return null;
	}
	
	/* LOCATION */
	
	public Long createLocation(LocationDTO location) {
		//TODO Implementar
		return null;
	}
	
	public List<LocationDTO> listLocationsByUser(Long userId) {
		//TODO Implementar
		return null;
	}
	
	/* ITEM */
	public Long createItem(ItemDTO item) {
		//TODO Implementar
		return null;
	}
	
	public Long updateItem(ItemDTO item) {
		//TODO Implementar
		return null;
	}
	
	public List<ItemDTO> listItemsByCategory(Long categoryId) {
		//TODO Implementar
		return null;
	}
	
	public List<ItemDTO> listItemsByUser(Long userId) {
		//TODO Implementar
		return null;
	}
	
	public Long deactivateItem(ItemDTO item) {
		//TODO Implementar
		return null;
	}
	
	/* CATEGORY */
	
	//Lista todas as categorias
	public List<CategoryDTO> listCategories() {
		return categoryService.listAllCategories();
	}
	
	public Long createCategory(CategoryDTO category) {
		//TODO Implementar
		return null;
	}
	
	public Long deactivateCategory(CategoryDTO category) {
		//TODO Implementar
		return null;
	}
	
	/* ITEMCOMMENT */
	public Long addCommentToItem(ItemCommentDTO comment) {
		//TODO Implementar
		return null;
	}
	
	public List<ItemCommentDTO> listCommentsByItem(Long itemId) {
		//TODO Implementar
		return null;
	}
	
	/* USER */
	
	public UserDTO findUserById(Long id) {
		//TODO Implementar
		return null;
	}
	
	public UserDTO findUserByUsername(String username) {
		//TODO Implementar
		return null;
	}
	
	public Long createUser(UserDTO user) {
		//TODO Implementar
		return null;
	}
	
}
