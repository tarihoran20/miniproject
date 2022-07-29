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

	@Override
	public String insertchipset(ChipsetModel chipsetModel) {
		var query = "insert into t_chipset (chipset) value (?)";
		
		return ""+jdbc.update(query, new Object[] {chipsetModel.getChipset()});
	}

	@Override
	public int delete(int id) {
		var query = "delete from t_chipset where id_chipset = " + id ;
		return jdbc.update(query);
	}

	public int updatechipset(ChipsetModel chipsetModel, int id) {
		var query = "update t_brand set brand = ? where id_brand = " + id;
		
		return jdbc.update(query, new Object[] {chipsetModel.getChipset()});
	}

}
