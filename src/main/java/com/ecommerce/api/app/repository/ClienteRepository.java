package com.ecommerce.api.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.api.app.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
