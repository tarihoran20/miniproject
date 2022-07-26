package com.miniproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.model.ChipsetModel;
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

}
