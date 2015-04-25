package edu.uniritter.classificados.service;

import javax.ejb.Stateless;
import javax.jws.WebService;

import edu.uniritter.classificados.domain.User;

@Stateless
@WebService
public class UserService {
	
	public User login(String username, String password) {
		
		System.out.printf("Oba!! [%s/%s]", username, password);
		
		User user = new User();
		user.setEmail("eduardo.bobsin@gmail.com");
		user.setName("Eduardo");
		user.setPassword(password);
		
		return user;
	}
	
}
