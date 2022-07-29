package com.miniproject.service;

import java.util.List;

import com.miniproject.model.ChipsetModel;

public interface IChipsetService {
	
	public List<ChipsetModel> readAll();
	
	public String insertchipset(ChipsetModel model);

	public int updatechipset(ChipsetModel model, int id);

	int deletechipset(int id);

}
