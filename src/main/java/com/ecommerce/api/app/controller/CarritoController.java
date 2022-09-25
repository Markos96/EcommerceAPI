package com.ecommerce.api.app.controller;

import com.ecommerce.api.app.DTO.CarritoDTO;
import com.ecommerce.api.app.model.Carrito;
import com.ecommerce.api.app.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.constraints.NotNull;
import java.util.List;

@Controller
@RequestMapping("/carritos")
public class CarritoController {

    @Autowired
    CarritoService carritoService;

/*
    @RequestMapping(value="/list", method= RequestMethod.GET)
    public String listarCarritos(Model model){
        List<Carrito> listaCarritos = carritoService.obtenerCarritos();

        model.addAttribute("listaCarritos", listaCarritos);

        return "gestionCarritos";
    }
*/

    @PostMapping(value="/saveCarrito")
    public String agregarCarrito(@RequestBody @NotNull CarritoDTO carritoDTO, Model model){
        carritoService.saveCarrito(carritoDTO);

        model.addAttribute("carrito", carritoDTO);

        return "index";
    }
}
