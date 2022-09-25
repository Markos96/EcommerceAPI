package com.ecommerce.api.app.Mappers;

import com.ecommerce.api.app.DTO.DCarritoDTO;
import com.ecommerce.api.app.model.DCarrito;

public class DCarritoMapper {

    public DCarrito toEntity(DCarritoDTO dcarritoDTO){
        DCarrito DCarrito = new DCarrito();

        DCarrito.setId_carrito(dcarritoDTO.getId_carrito());
        DCarrito.setNombreProducto(dcarritoDTO.getNombreProducto());
        DCarrito.setPrecioProducto(dcarritoDTO.getPrecioProducto());
        DCarrito.setCantidadProducto(dcarritoDTO.getCantidadProducto());

        return DCarrito;
    }

}
