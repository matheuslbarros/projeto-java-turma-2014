package edu.uniritter.classificados.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import edu.uniritter.classificados.domain.City;
import edu.uniritter.classificados.domain.Item;

public class ItemDAO {

	@PersistenceContext(unitName="Classificados")
	private EntityManager em;

	public List<Item> listAllItems() {
		TypedQuery<Item> query = em.createQuery(
				"select i from Item i ", Item.class);
		
		return query.getResultList();
	}
	
	public Long save(Item item){
		em.persist(item);
		return item.getId();
	}
	
	public void update(Item item){
		em.merge(item);
	}
	
	public void delete(Item item){
		em.remove(item);
	}
	
}
