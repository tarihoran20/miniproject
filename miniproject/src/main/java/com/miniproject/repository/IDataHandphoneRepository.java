package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.model.PhoneNetworkModel;

public interface IDataHandphoneRepository {
	
	public List<DataHandphoneModel> readAll(); //read all
	
	public List<DataHandphoneModel> read(); //read by foreign key
	
	public String insertdatahandphone(DataHandphoneModel dhModel);
	
	public List<PhoneNetworkModel> readnetwork();
	
	public int deletedatahandphone(int id);
	
	public int updatedatahandphone(DataHandphoneModel dhModel, int id);
	


}
