package com.ecommerce.api.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComprasController {

    @GetMapping("/compras")
    public String indexCompras() {
        return "gestionCompras";
    }
}
