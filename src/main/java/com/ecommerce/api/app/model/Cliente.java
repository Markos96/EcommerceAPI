package com.ecommerce.api.app.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "cliente", uniqueConstraints = {@UniqueConstraint(columnNames = {"dni"})})
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String dni;
	
	private boolean isVip;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.DETACH)
	private Set<Carrito> listCarritos = new HashSet<>();
	
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

	public boolean isVip() {
		return isVip;
	}

	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}

	public Set<Carrito> getListCarritos() {
		return listCarritos;
	}

	public void setListCarritos(Set<Carrito> listCarritos) {
		this.listCarritos = listCarritos;
	}
}
