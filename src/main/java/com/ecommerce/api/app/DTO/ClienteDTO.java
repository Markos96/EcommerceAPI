package com.ecommerce.api.app.DTO;

import com.ecommerce.api.app.model.Carrito;

import java.util.List;

public class ClienteDTO {

	private Integer id;
	
	private String dni;
	
	private boolean isVip;

	private List<CarritoDTO> listaCarritosDTO;

	public ClienteDTO (Integer id, String dni, boolean isVip) {
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

	public List<CarritoDTO> getListaCarritos() {
		return listaCarritosDTO;
	}

	public void setListaCarritos(List<CarritoDTO> listaCarritos) {
		this.listaCarritosDTO = listaCarritos;
	}
}
