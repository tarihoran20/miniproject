package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.OsModel;

public interface IOsRepository {
	
	public List<OsModel> readAll();
	
	public String insert(OsModel model, String os);
	
	public int update(OsModel model, int id);
	
	public int delete(int id);

}
