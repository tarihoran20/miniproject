package com.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "T_OS")

public class OsModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_os;
	private String os;
	public int getId_os() {
		return id_os;
	}
	public void setId_os(int id_os) {
		this.id_os = id_os;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	

}
