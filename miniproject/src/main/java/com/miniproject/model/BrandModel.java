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

}
