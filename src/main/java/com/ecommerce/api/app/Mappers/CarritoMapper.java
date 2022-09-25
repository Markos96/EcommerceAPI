package com.ecommerce.api.app.Mappers;

import com.ecommerce.api.app.DTO.CarritoDTO;
import com.ecommerce.api.app.model.Carrito;
import com.ecommerce.api.app.model.DCarrito;

import java.util.stream.Collectors;

public class CarritoMapper {

    public Carrito toEntity(CarritoDTO carritoDTO){

        Carrito carrito = new Carrito();

        carrito.setId(carritoDTO.getId_carrito());
        carrito.setNombre(carritoDTO.getNombre());
        carrito.setFechaCreacion(carritoDTO.getFechaCreacion());
        carrito.setFechaFinalizacion(carritoDTO.getFechaFinalizacion());
        carrito.setSpecial(carritoDTO.isSpecial());
        carrito.setFinalizada(carritoDTO.isFinalizada());
        carrito.setTotal(carritoDTO.getTotal());
        carrito.setCliente(carritoDTO.getCliente());
        return carrito;
    }

}
