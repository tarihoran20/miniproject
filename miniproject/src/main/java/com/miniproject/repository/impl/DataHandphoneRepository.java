package com.miniproject.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.repository.IDataHandphoneRepository;

@Repository
public class DataHandphoneRepository implements IDataHandphoneRepository {
	
	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<DataHandphoneModel> readAll() {
		var query = "select * from t_datahandphone";
		return jdbc.query(query, new BeanPropertyRowMapper<DataHandphoneModel>(DataHandphoneModel.class));
	}

	@Override
	public String insert(DataHandphoneModel model, String idBrand, String type, String idOs, String idChipset,
			String idNetwork, int price ) {
		var query = " insert into t_datahandphone (id_Brand, type, id_Os, id_Chipset, id_network, price)" +
			"value (?, ?, ?, ?, ?, ?)" ;
		return "Inserted --> " + jdbc.update(query, new Object[] {model.getId_brand(), model.getType(), model.getId_os(),
				model.getId_chipset(), model.getPrice()});
	}

	@Override
	public List<DataHandphoneModel> read() {
		var query = "select t_brand.brand as id_brand, t_datahandphone.type as type, t_os.os as id_os, t_chipset.chipset as id_chipset,\r\n"
				+ "t_network.network as id_network, t_datahandphone.price as price\r\n"
				+ "from t_datahandphone\r\n"
				+ "join t_brand on t_datahandphone.id_brand = t_brand.id_brand\r\n"
				+ "join t_os on t_datahandphone.id_os = t_os.id_os\r\n"
				+ "join t_chipset on t_datahandphone.id_chipset = t_chipset.id_chipset\r\n"
				+ "join t_network on t_datahandphone.id_network = t_network.id_network";
		
		
		return jdbc.query(query, new BeanPropertyRowMapper<DataHandphoneModel>(DataHandphoneModel.class));
	}
	


}
