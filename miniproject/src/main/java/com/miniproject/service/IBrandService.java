package com.miniproject.service;

import java.util.List;

import com.miniproject.model.BrandModel;

public interface IBrandService {
	
	public List<BrandModel> readAll();
	
	public String insert(BrandModel model, String brand);
	
	public int update(BrandModel model, int id);
	
	public int delete(int id);

}
