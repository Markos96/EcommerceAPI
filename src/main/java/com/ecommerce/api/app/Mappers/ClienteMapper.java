package com.ecommerce.api.app.Mappers;

import com.ecommerce.api.app.DTO.CarritoDTO;
import com.ecommerce.api.app.DTO.ClienteDTO;
import com.ecommerce.api.app.model.Carrito;
import com.ecommerce.api.app.model.Cliente;

import java.util.stream.Collectors;

public class ClienteMapper {

	public Cliente toEntity(ClienteDTO clienteDTO) {
		
		Cliente cliente = new Cliente();
		
		cliente.setId(clienteDTO.getId());
		cliente.setDni(clienteDTO.getDni());
		cliente.setVip(clienteDTO.isVip());
		cliente.setListCarritos(
				clienteDTO.getListaCarritos().stream().map(
						ent -> new Carrito(
								ent.getId_carrito(),
								ent.getNombre(),
								ent.getFechaCreacion(),
								ent.getFechaFinalizacion(),
								ent.isSpecial(),
								ent.isFinalizada(),
								ent.getTotal(),
								cliente
						)
		).collect(Collectors.toList()));

		return cliente;
		
	}
	
	
}
