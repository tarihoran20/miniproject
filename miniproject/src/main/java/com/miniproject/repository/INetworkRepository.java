package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.NetworkModel;

public interface INetworkRepository {
	
	public List<NetworkModel> readAll();

}
