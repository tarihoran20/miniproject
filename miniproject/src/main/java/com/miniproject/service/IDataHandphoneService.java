package com.miniproject.service;

import java.util.List;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.model.PhoneJoinNetworkModel;
import com.miniproject.model.PhoneNetworkModel;


public interface IDataHandphoneService {
	
	public List<DataHandphoneModel> readAll();
	
	public String insertdatahandphone(DataHandphoneModel dhModel);
	
	public int updatedatahandphone(DataHandphoneModel dhModel, int id);
	
	public List<DataHandphoneModel> read();
	
	public List<PhoneNetworkModel> readnetwork();
	
	public List<PhoneJoinNetworkModel> join();
	
	public int deletedatahandphone(int id);


}
