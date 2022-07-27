package com.miniproject.model;

import java.util.List;

import lombok.Data;

@Data
public class AllNetworkModel {
	
	private String type;
	private String network;
	private List<String> readnetwork;
}
