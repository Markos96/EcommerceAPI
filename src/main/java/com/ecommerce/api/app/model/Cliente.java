package com.ecommerce.api.app.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "cliente", uniqueConstraints = {@UniqueConstraint(columnNames = {"dni"})})
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String dni;
	
	private boolean isVip;

	@OneToMany(mappedBy = "id_carrito", cascade = CascadeType.ALL)
	public List<Carrito> listCarritos = new ArrayList<>();
	
	public Cliente() {
		
	}
	
	public Cliente(Integer id, String dni, boolean isVip, List<Carrito> listCarritos){
		this.id = id;
		this.dni = dni;
		this.isVip = isVip;
		this.listCarritos = listCarritos;
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

	public List<Carrito> getListCarritos() {
		return listCarritos;
	}

	public void setListCarritos(List<Carrito> listCarritos) {
		this.listCarritos = listCarritos;
	}
}
