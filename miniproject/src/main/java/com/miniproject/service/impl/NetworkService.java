package com.miniproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.model.NetworkModel;
import com.miniproject.repository.impl.NetworkRepository;
import com.miniproject.service.INetworkService;

@Service
public class NetworkService implements INetworkService {

	@Autowired
	NetworkRepository networkRepository;
	
	@Override
	public List<NetworkModel> readAll() {
		
		return networkRepository.readAll();
	}

	@Override
	public String insert(NetworkModel model, String network) {
		return networkRepository.insert(model, network);
	}

	@Override
	public int update(NetworkModel model, int id) {
		return networkRepository.update(model, id);
	}

	@Override
	public int delete(int id) {
		return networkRepository.delete(id);
	}

}
