package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/miniproject/insertnetwork")
	public String insert(NetworkModel model, @RequestParam String network) {
		return networkService.insert(model, network);
	}
	
	@RequestMapping("/miniproject/updatenetwork")
	public String update(NetworkModel model, @RequestParam int id) {
		return "Updated -->"+ networkService.update(model, id);
	}
	
	@RequestMapping("/miniproject/deletenetwork")
	public String delete(@RequestParam int id) {

		return "Deleted --> " + networkService.delete(id);
	}

}
