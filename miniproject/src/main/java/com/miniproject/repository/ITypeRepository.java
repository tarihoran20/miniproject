package com.miniproject.repository;

import java.util.List;

import com.miniproject.model.TypeModel;

public interface ITypeRepository {

	public List<TypeModel> readAll();
}
