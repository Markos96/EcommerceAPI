package com.ecommerce.api.app.model;

import javax.persistence.*;

@Entity
@Table(name="DCarrito")
public class DCarrito {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nombreProducto;

    private Double precioProducto;

    private Integer cantidadProducto;

    @ManyToOne
    @JoinColumn(name = "id_carrito")
    Carrito carrito;

    public DCarrito(){

    }

    public DCarrito(Integer id_detalle,Carrito id_carrito, String nombreProducto, Double precioProducto, Integer cantidadProducto) {
        this.id = id_detalle;
        this.carrito = id_carrito;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public Integer getId_detalle() {
        return id;
    }

    public void setId_detalle(Integer id_detalle) {
        this.id = id_detalle;
    }

    public Carrito getId_carrito() {
        return carrito;
    }

    public void setId_carrito(Carrito id_carrito) {
        this.carrito = id_carrito;
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
