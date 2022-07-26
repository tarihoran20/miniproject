package com.miniproject.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.model.ChipsetModel;
import com.miniproject.repository.IChipsetRepository;

@Repository
public class ChipsetRepository implements IChipsetRepository {

	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public List<ChipsetModel> readAll() {
		var query = "select * from t_chipset";
		return jdbc.query(query, new BeanPropertyRowMapper<ChipsetModel>(ChipsetModel.class));
	}

}
