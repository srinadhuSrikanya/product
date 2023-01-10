package com.systemproduct.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Productlist")
public class ProductDetails {
	
	@Id
	private String id;
	private String productId;
	private String productName;
	private String producttype;
	public String getId() {
		return id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", productId=" + productId + ", productName=" + productName
				+ ", producttype=" + producttype + ", getId()=" + getId() + ", getProductId()=" + getProductId()
				+ ", getProductName()=" + getProductName() + ", getProducttype()=" + getProducttype() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public ProductDetails(String id, String productId, String productName, String producttype) {
		super();
		this.id = id;
		this.productId = productId;
		this.productName = productName;
		this.producttype = producttype;
	}
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
}