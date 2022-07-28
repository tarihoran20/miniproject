package com.miniproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.model.PhoneJoinNetworkModel;
import com.miniproject.model.PhoneNetworkModel;
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
	public List<DataHandphoneModel> read() {

		DataHandphoneModel model = new DataHandphoneModel();
		PhoneNetworkModel model2 = new PhoneNetworkModel();

		for (int i = 0; i < readnetwork().size(); i++) {
			if (model.getType() == model2.getType()) {
				// System.out.println(model2.getNetwork());
			}
		}

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
	public int deletehandphone(String phone) {
		return datahandphoneRepository.deletehandphone(phone);
	}

	@Override
	public String insert(DataHandphoneModel model, int id_brand, String type, int id_os, int id_chipset,
			String[] id_network, int price) {
		return datahandphoneRepository.insert(model, id_brand, type, id_os, id_chipset, id_network, price);
	}

}
