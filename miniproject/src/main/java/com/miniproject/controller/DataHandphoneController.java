package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.model.submissonmodel.ReadAllModel;
import com.miniproject.service.IDataHandphoneService;

@RestController
public class DataHandphoneController {
	
	@Autowired
	IDataHandphoneService datahandphoneService;
	
	@RequestMapping("/miniproject/readall")
	public List<ReadAllModel> readAll(){
		
		return datahandphoneService.readAll();
	}

}
