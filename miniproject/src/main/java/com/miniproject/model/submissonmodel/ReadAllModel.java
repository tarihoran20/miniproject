package com.miniproject.model.submissonmodel;

import javax.persistence.Id;

import lombok.Data;

@Data
public class ReadAllModel {
	
	private String brand;
	private String type;
	private String os;
	private String chipset;
	private int price;
	private String network;
	
	
	

}
