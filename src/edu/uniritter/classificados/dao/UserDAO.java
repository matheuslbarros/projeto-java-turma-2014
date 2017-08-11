package edu.uniritter.classificados.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import edu.uniritter.classificados.domain.City;
import edu.uniritter.classificados.domain.User;

public class UserDAO {
	
	@PersistenceContext(unitName="Classificados")
	private EntityManager em;

	public List<User> listAllUsers() {
		TypedQuery<User> query = em.createQuery(
				"select u from User u ", User.class);
		
		return query.getResultList();
	}
	
	public Long save(User user){
		em.persist(user);
		return user.getId();
	}
	
	public void update(User user){
		em.merge(user);
	}
	
	public void delete(User user){
		em.remove(user);
	}

}
