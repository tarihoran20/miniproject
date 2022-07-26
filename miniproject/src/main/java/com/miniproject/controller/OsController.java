package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.model.OsModel;
import com.miniproject.service.IOsService;

@RestController
public class OsController {
	
	@Autowired
	IOsService osService;
	
	@RequestMapping("/miniproject/reados")
	public List<OsModel> readAll(){
		return osService.readAll();
	}

}
