package com.miniproject.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.miniproject.model.DataHandphoneModel;
import com.miniproject.model.PhoneJoinNetworkModel;
import com.miniproject.model.PhoneNetworkModel;
import com.miniproject.repository.IDataHandphoneRepository;

@Repository
public class DataHandphoneRepository implements IDataHandphoneRepository {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public List<DataHandphoneModel> readAll() {
		var query = "select t_datahandphone.id, t_datahandphone.type as type,  t_brand.brand as brand, t_os.os as os, t_chipset.chipset as chipset,\r\n"
				+ "t_datahandphone.price as price\r\n"
				+ "from t_datahandphone\r\n"
				+ "join t_brand on t_datahandphone.id_brand = t_brand.id_brand\r\n"
				+ "join t_os on t_datahandphone.id_os = t_os.id_os\r\n"
				+ "join t_chipset on t_datahandphone.id_chipset = t_chipset.id_chipset order by t_datahandphone.id desc";
		
		
		return jdbc.query(query, new BeanPropertyRowMapper<DataHandphoneModel>(DataHandphoneModel.class));
	}

	@Override
	public List<DataHandphoneModel> read() {
		var query = "select t_datahandphone.id, t_datahandphone.type as type,  t_brand.brand as brand, t_os.os as os, t_chipset.chipset as chipset,\r\n"
				+ "t_datahandphone.price as price\r\n"
				+ "from t_datahandphone\r\n"
				+ "join t_brand on t_datahandphone.id_brand = t_brand.id_brand\r\n"
				+ "join t_os on t_datahandphone.id_os = t_os.id_os\r\n"
				+ "join t_chipset on t_datahandphone.id_chipset = t_chipset.id_chipset";
//		
//		
		return jdbc.query(query, new BeanPropertyRowMapper<DataHandphoneModel>(DataHandphoneModel.class));

	}

	@Override
	public List<PhoneNetworkModel> readnetwork() {
		var query = "select t_datahandphone.id, t_datahandphone.type, t_network.network\r\n"
				+ "from t_datahandphone\r\n" + "join t_network\r\n"
				+ "on t_datahandphone.id_network = t_network.id_network";
		return jdbc.query(query, new BeanPropertyRowMapper<PhoneNetworkModel>(PhoneNetworkModel.class));
	}


	@Override
	public String insertdatahandphone(DataHandphoneModel dhModel) {
		var query = "insert into t_datahandphone (type, id_brand, id_chipset, id_os, price) value (?, ?, ?, ?, ?)";
		return ""+jdbc.update(query, new Object[] {dhModel.getType(), dhModel.getBrand(), dhModel.getChipset(), dhModel.getOs(), dhModel.getPrice()});
	}

	@Override
	public int updatedatahandphone(DataHandphoneModel dhModel, int id) {
		var query = "update t_datahandphone set type = ?, id_brand = ?, id_chipset = ?, id_os = ?, price = ? where id = " + id;
		return jdbc.update(query, new Object[] {dhModel.getType(), dhModel.getBrand(), dhModel.getChipset(), dhModel.getOs(), dhModel.getPrice()});
	}

	@Override
	public int deletedatahandphone(int id) {
		var query = "delete from t_datahandphone where id = " + id;
		return jdbc.update(query);
	}

}
