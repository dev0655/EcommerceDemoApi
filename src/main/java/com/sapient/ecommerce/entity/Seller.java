package com.sapient.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SELLER")
public class Seller {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SELLER_ID")
	private Long sellerId;
	@Column(name = "SELLER_NAME")
	private String sellerName;
	public Seller() {
		// TODO Auto-generated constructor stub
	}

	public Seller(Long sellerId, String sellerName) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
	}


	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}
