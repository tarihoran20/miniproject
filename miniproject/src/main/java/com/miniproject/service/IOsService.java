package com.miniproject.service;

import java.util.List;

import com.miniproject.model.OsModel;

public interface IOsService {
	
	public List<OsModel> readAll();
	
	public String insert(OsModel model, String os);
	
	public int update(OsModel model, int id);
	
	public int delete(int id);

}
