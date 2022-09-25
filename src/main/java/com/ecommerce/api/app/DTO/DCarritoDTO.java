package com.ecommerce.api.app.DTO;

import com.ecommerce.api.app.model.Carrito;

public class DCarritoDTO {

    Carrito id_carrito;

    private String nombreProducto;

    private Double precioProducto;

    private Integer cantidadProducto;

    public DCarritoDTO(){

    }

    public DCarritoDTO(Carrito id_carrito, String nombreProducto, Double precioProducto, Integer cantidadProducto) {
        this.id_carrito = id_carrito;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public Carrito getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(Carrito id_carrito) {
        this.id_carrito = id_carrito;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }


}
