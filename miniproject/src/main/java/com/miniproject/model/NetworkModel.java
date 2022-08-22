package com.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "T_NETWORK")

public class NetworkModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private int id_network;
	private String network;

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}
	
	
	

}
