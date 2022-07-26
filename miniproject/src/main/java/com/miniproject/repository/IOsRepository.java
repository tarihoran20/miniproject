package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.OsModel;

public interface IOsRepository {
	
	public List<OsModel> readAll();

}
