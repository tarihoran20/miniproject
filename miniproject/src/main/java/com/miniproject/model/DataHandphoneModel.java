package com.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table(name = "T_DATAHANDPHONE")
public class DataHandphoneModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	private String brand;
	private String os;
	private String chipset;
	private int price;
	//private String id_network;


	
	@Transient
	private java.util.List<NetworkModel> networks;
	//private List listnetwotk;
	

}
