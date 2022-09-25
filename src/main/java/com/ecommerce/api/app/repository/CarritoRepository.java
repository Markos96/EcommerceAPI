package com.ecommerce.api.app.repository;

import com.ecommerce.api.app.DTO.CarritoDTO;
import com.ecommerce.api.app.DTO.ClienteDTO;
import com.ecommerce.api.app.model.Carrito;
import com.ecommerce.api.app.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Integer> {

    CarritoDTO save(CarritoDTO carritoDTO);
}
