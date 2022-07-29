package com.miniproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.model.OsModel;
import com.miniproject.repository.impl.OsRepository;
import com.miniproject.service.IOsService;

@Service
public class OsService implements IOsService{
	
	@Autowired
	OsRepository osRepository;

	@Override
	public List<OsModel> readAll() {
		return osRepository.readAll();
	}

	@Override
	public String insertos(OsModel osModel) {
		return osRepository.insertos(osModel);
	}

	@Override
	public int update(OsModel model, int id) {
		return osRepository.update(model, id);
	}

	@Override
	public int delete(int id) {
		return osRepository.delete(id);
	}
	
	

}
