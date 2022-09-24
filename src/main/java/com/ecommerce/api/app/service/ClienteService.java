package com.ecommerce.api.app.service;

import java.util.List;

import com.ecommerce.api.app.DTO.ClienteDTO;
import com.ecommerce.api.app.Mappers.ClienteMapper;
import com.ecommerce.api.app.model.Cliente;
import com.ecommerce.api.app.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	ClienteMapper clienteMapper = new ClienteMapper();
	
	
	public Cliente guardarCliente(ClienteDTO clienteDTO) {
		
		Cliente cliente = null;
		
		if(existeCliente(clienteDTO.getDni())) {
			cliente = obtenerUnCliente(clienteDTO.getDni());
		}else {
			cliente = clienteRepository.save(clienteMapper.toEntity(clienteDTO));
		}
		
		return cliente;
	}

	public List<Cliente> obtenerClientes() {
		return clienteRepository.findAll();
	}

	public Cliente obtenerUnCliente(String dni){
		return clienteRepository.findByDni(dni).get();
	}

	public boolean existeCliente(String dni){
		return clienteRepository.existsByDni(dni);
	}

}
