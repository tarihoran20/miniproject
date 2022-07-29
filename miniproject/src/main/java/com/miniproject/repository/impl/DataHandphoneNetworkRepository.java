package com.miniproject.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.model.NetworkModel;
import com.miniproject.model.PhoneJoinNetworkModel;
import com.miniproject.model.PhoneNetworkModel;
import com.miniproject.repository.IDataHandphoneNetworkRepository;
import com.miniproject.repository.IDataHandphoneRepository;

@Repository
public class DataHandphoneNetworkRepository implements IDataHandphoneNetworkRepository {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<NetworkModel> readAllByIdPhone(int id){//read all{
		var query = "select b.* from t_datahandphonenetwork a\r\n"
				+ "join t_network b on a.network_id = b.id_network\r\n"
				+ "where a.datahandphone_id = ?";
		return jdbc.query(query, new BeanPropertyRowMapper<NetworkModel>(NetworkModel.class),new Object[] {id});
	}
}