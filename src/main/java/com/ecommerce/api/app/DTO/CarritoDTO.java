package com.ecommerce.api.app.DTO;

import com.ecommerce.api.app.model.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarritoDTO {

    private Integer id_carrito;
    private String nombre;
    private LocalDate fechaCreacion;
    private LocalDate fechaFinalizacion;
    private boolean isSpecial;
    private boolean isFinalizada;
    private Double total;

    private Cliente cliente;

    public List<DCarritoDTO> listDetalles;


    public CarritoDTO(Integer id_carrito, String nombre, LocalDate fechaCreacion, LocalDate fechaFinalizacion, boolean isSpecial, boolean isFinalizada, Double total, Cliente cliente, List<DCarritoDTO>listDetalles) {
        this.id_carrito = id_carrito;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.isSpecial = isSpecial;
        this.isFinalizada = isFinalizada;
        this.total = total;
        this.cliente = cliente;
        this.listDetalles = listDetalles;
    }

    public CarritoDTO(){
        id_carrito = 0;
        nombre = "";
        fechaCreacion = null;
        fechaFinalizacion = null;
        isSpecial = false;
        isFinalizada = false;
        total = 0d;
        cliente = new Cliente();
        listDetalles = new ArrayList<>();
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

    public List<DCarritoDTO> getListDetalles() {
        return listDetalles;
    }

    public void setListDetalles(List<DCarritoDTO> listDetalles) {
        this.listDetalles = listDetalles;
    }
}
