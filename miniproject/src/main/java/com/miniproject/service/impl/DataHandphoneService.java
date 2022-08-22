package com.miniproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.model.PhoneJoinNetworkModel;
import com.miniproject.model.PhoneNetworkModel;
import com.miniproject.repository.IDataHandphoneNetworkRepository;
import com.miniproject.repository.IDataHandphoneRepository;
import com.miniproject.repository.impl.DataHandphoneRepository;
import com.miniproject.service.IDataHandphoneService;

import lombok.experimental.var;

@Service
public class DataHandphoneService implements IDataHandphoneService {

	@Autowired
	IDataHandphoneRepository datahandphoneRepository;
	@Autowired
	IDataHandphoneNetworkRepository dataHandphoneNetworkRepository;

	@Override
	public List<DataHandphoneModel> readAll() {
		var result = datahandphoneRepository.readAll();
		
		for(var row : result)
		{
			var networks = dataHandphoneNetworkRepository.readAllByIdPhone(row.getId());
			row.setNetworks(networks);
		}
		
		return result;
	}

	@Override
	public List<DataHandphoneModel> read() {


		return datahandphoneRepository.read();
	}

	@Override
	public List<PhoneNetworkModel> readnetwork() {
		return datahandphoneRepository.readnetwork();
	}

	@Override
	public List<PhoneJoinNetworkModel> join() {
		return null;
	}

	@Override
	public String insertdatahandphone(DataHandphoneModel dhModel) {
		return datahandphoneRepository.insertdatahandphone(dhModel);
	}

	@Override
	public int updatedatahandphone(DataHandphoneModel dhModel, int id) {
		return datahandphoneRepository.updatedatahandphone(dhModel, id);
	}

	@Override
	public int deletedatahandphone(int id) {
		return datahandphoneRepository.deletedatahandphone(id);
	}

}
