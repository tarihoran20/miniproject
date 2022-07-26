package com.miniproject.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.model.BrandModel;
import com.miniproject.model.ChipsetModel;
import com.miniproject.repository.IBrandRepository;

@Repository
public class BrandRepository implements IBrandRepository{

	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public List<BrandModel> readAll() {
		var query = "select * from t_brand";
		return jdbc.query(query, new BeanPropertyRowMapper<BrandModel>(BrandModel.class));
	}

}
