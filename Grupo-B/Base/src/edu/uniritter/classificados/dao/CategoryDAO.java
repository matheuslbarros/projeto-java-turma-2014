package edu.uniritter.classificados.dao;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import edu.uniritter.classificados.domain.Category;

@Dependent
public class CategoryDAO {
	
	@PersistenceContext(unitName="Classificados")
	private EntityManager em;

	public List<Category> listAllCategories() {
		TypedQuery<Category> query = em.createQuery(
				"select c from Category c ", Category.class);
		
		return query.getResultList();
	}
	
	
}
