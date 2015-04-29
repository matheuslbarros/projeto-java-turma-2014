package edu.uniritter.classificados.service;

import edu.uniritter.classificados.dao.CountryDAO;
import edu.uniritter.classificados.domain.Country;
import edu.uniritter.classificados.dto.CountryDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Rodrigo
 */
@Stateless
public class CountryService {

    @Inject
    private CountryDAO countryDAO;
    
    public List<CountryDTO> listAllCountries() {
        List<Country> entities = countryDAO.listAllCountries();
        
        List<CountryDTO> countriesDTO = new ArrayList<CountryDTO>();
        for(Country country : entities) {
            CountryDTO dto = new CountryDTO();
            dto.setId(country.getId());
            dto.setName(country.getName());
            
            countriesDTO.add(dto);
        }
        return countriesDTO;
    }
}
