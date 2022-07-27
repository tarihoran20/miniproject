package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.ChipsetModel;

public interface IChipsetRepository {
	
	public List<ChipsetModel> readAll();
	
	public String insert(ChipsetModel model, String chipset);
	
	public int update(ChipsetModel model, int id);
	
	public int delete(int id);

}
