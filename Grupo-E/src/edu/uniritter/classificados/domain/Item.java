package edu.uniritter.classificados.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	@Id
	@Column(name="ITEM_ID")
	private Long id;
        
        @Column(name="ITEM_NAME")
	private String name;
        
        @Column(name="ANNOUNCER_ID")
	private User announcer;
        
        @ManyToOne
	@JoinColumn(name="CATEGORY_ID")
	private Category category;
        
        @Column(name="PUBLISHED")
	private Date published;
        
        @Column(name="MODIFIED")
	private Date modified;
        
        @Column(name="PRICE")
	private BigDecimal price;
        
        @Column(name="CONTACT_NAME")
	private String contactName;
        
        @Column(name="CONTACT_EMAIL")
	private String contactEmail;
        
        @Column(name="ITEM_ACTIVE")
	private Boolean active;
        
        @Column(name="EXPIRATION")
	private Date expiration;
        
        @Column(name="DESCRIPTION")
	private String description;
        
        @ManyToOne
	@JoinColumn(name="LOCATION_ID")
	private Location itemLocation;
        
	private Set<ItemComment> comments;    //VERIFICAR
	private Set<ItemResource> resources;  //VERIFICAR
	
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
