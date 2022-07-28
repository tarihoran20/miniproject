package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.model.PhoneNetworkModel;

public interface IDataHandphoneRepository {
	
	public List<DataHandphoneModel> readAll(); //read all
	
	public List<DataHandphoneModel> read(); //read by foreign key
	
	public String insert(DataHandphoneModel model, int id_brand, String type, int id_os, int id_chipset,String[] id_network, int price);
	
	public List<PhoneNetworkModel> readnetwork();
	
	public int deletehandphone(String phone);
	


}
