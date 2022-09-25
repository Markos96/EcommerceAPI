package com.ecommerce.api.app.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "carritos")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private LocalDate fechaCreacion;
    private LocalDate fechaFinalizacion;
    private boolean isSpecial;
    private boolean isFinalizada;
    private Double total;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    public Cliente cliente;

    public Carrito(){

    }

    public Carrito(Integer id_carrito, String nombre, LocalDate fechaCreacion, LocalDate fechaFinalizacion, boolean isSpecial, boolean isFinalizada, Double total, Cliente cliente) {
        super();
        this.id = id_carrito;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.isSpecial = isSpecial;
        this.isFinalizada = isFinalizada;
        this.total = total;
        this.cliente = cliente;
    }

    public Carrito(Integer id_carrito, List<DCarrito>listDetalle){
        this.id = id_carrito;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id_carrito) {
        this.id = id_carrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
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
