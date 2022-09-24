package com.ecommerce.api.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.api.app.model.Cliente;
import com.ecommerce.api.app.repository.ClienteRepository;

public class ClienteServiceImplement {

	@Autowired
	ClienteRepository clienteRepository;
	
	public void guardarCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	public List<Cliente> traerTodos(){
		return clienteRepository.findAll();
	}
	
	public Cliente obtenerUno(Integer id) {
		return clienteRepository.findById(id).get();
	}
	
}
