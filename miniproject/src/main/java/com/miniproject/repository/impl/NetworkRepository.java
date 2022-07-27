package com.miniproject.repository.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.miniproject.model.NetworkModel;
import com.miniproject.repository.INetworkRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class NetworkRepository implements INetworkRepository {

	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public List<NetworkModel> readAll() {
		var query = "select * from t_network";
		return jdbc.query(query, new BeanPropertyRowMapper<NetworkModel>(NetworkModel.class));
	}

	@Override
	public String insert(NetworkModel model, String network) {
		var query = " insert into t_network (network) value (?) " ;
		return "Inserted --> " + jdbc.update(query, new Object[] {model.getNetwork()});
	}

	@Override
	public int update(NetworkModel model, int id) {
		var query = " update t_network set network = ? where id_network = " + id;
		return jdbc.update(query, new Object[] {model.getNetwork()});
	}

	@Override
	public int delete(int id) {
		var query = "delete from t_network where id_network = " + id ;
		return jdbc.update(query);
	}

}
