package com.ecommerce.api.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.api.app.DTO.ClienteDTO;
import com.ecommerce.api.app.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	ClienteDTO save(ClienteDTO clienteDTO);
	
	Optional<Cliente> findByDni(String dni);
	
	boolean existsByDni(String dni);

}
