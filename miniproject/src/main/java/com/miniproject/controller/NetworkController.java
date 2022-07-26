package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.model.NetworkModel;
import com.miniproject.service.INetworkService;

@RestController
public class NetworkController {
	
	@Autowired
	INetworkService networkService;	
	
	@RequestMapping("/miniproject/readnetwork")
	public List<NetworkModel> readAll(){
		
		return networkService.readAll();
	}

}
