package com.miniproject.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.model.ChipsetModel;
import com.miniproject.model.TypeModel;
import com.miniproject.repository.ITypeRepository;

@Repository
public class TypeRepository implements ITypeRepository {
	
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<TypeModel> readAll() {
		var query = "select * from t_type";
		return jdbc.query(query, new BeanPropertyRowMapper<TypeModel>(TypeModel.class));
	}
	

}
