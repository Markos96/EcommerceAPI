package com.ecommerce.api.service;

import java.util.List;

import com.ecommerce.api.model.Cliente;
import com.ecommerce.api.repository.ClienteRepository;

public interface ClienteService extends ClienteRepository{

	public void guardarCliente(Cliente cliente);
	
	public List<Cliente> obtenerClientes();
	
	public Cliente obtenerUnCliente(Integer id);
	
}
