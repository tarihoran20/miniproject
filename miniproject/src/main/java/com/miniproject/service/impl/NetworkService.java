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

}
