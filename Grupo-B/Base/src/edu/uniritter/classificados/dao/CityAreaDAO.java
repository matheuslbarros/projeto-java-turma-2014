package edu.uniritter.classificados.dao;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import edu.uniritter.classificados.domain.CityArea;

@Dependent
public class CityAreaDAO {
	
	@PersistenceContext(unitName="Classificados")
	private EntityManager em;
	
	public List<CityArea> listCityAreasByCity(Long cityId) {
		
		TypedQuery<CityArea> query = em.createQuery(
				
				//traz todas os bairros, colocar filtro aqui
				"select ca from CityArea ca", CityArea.class);
		
	    return query.getResultList();
		
	}
	
}
