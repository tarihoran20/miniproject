package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.model.BrandModel;
import com.miniproject.model.DataHandphoneModel;
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
	
	
	@DeleteMapping("/miniproject/deletedatahandphone")
	public String deletedatahandphone(@RequestParam int id) {
		
		return "Deleted "+datahandphoneService.deletedatahandphone(id);
	}
	
	@RequestMapping("")
	public String home() {
		
		return "/home";
	}
	
	@PostMapping("/miniproject/insertdatahandphone")
	public String insert(@RequestBody DataHandphoneModel dhModel) {
		datahandphoneService.insertdatahandphone(dhModel);
		return "Data Handphone --> Inserted";
	}
	
	@PutMapping("/miniproject/updatedatahandphone")
	public ResponseEntity<String> updatedatahandphone(@RequestParam int id, @RequestBody DataHandphoneModel dhModel) {
		datahandphoneService.updatedatahandphone(dhModel, id);
		return new ResponseEntity<>("Data Handphone Updated --> ", HttpStatus.OK);
	}
	

}
