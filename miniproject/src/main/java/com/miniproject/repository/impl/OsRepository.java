package com.miniproject.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.model.ChipsetModel;
import com.miniproject.model.OsModel;
import com.miniproject.repository.IOsRepository;

@Repository
public class OsRepository implements IOsRepository{
	
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<OsModel> readAll() {
		var query = "select * from t_os";
		return jdbc.query(query, new BeanPropertyRowMapper<OsModel>(OsModel.class));
	}

}
