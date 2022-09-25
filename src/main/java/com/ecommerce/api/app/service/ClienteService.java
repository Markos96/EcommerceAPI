package com.ecommerce.api.app.service;

import java.util.List;
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
	
	
	public Cliente guardarCliente(String DNI) {
		
		Cliente cliente = new Cliente();
		
		if(existeCliente(DNI)) {
			cliente = obtenerUnCliente(DNI);
		}else {
			cliente.setDni(DNI);
			cliente = clienteRepository.save(cliente);
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
