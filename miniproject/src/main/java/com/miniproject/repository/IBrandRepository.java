package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.BrandModel;

public interface IBrandRepository {
	
	public List<BrandModel> readAll();

}
