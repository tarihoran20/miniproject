package com.miniproject.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

	@Override
	public int update(OsModel model, int id) {
		var query = "update t_os set os = ? where id_os = " + id;
		return jdbc.update(query, new Object[] {model.getOs()}) ;
	}

	@Override
	public int delete(int id) {
		var query = "delete from t_os where id_os = " + id ;
		return jdbc.update(query);
	}
	
	@Override
	public String insertos(OsModel osModel) {
		var query = "insert into t_os (os) value (?)";
		return ""+jdbc.update(query, new Object[] {osModel.getOs()});
	}

}
