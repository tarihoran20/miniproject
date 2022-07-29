package com.miniproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.model.BrandModel;
import com.miniproject.repository.impl.BrandRepository;
import com.miniproject.service.IBrandService;

@Service
public class BrandService implements IBrandService {
	
	@Autowired
	BrandRepository brandRepository;

	@Override
	public List<BrandModel> readAll() {
		return brandRepository.readAll();
	}

	@Override
	public int updatebrand(BrandModel brandModel, int id) {
		return brandRepository.updatebrand(brandModel, id);
	}

	@Override
	public int deletebrand(int id) {
		return brandRepository.deletebrand(id);
	}

	@Override
	public String insertbrand(BrandModel brandModel) {
		
		return brandRepository.insertbrand(brandModel);
	}
	




	

}
