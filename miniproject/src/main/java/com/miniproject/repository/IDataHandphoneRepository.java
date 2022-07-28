package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.model.PhoneNetworkModel;

public interface IDataHandphoneRepository {
	
	public List<DataHandphoneModel> readAll(); //read all
	
	public List<DataHandphoneModel> read(); //read by foreign key
	
	public String insert(DataHandphoneModel model, String id_brand, String type, String id_os, String id_chipset,String[] id_network, int price);
	
	public List<PhoneNetworkModel> readnetwork();
	
	public int deletehandphone(String phone);
	


}
