package com.ecommerce.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@NotNull
	private Integer id;
	
	@NotEmpty
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
