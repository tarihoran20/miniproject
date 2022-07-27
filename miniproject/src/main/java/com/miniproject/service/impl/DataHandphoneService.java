package com.miniproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.repository.impl.DataHandphoneRepository;
import com.miniproject.service.IDataHandphoneService;

@Service
public class DataHandphoneService implements IDataHandphoneService {

	@Autowired
	DataHandphoneRepository datahandphoneRepository;

	@Override
	public List<DataHandphoneModel> readAll() {
		return datahandphoneRepository.readAll();
	}

	@Override
	public String insert(DataHandphoneModel model, String idBrand, String type, String idOs, String idChipset,
			String idNetwork, int price) {
		return datahandphoneRepository.insert(model, idBrand, type, idOs, idChipset, idNetwork, price);
	}

	@Override
	public List<DataHandphoneModel> read() {
		// TODO Auto-generated method stub
		return datahandphoneRepository.read();
	}


	
	

}
