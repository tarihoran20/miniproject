package com.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "T_BRAND")
public class BrandModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_brand;
	private String brand;
	
	public int getId_brand() {
		return id_brand;
	}
	public void setId_brand(int id_brand) {
		this.id_brand = id_brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
