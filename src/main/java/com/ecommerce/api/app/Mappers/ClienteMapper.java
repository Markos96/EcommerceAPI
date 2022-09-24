package com.ecommerce.api.app.Mappers;

import com.ecommerce.api.app.DTO.ClienteDTO;
import com.ecommerce.api.app.model.Cliente;

public class ClienteMapper {

	public Cliente toEntity(ClienteDTO clienteDTO) {
		
		Cliente cliente = new Cliente();
		
		cliente.setId(clienteDTO.getId());
		cliente.setDni(clienteDTO.getDni());
		cliente.setVip(clienteDTO.isVip());
		
		return cliente;
		
	}
	
	
}
