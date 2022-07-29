package com.miniproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.model.BrandModel;
import com.miniproject.model.ChipsetModel;
import com.miniproject.repository.impl.BrandRepository;
import com.miniproject.repository.impl.ChipsetRepository;
import com.miniproject.service.IChipsetService;

@Service
public class ChipsetService implements IChipsetService{
	@Autowired
	ChipsetRepository chipsetRepository;
	
	@Override
	public List<ChipsetModel> readAll() {
		
		return chipsetRepository.readAll();
	}

	@Override
	public String insertchipset(ChipsetModel chipsetModel) {
		
		return chipsetRepository.insertchipset(chipsetModel);
	}

	@Override
	public int updatechipset(ChipsetModel chipsetModel, int id) {
		return chipsetRepository.updatechipset(chipsetModel, id);
	}

	@Override
	public int deletechipset(int id) {
		return chipsetRepository.deletechipset(id);
	}

}
