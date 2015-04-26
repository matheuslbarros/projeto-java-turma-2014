package edu.uniritter.classificados.dao;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import edu.uniritter.classificados.domain.Region;

@Dependent
public class RegionDAO {

	@PersistenceContext(unitName="Classificados")
	private EntityManager em;

	public List<Region> listAllRegions() {
		TypedQuery<Region> query = em.createQuery(
				"select r from Region r ", Region.class);
		
		return query.getResultList();
	}
	
	public Long save(Region region){
		em.persist(region);
		return region.getId();
	}
	
	public void update(Region region){
		em.merge(region);
	}
	
	public void delete(Region region){
		em.remove(region);
	}
	
}
