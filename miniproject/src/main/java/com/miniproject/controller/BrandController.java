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
import com.miniproject.service.IBrandService;

@RestController
public class BrandController {

	@Autowired
	IBrandService brandService;

	@RequestMapping("/miniproject/readbrand")
	public List<BrandModel> readAll() {

		return brandService.readAll();
	}

	@PutMapping("/miniproject/updatebrand")
	public ResponseEntity<String> updatebrand(@RequestParam int id, @RequestBody BrandModel brandModel) {
		brandService.updatebrand(brandModel, id);
		return new ResponseEntity<>("Brand Updated --> ", HttpStatus.OK);
	}

	@PostMapping("/miniproject/insertbrand")
	public String insertbrand(@RequestBody BrandModel brandModel) {
		brandService.insertbrand(brandModel);
		return "Brand --> Inserted ";

	}
	
	@DeleteMapping("/miniproject/deletebrand")
	public String deletebrand(@RequestParam int id) {
		return "Brand Deleted --> " + brandService.deletebrand(id);
	}	
}
