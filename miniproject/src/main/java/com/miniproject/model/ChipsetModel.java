package com.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "T_CHIPSET")

public class ChipsetModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_chipset;
	private String chipset;
	
	public int getId_chipset() {
		return id_chipset;
	}
	public void setId_chipset(int id_chipset) {
		this.id_chipset = id_chipset;
	}
	public String getChipset() {
		return chipset;
	}
	public void setChipset(String chipset) {
		this.chipset = chipset;
	} 
	
	

}
