package com.miniproject.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.model.submissonmodel.ReadAllModel;
import com.miniproject.repository.IDataHandphoneRepository;

@Repository
public class DataHandphoneRepository implements IDataHandphoneRepository {
	
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public List<ReadAllModel> readAll() {
		var query = "";
		return jdbc.query(query, new BeanPropertyRowMapper<ReadAllModel>(ReadAllModel.class));
	}

}
