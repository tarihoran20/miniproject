package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/miniproject/insertos")
	public String insertos(@RequestBody OsModel osModel) {
		return osService.insertos(osModel);
	}
	
	@RequestMapping("/miniproject/updateos")
	public String update(OsModel model, @RequestParam int id) {
		return "Updated -->"+ osService.update(model, id);
	}
	
	@RequestMapping("/miniproject/deleteos")
	public String delete(@RequestParam int id) {

		return "Deleted --> " + osService.delete(id);
	}

}
