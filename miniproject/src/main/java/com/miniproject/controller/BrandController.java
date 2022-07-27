package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/miniproject/insertbrand")
	public String insert(BrandModel model, @RequestParam String brand) {

		return brandService.insert(model, brand);
	}
	
	@RequestMapping("/miniproject/updatebrand")
	public int update(BrandModel model, @RequestParam int id) {

		return brandService.update(model, id);
	}
	
	@RequestMapping("/miniproject/deletebrand")
	public String delete(@RequestParam int id) {

		return "Deleted " + brandService.delete(id);
	}
	
}
