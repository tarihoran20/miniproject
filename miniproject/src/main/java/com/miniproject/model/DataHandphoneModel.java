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


	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getOs() {
		return os;
	}


	public void setOs(String os) {
		this.os = os;
	}


	public String getChipset() {
		return chipset;
	}


	public void setChipset(String chipset) {
		this.chipset = chipset;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public java.util.List<NetworkModel> getNetworks() {
		return networks;
	}


	public void setNetworks(java.util.List<NetworkModel> networks) {
		this.networks = networks;
	}


	@Transient
	private java.util.List<NetworkModel> networks;
	//private List listnetwotk;
	

}
