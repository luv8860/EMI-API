package com.rapipay.springboot.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
	
	@Id
	long productID;
	
	@Column(name="productName")
	String productName;
	
	@Column(name="tenure")	
	int tenure;
	
	@Column(name="rateOfInterest")
	float rateOfInterest;
	
	@Column(name="princlpleAmount")
	float princlpleAmount;
	
	@Column(name="isActive")
	boolean isActive;
	
	@Column(name="createdBy")
	String createdBy;
	
	@Column(name="createdOn")
	String createdOn;
	
	@Column(name="updatedBy")
	String updatedBy;
	
	@Column(name="updatedOn")
	String updatedOn;
	
	public Product() {
		super();
	}
	public Product(long id,String productName, int tenure, float rateOfInterest, float princlpleAmount,
			boolean isActive, String createdBy, String updatedBy) {
		super();
		this.productID=id;
		this.productName = productName;
		this.tenure = tenure;
		this.rateOfInterest = rateOfInterest;
		this.princlpleAmount = princlpleAmount;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		
	}
	public long getProductID() {
		return productID;
	}
	public String getProductName() {
		return productName;
	}
	public int getTenure() {
		return tenure;
	}
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public float getPrinclpleAmount() {
		return princlpleAmount;
	}
	public boolean isActive() {
		return isActive;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public String getUpdatedOn() {
		return updatedOn;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public void setPrinclpleAmount(float princlpleAmount) {
		this.princlpleAmount = princlpleAmount;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public void setUpdatedOn() {
		this.updatedOn=new Date().toString();
	}
	public void setCreatedOn() {
		this.createdOn=new Date().toString();
	}
	
	
}
