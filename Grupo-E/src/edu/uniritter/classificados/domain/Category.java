package edu.uniritter.classificados.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Category {
	
        @Id
	@Column(name="CATEGORY_ID")
        private Long id;
        
        @OneToOne
        @JoinColumn(name="PARENT_CATEGORY_ID")
	private Category parentCategory;
        
        @Column(name="CATEGORY_NAME")
	private String name;
        
        @Column(name="POSITION")
	private Integer position;
        
        @Column(name="CAT_ENABLE")
	private Boolean enabled;
	
	public Category() {
	}
	
	public Category(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
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

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	
}
