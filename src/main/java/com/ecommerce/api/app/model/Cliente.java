package com.ecommerce.api.app.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "clientes", uniqueConstraints = {@UniqueConstraint(columnNames = {"dni"})})
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String dni;
	private boolean isVip;

	public Cliente() {
		
	}
	
	public Cliente(Integer id, String dni, boolean isVip){
		this.id = id;
		this.dni = dni;
		this.isVip = isVip;
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

	public boolean isVip() {
		return isVip;
	}

	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}

}
