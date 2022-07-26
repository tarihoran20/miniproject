package com.miniproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.model.TypeModel;
import com.miniproject.repository.impl.TypeRepository;
import com.miniproject.service.ITypeService;

@Service
public class TypeService implements ITypeService {

	@Autowired
	TypeRepository typeRepository;
	
	@Override
	public List<TypeModel> readAll() {
		return typeRepository.readAll();
	}

}
