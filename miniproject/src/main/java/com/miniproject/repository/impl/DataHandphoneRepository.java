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
		var query = "select * from t_datahandphone";
		return jdbc.query(query, new BeanPropertyRowMapper<DataHandphoneModel>(DataHandphoneModel.class));
	}

	@Override
	public String insert(DataHandphoneModel model, String id_brand, String type, String id_os, String id_chipset,
			String[] id_network, int price) {

		for (int i = 0; i < id_network.length; i++) {
			if (id_network[i] != "," && id_network[i] != " ") {
				var query = " insert into t_datahandphone (id_brand, type, id_os, id_chipset, id_network, price)"
						+ "value (?, ?, ?, ?, " + id_network[i] + ", ?)";
				jdbc.update(query, new Object[] { model.getId_brand(), model.getType(), model.getId_os(),
						model.getId_chipset(), model.getPrice() });
			}
		}

		return "Inserted --> ";
	}

	@Override
	public List<DataHandphoneModel> read() {
		var query = "select*from(\r\n"
				+ "select t_datahandphone.id, t_datahandphone.type as type,  t_brand.brand as id_brand, t_os.os as id_os, t_chipset.chipset as id_chipset,\r\n"
				+ "t_datahandphone.price as price, t_network.network as id_network\r\n" + "from t_datahandphone\r\n"
				+ "join t_brand on t_datahandphone.id_brand = t_brand.id_brand\r\n"
				+ "join t_os on t_datahandphone.id_os = t_os.id_os\r\n"
				+ "join t_chipset on t_datahandphone.id_chipset = t_chipset.id_chipset\r\n"
				+ "join t_network on t_datahandphone.id_network = t_network.id_network  group by t_datahandphone.type ) as tb\r\n"
				+ ";";
//		
//		var query2 = "select t_network.network\r\n"
//				+ "from t_datahandphone\r\n"
//				+ "join t_network\r\n"
//				+ "on t_datahandphone.id_network = t_network.id_network\r\n"
//				+ "where t_datahandphone.type like '%A03s%';";
		
		return jdbc.query(query, new BeanPropertyRowMapper<DataHandphoneModel>(DataHandphoneModel.class));

	}

	@Override
	public List<PhoneNetworkModel> readnetwork() {
		var query = "select t_datahandphone.id, t_datahandphone.type, t_network.network\r\n"
				+ "from t_datahandphone\r\n" + "join t_network\r\n"
				+ "on t_datahandphone.id_network = t_network.id_network";
		return jdbc.query(query, new BeanPropertyRowMapper<PhoneNetworkModel>(PhoneNetworkModel.class));
	}

	public  int deletehandphone(String phone) {
		var query = "delete from t_datahandphone where type like '%?%';";
		return jdbc.update(query, phone);
	}


}
