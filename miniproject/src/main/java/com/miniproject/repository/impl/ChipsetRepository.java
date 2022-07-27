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
	public String insert(ChipsetModel model, String chipset) {
		var query = "insert into t_chipset (chipset) value (?)";
		
		return "Inserted --> " + jdbc.update(query, new Object[] {model.getChipset()});
	}

	@Override
	public int update(ChipsetModel model, int id) {
		var query = "update t_chipset set chipset = ? where id_chipset = " + id;
		return jdbc.update(query, new Object[] {model.getChipset()}) ;
	}

	@Override
	public int delete(int id) {
		var query = "delete from t_chipset where id_chipset = " + id ;
		return jdbc.update(query);
	}

}
