package com.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import antlr.collections.List;
import lombok.Data;

@Data
@Entity
@Table(name = "T_DATAHANDPHONE")
public class DataHandphoneModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	private String id_brand;
	private String id_os;
	private String id_chipset;
	private String price;
	private String id_network;
	//private java.util.List<PhoneNetworkModel> network;
	//private List listnetwotk;

}
