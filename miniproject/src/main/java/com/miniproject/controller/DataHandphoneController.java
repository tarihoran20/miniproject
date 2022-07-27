package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.model.DataHandphoneModel;
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
	public String insert(DataHandphoneModel model, @RequestParam String idBrand, @RequestParam String type,
			@RequestParam String idOs, @RequestParam String idChipset, @RequestParam String idNetwork, @RequestParam int price){
		
		return datahandphoneService.insert(model, idBrand, type, idOs, idChipset, idNetwork, price);
	}
	
	@RequestMapping("/miniproject/readdatahandphone")
	public List<DataHandphoneModel> read(){
		
		return datahandphoneService.read();
	}

}
