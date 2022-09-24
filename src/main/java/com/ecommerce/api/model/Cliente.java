package com.ecommerce.api.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	private Integer id;
	
	private String dni;
	
	public Cliente() {
		
	}
	
	public Cliente(Integer id, String dni){
		this.id = id;
		this.dni = dni;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
