package com.miniproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.model.submissonmodel.ReadAllModel;
import com.miniproject.repository.impl.DataHandphoneRepository;
import com.miniproject.service.IDataHandphoneService;

@Service
public class DataHandphoneService implements IDataHandphoneService {

	@Autowired
	DataHandphoneRepository datahandphoneRepository;
	
	@Override
	public List<ReadAllModel> readAll() {
		return datahandphoneRepository.readAll();
	}

}
