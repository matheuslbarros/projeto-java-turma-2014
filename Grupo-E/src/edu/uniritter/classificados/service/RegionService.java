package edu.uniritter.classificados.service;

import edu.uniritter.classificados.dao.RegionDAO;
import edu.uniritter.classificados.domain.Country;
import edu.uniritter.classificados.domain.Region;
import edu.uniritter.classificados.dto.RegionDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Rodrigo
 */
@Stateless
public class RegionService {

    @Inject
    private RegionDAO regionDAO;
    
    public List<RegionDTO> listRegionsByCountry(Long countryId) {
        List<Region> entities = regionDAO.listRegionsByCountry(countryId);
        
        List<RegionDTO> regionsDTO = new ArrayList<RegionDTO>();
        for(Region region : entities) {
            RegionDTO dto = new RegionDTO();
            dto.setId(region.getId());
            dto.setName(region.getName());
            dto.setCountryId(region.getCountry().getId());
            
            regionsDTO.add(dto);
        }
        
        return regionsDTO;
    }

    public Long createRegion(RegionDTO regionDTO) {
        Region region = new Region();
        region.setName(regionDTO.getName());
        region.setCountry(new Country(regionDTO.getCountryId()));
        
        return regionDAO.createRegion(region);
    }
}
