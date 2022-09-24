package com.ecommerce.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
