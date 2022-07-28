package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public String insert(DataHandphoneModel model, @RequestParam int id_brand, @RequestParam String type,
			@RequestParam int id_os, @RequestParam int id_chipset, @RequestParam String[] id_network, @RequestParam int price){
		
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
	
	@DeleteMapping("/miniproject/deletehandphone")
	public String delete(@RequestParam String phone) {
		
		return "Deleted "+datahandphoneService.deletehandphone(phone);
	}
	
	@RequestMapping("")
	public String home() {
		
		return "/home";
	}
	
//	@PostMapping("/miniproject/insertdatahandphone")
//	public String insert(@RequestBody DataHandphoneModel model) {
//		datahandphoneService.insert(model, 0, null, 0, 0, null, 0);
//		return "insert berhasil";
//	}

}
