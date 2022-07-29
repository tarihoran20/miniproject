package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.model.NetworkModel;
import com.miniproject.model.PhoneNetworkModel;

public interface IDataHandphoneNetworkRepository {
	
	public List<NetworkModel> readAllByIdPhone(int id); //read all
	


}
