package com.tlax.politics.electoral2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "distritos_electorales_locales")
public class Distritos_locales {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column (name = "dist_local_id")
	private Long dist_local_id;
	
	@Column (name = "dist_local_nombre")
	private String dist_local_nombre;
	
	@Column (name = "dist_local_numero")
	private Long dist_local_numero;
	
	@Column (name = "dist_local_coordinador")
	private String dist_local_coordinador;
	
	@Column (name = "isactive")
	private Boolean isactive;
	
	@Column (name = "estado_id")
	private Long estado_id;

	public Long getDist_local_id() {
		return dist_local_id;
	}

	public void setDist_local_id(Long dist_local_id) {
		this.dist_local_id = dist_local_id;
	}

	public String getDist_local_nombre() {
		return dist_local_nombre;
	}

	public void setDist_local_nombre(String dist_local_nombre) {
		this.dist_local_nombre = dist_local_nombre;
	}

	public Long getDist_local_numero() {
		return dist_local_numero;
	}

	public void setDist_local_numero(Long dist_local_numero) {
		this.dist_local_numero = dist_local_numero;
	}

	public String getDist_local_coordinador() {
		return dist_local_coordinador;
	}

	public void setDist_local_coordinador(String dist_local_coordinador) {
		this.dist_local_coordinador = dist_local_coordinador;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	public Long getEstado_id() {
		return estado_id;
	}

	public void setEstado_id(Long estado_id) {
		this.estado_id = estado_id;
	}
	

}
