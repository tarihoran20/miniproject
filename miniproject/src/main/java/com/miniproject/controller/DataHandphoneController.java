package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.model.DeleteDataHandphoneModel;
import com.miniproject.model.PhoneJoinNetworkModel;
import com.miniproject.model.PhoneNetworkModel;
import com.miniproject.service.IDataHandphoneService;

@RestController
public class DataHandphoneController {
	
	@Autowired
	IDataHandphoneService datahandphoneService;
	
	
	@RequestMapping("/miniproject/readalldatahandphone")
	public List<DataHandphoneModel> readAll(){
		
		return datahandphoneService.readAll();
	}
	
	@RequestMapping("/miniproject/insertdatahandphone")
	public String insert(DataHandphoneModel model, @RequestParam String id_brand, @RequestParam String type,
			@RequestParam String id_os, @RequestParam String id_chipset, @RequestParam String[] id_network, @RequestParam int price){
		
		return datahandphoneService.insert(model, id_brand, type, id_os, id_chipset, id_network, price);
	}
	
	@RequestMapping("/miniproject/readdatahandphone")
	public List<DataHandphoneModel> read(){
		
		return datahandphoneService.read();
	}
	
	@RequestMapping("/miniproject/readphonenetwork")
	public List<PhoneNetworkModel> readphonenetwork(){
		
		return datahandphoneService.readnetwork();
	}
	
	@RequestMapping("/miniproject/readjoin")
	public List<PhoneJoinNetworkModel> join() {
		
		return datahandphoneService.join();
	}
	
	@RequestMapping("/miniproject/deletehandphone")
	public int delete(String phone) {
		
		return datahandphoneService.deletehandphone(phone);
	}

}
