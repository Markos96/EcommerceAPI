package com.ecommerce.api.app.model;

import javax.persistence.*;

@Entity
@Table(name="DCarrito")
public class DCarrito {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id_detalle;

    private String nombreProducto;

    private Double precioProducto;

    private Integer cantidadProducto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_carrito")
    Carrito id_carrito;

    public DCarrito(){

    }

    public DCarrito(Integer id_detalle,Carrito id_carrito, String nombreProducto, Double precioProducto, Integer cantidadProducto) {
        this.id_detalle = id_detalle;
        this.id_carrito = id_carrito;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public Integer getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(Integer id_detalle) {
        this.id_detalle = id_detalle;
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
