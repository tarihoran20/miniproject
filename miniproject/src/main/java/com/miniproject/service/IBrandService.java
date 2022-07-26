package com.miniproject.service;

import java.util.List;

import com.miniproject.model.BrandModel;

public interface IBrandService {
	
	public List<BrandModel> readAll();
	
	public int updatebrand(BrandModel model, int id);
	
	public int deletebrand(int id);

	public String insertbrand(BrandModel brandModel);

}
