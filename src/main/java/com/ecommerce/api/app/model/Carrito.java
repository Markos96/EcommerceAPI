package com.ecommerce.api.app.model;

import com.ecommerce.api.app.DTO.ClienteDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "carrito")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_carrito;
    private String nombre;
    private Date fechaCreacion;
    private Date fechaFinalizacion;
    private boolean isSpecial;
    private boolean isFinalizada;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    public Cliente cliente;


    public Carrito(){

    }

    public Carrito(Integer id_carrito, String nombre, Date fechaCreacion, Date fechaFinalizacion, boolean isSpecial, boolean isFinalizada, Double total, Cliente cliente) {
        super();
        this.id_carrito = id_carrito;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.isSpecial = isSpecial;
        this.isFinalizada = isFinalizada;
        this.total = total;
        this.cliente = cliente;
    }

    public Integer getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(Integer id_carrito) {
        this.id_carrito = id_carrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    public boolean isFinalizada() {
        return isFinalizada;
    }

    public void setFinalizada(boolean finalizada) {
        isFinalizada = finalizada;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
