package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.ChipsetModel;

public interface IChipsetRepository {
	
	public List<ChipsetModel> readAll();

}
