package com.miniproject.service;

import java.util.List;

import com.miniproject.model.ChipsetModel;

public interface IChipsetService {
	
	public List<ChipsetModel> readAll();
	
	public String insert(ChipsetModel model, String chipset);
	
	public int update(ChipsetModel model, int id);
	
	public int delete(int id);

}
