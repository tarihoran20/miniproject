package com.miniproject.service;

import java.util.List;

import com.miniproject.model.DataHandphoneModel;


public interface IDataHandphoneService {
	
	public List<DataHandphoneModel> readAll();
	
	public String insert(DataHandphoneModel model, String idBrand, String type, String idOs, String idChipset, String idNetwork, int price);
	
	public List<DataHandphoneModel> read();
	
	

}
