package com.sapient.ecommerce.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID")
	private Long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "PRICE")
	private Double price;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "PRODUCT_CATEGORY")
	private String productCategory;
	@Column(name="SIZE")
	private String size;
	@Column(name = "STOCK")
	private Integer stock;
	@Column(name = "BRAND")
	private String brand;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(Long productId, String productName, Double price, String color, String productCategory, String size,
			Integer stock, String brand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.color = color;
		this.productCategory = productCategory;
		this.size = size;
		this.stock = stock;
		this.brand = brand;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SELLER_ID")
	private Seller seller;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Seller getSeller() {
		return seller;
	}

	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
}
