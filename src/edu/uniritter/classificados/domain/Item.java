package edu.uniritter.classificados.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

public class Item {
	
	private Long id;
	private String name;
	private User announcer;
	private Category category;
	private Date published;
	private Date modified;
	private BigDecimal price;
	private String contactName;
	private String contactEmail;
	private Boolean active;
	private Date expiration;
	private String description;
	private Location itemLocation;
	private Set<ItemComment> comments;
	private Set<ItemResource> resources;
	
	public Item() {
	}
	public Item(Long id) {
		this.id = id;
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
	public User getAnnouncer() {
		return announcer;
	}
	public void setAnnouncer(User announcer) {
		this.announcer = announcer;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Date getPublished() {
		return published;
	}
	public void setPublished(Date published) {
		this.published = published;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Date getExpiration() {
		return expiration;
	}
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Location getItemLocation() {
		return itemLocation;
	}
	public void setItemLocation(Location itemLocation) {
		this.itemLocation = itemLocation;
	}
	public Set<ItemComment> getComments() {
		return comments;
	}
	public void setComments(Set<ItemComment> comments) {
		this.comments = comments;
	}
	public Set<ItemResource> getResources() {
		return resources;
	}
	public void setResources(Set<ItemResource> resources) {
		this.resources = resources;
	}
	
	
}
