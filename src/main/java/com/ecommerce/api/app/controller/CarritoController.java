package com.ecommerce.api.app.controller;

import com.ecommerce.api.app.DTO.CarritoDTO;
import com.ecommerce.api.app.DTO.ClienteDTO;
import com.ecommerce.api.app.service.CarritoService;
import com.ecommerce.api.app.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.NotNull;

@Controller
@RequestMapping("/carritos")
public class CarritoController {

    @Autowired
    CarritoService carritoService;

    @Autowired
    private ClienteService service;

    @PostMapping(value="/saveCarrito")
    public String agregarCarrito(@RequestBody @NotNull CarritoDTO carritoDTO, Model model){
        carritoService.saveCarrito(carritoDTO);

        model.addAttribute("carrito", carritoDTO);

        return "redirect: /clientes/save";
    }

    @GetMapping("/{id}")
    public ModelAndView formCarrito(@PathVariable("id") Integer id){
        ModelAndView model = new ModelAndView();
        model.addObject("id_cliente", id);
        model.setViewName("agregarCarrito");
        return model;
    }

    @PostMapping(value = "/save/{id}")
    public ModelAndView agregarCarrito(@PathVariable("id") Integer idCliente, String nombre, String tipo, ModelAndView model) {
        CarritoDTO carrito = new CarritoDTO();
        carrito.getCliente().setId(idCliente);
        carrito.setNombre(nombre);
        carrito.setSpecial(tipo.equals("especial"));
        carritoService.saveCarrito(carrito);
        ClienteDTO cliente = service.obtenerClienteById(idCliente);
        model.addObject("id_cliente", cliente.getId());
        model.addObject("cliente", cliente.getDni());
        model.addObject("isVip", cliente.isVip());
        model.addObject("carritos", service.obtenerCarritos(idCliente));
        model.setViewName("gestionCarritos");

        return model;
    }
}
