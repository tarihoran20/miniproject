package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.model.ChipsetModel;
import com.miniproject.service.IChipsetService;

@RestController
public class ChipsetController {
	
	@Autowired
	IChipsetService chipsetService;
	
	@RequestMapping("/miniproject/readchipset")
	public List<ChipsetModel> readAll(){
		
		return chipsetService.readAll();
	}

}
