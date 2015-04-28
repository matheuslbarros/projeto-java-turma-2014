package edu.uniritter.classificados.dto;

import java.util.ArrayList;
import java.util.List;

import edu.uniritter.classificados.domain.Category;

public class CategoryDTO {
	
	private Long id;
	private String name;
	private Integer position;
	
	public static List<CategoryDTO> convertList(List<Category> entities) {
		List<CategoryDTO> dtos = new ArrayList<CategoryDTO>();
		
		for (Category entity : entities) {
			dtos.add(new CategoryDTO(entity));
		}
		
		return dtos;
	}
	
	public CategoryDTO() {
	}
	
	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.position = entity.getPosition();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}
	
}
