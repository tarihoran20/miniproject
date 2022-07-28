package com.miniproject.model;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;



public class PhoneJoinNetworkModel {
	
	private String id_brand;
	private String type;
	private String id_os;
	private String id_chipset;
	private String price;
	
	//private List<String> join;
	
}
