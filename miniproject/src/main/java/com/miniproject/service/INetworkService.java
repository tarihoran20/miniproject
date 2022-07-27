package com.miniproject.service;

import java.util.List;

import com.miniproject.model.NetworkModel;

public interface INetworkService {
	
	public List<NetworkModel> readAll();
	
	public String insert(NetworkModel model, String network);
	
	public int update(NetworkModel model, int id);
	
	public int delete(int id);

}
