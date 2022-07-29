package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.ChipsetModel;

public interface IChipsetRepository {
	
	public List<ChipsetModel> readAll();
	
	public String insertchipset(ChipsetModel chipsetModel);
	
	public int updatechipset(ChipsetModel model, int id);
	
	public int delete(int id);

}
