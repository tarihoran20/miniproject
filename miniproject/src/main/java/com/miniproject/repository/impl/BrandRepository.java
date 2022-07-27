package com.miniproject.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.model.BrandModel;
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

	@Override
	public String insert(BrandModel model, String brand) {
		var query = "insert into t_brand(brand) value (?)" ;
		return "inserted " + jdbc.update(query, new Object[] {model.getBrand()});
	}

	@Override
	public int update(BrandModel model, int id) {
		var query = "update t_brand set brand = ? where id_brand = " + id;
		
		return jdbc.update(query, new Object[] {model.getBrand()});
	}

	@Override
	public int delete(int id) {
		var query = "delete from t_brand where id_Brand = " + id;
		
		return jdbc.update(query);
	}




}
