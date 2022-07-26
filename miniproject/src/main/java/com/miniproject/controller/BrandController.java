package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.model.BrandModel;
import com.miniproject.service.IBrandService;

@RestController
public class BrandController {

	@Autowired
	IBrandService brandService;

	@RequestMapping("/miniproject/readbrand")
	public List<BrandModel> readAll() {

		return brandService.readAll();
	}

}
