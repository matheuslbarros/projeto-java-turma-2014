package edu.uniritter.classificados.dao;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import edu.uniritter.classificados.domain.City;
import edu.uniritter.classificados.domain.Country;

@Dependent
public class CityDAO {
	
	@PersistenceContext(unitName="Classificados")
	private EntityManager em;
	
	public List<City> listCitiesByCountry(Long countryId) {
		
		TypedQuery<City> query = em.createQuery(
				//"select c from City c where c.country.countryId = :countryId", 
				"select c from City c ", 
				City.class);
		
		//query.setParameter("countryId", countryId);
		
		List<City> cities = query.getResultList();
		
		return cities;
		
	}

	public List<City> listAllCities() {
		TypedQuery<City> query = em.createQuery(
				"select c from City c ", City.class);
		
		return query.getResultList();
	}
	
	public Long save(City city){
		em.persist(city);
		return city.getId();
	}
	
	public void update(City city){
		em.merge(city);
	}
	
	public void delete(City city){
		em.remove(city);
	}
	
}
