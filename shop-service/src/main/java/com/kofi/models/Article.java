package com.kofi.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "artcile")
public class Article {

	@Override
	public String toString() {
		return "Article [id=" + id + ", shop=" + shop + ", name=" + name + ", price=" + price + ", shopid=" + shopid
				+ "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Article( ) {}
	public Article(Shop shop, String name, double price, long shopid) {
		super();
		this.shop = shop;
		this.name = name;
		this.price = price;
		this.shopid = shopid;
	}

	@ManyToOne
	@JoinColumn(name = "shop_id")
	@JsonBackReference
	private Shop shop;
	
	@Column(nullable = true)
	private String name;
	
	@Column(nullable = true)
	private double price;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private Long shopid;

	public Long getShopid() {
		return shopid;
	}
	public void setShopid(Long shopid) {
		this.shopid = shopid;
	}
	public Shop getShop() {
		return shop;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
