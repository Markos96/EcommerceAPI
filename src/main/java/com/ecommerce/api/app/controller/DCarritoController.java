package com.ecommerce.api.app.controller;

import com.ecommerce.api.app.DTO.DCarritoDTO;
import com.ecommerce.api.app.model.Carrito;
import com.ecommerce.api.app.model.DCarrito;
import com.ecommerce.api.app.service.DCarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class DCarritoController {

    @Autowired
    DCarritoService DCarritoService;

    @PostMapping("/guardarDetalle")
    public String saveDetalle(@RequestBody DCarritoDTO DCarritoDTO, Model model){
        DCarrito dcarrito = DCarritoService.guardarDetalle(DCarritoDTO);
        model.addAttribute("carrito", dcarrito);

        return "index";
    }

}
