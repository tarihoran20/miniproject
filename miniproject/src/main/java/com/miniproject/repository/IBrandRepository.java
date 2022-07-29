package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.BrandModel;

public interface IBrandRepository {

	
	public List<BrandModel> readAll();

	public int updatebrand(BrandModel model, int id);
	
	public String insertbrand(BrandModel brandModel);
	
	public int deletebrand(int id);

}
