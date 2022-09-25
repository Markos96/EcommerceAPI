package com.ecommerce.api.app.service;

import com.ecommerce.api.app.DTO.CarritoDTO;
import com.ecommerce.api.app.Mappers.CarritoMapper;
import com.ecommerce.api.app.model.Carrito;
import com.ecommerce.api.app.repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarritoService {

    @Autowired
    CarritoRepository carritoRepository;

    CarritoMapper carritoMaper = new CarritoMapper();

    public Carrito saveCarrito(CarritoDTO carritoDTO){
        carritoDTO.setFechaCreacion(LocalDate.now());
        return carritoRepository.save(carritoMaper.toEntity(carritoDTO));
    }

    public Carrito obtenerCarrito(Integer id){
        return carritoRepository.findById(id).get();
    }

    public List<Carrito> obtenerCarritos(Integer id){
        return carritoRepository.findAll().stream()
                .filter(carrito -> carrito.getCliente().getId() == id)
                .collect(Collectors.toList());
    }

    public void deleteCarrito(Integer id){
        carritoRepository.deleteById(id);
    }

}
