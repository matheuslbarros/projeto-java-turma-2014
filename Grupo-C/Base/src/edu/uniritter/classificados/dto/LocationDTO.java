package edu.uniritter.classificados.dto;


public class LocationDTO {
	
	private Long id;
	private String name;
	private Long userId;
	private Long countryId;
	private String countryName;
	private String address;
	private String zipCode;
	private Long regionId;
	private String regionName;
	private Long cityId;
	private String cityName;
	private Long cityAreaId;
	private String cityAreaName;
	
	public LocationDTO() {
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getCityAreaId() {
		return cityAreaId;
	}

	public void setCityAreaId(Long cityAreaId) {
		this.cityAreaId = cityAreaId;
	}

	public String getCityAreaName() {
		return cityAreaName;
	}

	public void setCityAreaName(String cityAreaName) {
		this.cityAreaName = cityAreaName;
	}
	
}
