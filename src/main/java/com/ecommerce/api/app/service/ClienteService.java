package com.ecommerce.api.app.service;

import java.util.List;

import com.ecommerce.api.app.DTO.ClienteDTO;
import com.ecommerce.api.app.Mappers.ClienteMapper;
import com.ecommerce.api.app.model.Carrito;
import com.ecommerce.api.app.model.Cliente;
import com.ecommerce.api.app.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	private CarritoService carritoService;
	
	ClienteMapper clienteMapper = new ClienteMapper();
	
	
	public ClienteDTO obtenerGuardarCliente(String DNI) {
		
		Cliente cliente = new Cliente();
		
		if(existeCliente(DNI)) {
			cliente = obtenerUnCliente(DNI);
		}else {
			cliente.setDni(DNI);
			cliente = clienteRepository.save(cliente);
		}
		
		return clienteMapper.toDTO(cliente);
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

	public List<Carrito> obtenerCarritos(Integer id) {
		return carritoService.obtenerCarritos(id);
	}
}
