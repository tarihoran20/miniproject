package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping("/miniproject/insertchipset")
	public String insertchipset(@RequestBody ChipsetModel chipsetModel) {
		chipsetService.insertchipset(chipsetModel);
		return "Chipset --> Inserted";
	}
	
	@PutMapping("/miniproject/updatechipset")
	public ResponseEntity<String> updatechipset(@RequestParam int id, @RequestBody ChipsetModel chipsetModel) {
		chipsetService.updatechipset(chipsetModel, id);
		return new ResponseEntity<> ("Chipset Updated --> ", HttpStatus.OK); 
	}
	
	@RequestMapping("/miniproject/deletechipset")
	public String delete(@RequestParam int id) {

		return "Deleted --> " + chipsetService.delete(id);
	}
	

}
