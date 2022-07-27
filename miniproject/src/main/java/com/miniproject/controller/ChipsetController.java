package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping("/miniproject/insertchipset")
	public String insert(ChipsetModel model, @RequestParam String chipset) {
		return chipsetService.insert(model, chipset);
	}
	
	@RequestMapping("/miniproject/updatechipset")
	public String update(ChipsetModel model, @RequestParam int id) {
		return "Updated -->"+ chipsetService.update(model, id);
	}
	
	@RequestMapping("/miniproject/deletechipset")
	public String delete(@RequestParam int id) {

		return "Deleted --> " + chipsetService.delete(id);
	}
	

}
