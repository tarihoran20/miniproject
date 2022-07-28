package com.miniproject.service;

import java.util.List;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.model.PhoneJoinNetworkModel;
import com.miniproject.model.PhoneNetworkModel;


public interface IDataHandphoneService {
	
	public List<DataHandphoneModel> readAll();
	
	public String insert(DataHandphoneModel model, int id_brand, String type, int id_os, int id_chipset, String[] i_network, int price);
	
	public List<DataHandphoneModel> read();
	
	public List<PhoneNetworkModel> readnetwork();
	
	public List<PhoneJoinNetworkModel> join();
	
	public int deletehandphone(String phone);


}
