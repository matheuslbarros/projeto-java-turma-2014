package edu.uniritter.classificados.dao;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import edu.uniritter.classificados.domain.City;
import edu.uniritter.classificados.domain.Country;

@Dependent
public class CountryDAO {

	@PersistenceContext(unitName="Classificados")
	private EntityManager em;
	
	public List<Country> listAllCountry() {
		TypedQuery<Country> query = em.createQuery(
				"select c from Country c ", Country.class);
		
		return query.getResultList();
	}
	
	public Country load(Long id){
		return em.find(Country.class, id);
	}
	
	public Long save(Country country){
		em.persist(country);
		return country.getId();
	}
	
	public void update(Country country){
		em.merge(country);
	}
	
	public void delete(Country country){
		em.remove(country);
	}
}
