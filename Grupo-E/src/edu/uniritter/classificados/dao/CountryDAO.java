package edu.uniritter.classificados.dao;

import edu.uniritter.classificados.domain.Country;
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
public class CountryDAO {

    @PersistenceContext(unitName="Classificados")
    private EntityManager em;
    
    public List<Country> listAllCountries() {
        TypedQuery<Country> query = em.createQuery(
                        "Select c From Country c Order By c.name", Country.class);

        return query.getResultList();
    }
}
