package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.BrandModel;

public interface IBrandRepository {

	
	public List<BrandModel> readAll();
	
	public String insert(BrandModel model, String brand);

	public int update(BrandModel model, int id);
	
	public int delete(int id);

}
