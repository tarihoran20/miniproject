package com.miniproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.model.TypeModel;
import com.miniproject.service.ITypeService;

@RestController
public class TypeController {

	@Autowired
	ITypeService typeService;

	@RequestMapping("/miniproject/readtype")
	public List<TypeModel> readAll() {

		return typeService.readAll();
	}
}
