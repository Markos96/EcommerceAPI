package com.ecommerce.api.app.Mappers;

import com.ecommerce.api.app.DTO.CarritoDTO;
import com.ecommerce.api.app.DTO.ClienteDTO;
import com.ecommerce.api.app.model.Carrito;
import com.ecommerce.api.app.model.Cliente;

import java.util.stream.Collectors;

public class ClienteMapper {

	public Cliente toEntity(ClienteDTO clienteDTO) {
		return new Cliente(clienteDTO.getId(), clienteDTO.getDni(), clienteDTO.isVip());
	}

	public ClienteDTO toDTO(Cliente cliente) {
		return new ClienteDTO(cliente.getId(), cliente.getDni(), cliente.isVip());
	}
}
