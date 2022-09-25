package com.ecommerce.api.app.controller;

import com.ecommerce.api.app.DTO.CarritoDTO;
import com.ecommerce.api.app.model.Carrito;
import com.ecommerce.api.app.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CarritoController {

    @Autowired
    CarritoService carritoService;

    @PostMapping("/saveCarrito")
    public String guardarCarrito(@RequestBody CarritoDTO carritoDTO, Model model){

        Carrito carrito = carritoService.saveCarrito(carritoDTO);
        model.addAttribute("carrito", carrito);

        return "index";
    }




}
