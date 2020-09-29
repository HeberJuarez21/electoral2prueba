package com.tlax.politics.electoral2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "escolaridad")
public class Escolaridad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "escolaridad_id")
	private Long escolaridad_id;
	
	@Column(name = "escolaridad_name")
	private String escolaridad_name;
	
	@Column(name = "isactive")
	private Boolean isactive;

	public Long getEscolaridad_id() {
		return escolaridad_id;
	}

	public void setEscolaridad_id(Long escolaridad_id) {
		this.escolaridad_id = escolaridad_id;
	}

	public String getEscolaridad_name() {
		return escolaridad_name;
	}

	public void setEscolaridad_name(String escolaridad_name) {
		this.escolaridad_name = escolaridad_name;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	
	
}
