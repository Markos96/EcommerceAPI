package com.ecommerce.api.app.service;

import java.util.List;

import com.ecommerce.api.app.model.Cliente;
import com.ecommerce.api.app.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService extends ClienteRepository{

	public void guardarCliente(Cliente cliente);
	
	public List<Cliente> obtenerClientes();
	
	public Cliente obtenerUnCliente(Integer id);
	
}
