package edu.uniritter.classificados.dao;

import edu.uniritter.classificados.domain.Region;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Rodrigo
 */
@Dependent
public class RegionDAO {

    @PersistenceContext(unitName = "Classificados")
    private EntityManager em;
    
    public List<Region> listRegionsByCountry(Long countryId) {
        TypedQuery<Region> query = em.createQuery(
                "Select r From Region r Where r.country.id = :countryId Order By r.name", Region.class);
        
        query.setParameter("countryId", countryId);

        return query.getResultList();
    }

    public Long createRegion(Region region) {
        em.persist(region);
        
        //TODO retornar o id da região criada
        return -1L;
    }
}
