package edu.uniritter.classificados.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import edu.uniritter.classificados.dao.CategoryDAO;
import edu.uniritter.classificados.domain.Category;
import edu.uniritter.classificados.dto.CategoryDTO;

@Stateless
public class CategoryService {
	
	@Inject
	CategoryDAO categoryDAO;
	
	public List<CategoryDTO> listAllCategories() {
		List<Category> entities = categoryDAO.listAllCategories();
		
		return CategoryDTO.convertList(entities);
	}
	
	
}
