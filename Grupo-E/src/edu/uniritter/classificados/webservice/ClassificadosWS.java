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
import edu.uniritter.classificados.service.CityService;
import edu.uniritter.classificados.service.CountryService;
import edu.uniritter.classificados.service.RegionService;
import java.util.logging.Logger;

@WebService
public class ClassificadosWS {
	
    private static final Logger LOG = Logger.getLogger(ClassificadosWS.class.getName());
    
	@EJB
	private CityService cityService;
        
	@EJB
	private CountryService countryService;
	
	@EJB
        private RegionService regionService;
        
	/* CITY */
	
	public List<CityDTO> listCitiesByCountry(Long countryId) {
		return cityService.listCitiesByCountry(countryId);
	}
	
	public List<CityDTO> listAllCities() {
            List<CityDTO> ret = null;
            try{
		ret = cityService.listAllCities();
            }catch(Exception e){
                e.printStackTrace();
            }
            return ret;
	}
	
	public Long createCity(CityDTO city) {
               
            cityService.createCity(city);
            return new Long(1);
		
	}
	
	/* COUNTRY */
	
	public List<CountryDTO> listCountries() {
            LOG.info("listCountries...");
            return countryService.listAllCountries();
	}
	
	/* CITYAREA */
	
	public List<CityAreaDTO> listCityAreasByCity(Long cityId) {
                //TODO Implementar
                return null;
	}
	
	/* REGION */
	
	public List<RegionDTO> listRegionsByCountry(Long countryId) {
            return regionService.listRegionsByCountry(countryId);
	}
	
	public Long createRegion(RegionDTO region) {
            return regionService.createRegion(region);
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
	
	public List<CategoryDTO> listCategories() {
		//TODO Implementar
		return null;
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
