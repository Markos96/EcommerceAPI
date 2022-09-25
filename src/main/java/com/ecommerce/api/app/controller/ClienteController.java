package com.ecommerce.api.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.api.app.DTO.ClienteDTO;
import com.ecommerce.api.app.model.Cliente;
import com.ecommerce.api.app.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, params= "GCP")
	public ModelAndView gestionCompra(String DNI) {
		ModelAndView model = obtenerVista(DNI);
		model.setViewName("gestionCompras");

		return model;
	}


	@RequestMapping(value = "/save", method = RequestMethod.POST, params= "GCA")
	public ModelAndView gestionCarrito(String DNI) {
		ModelAndView model = obtenerVista(DNI);
		model.setViewName("gestionCarritos");

		return model;
	}

	private ModelAndView obtenerVista(String DNI) {
		Cliente cliente = clienteService.guardarCliente(DNI);
		ModelAndView model = new ModelAndView();
		model.addObject("id_cliente", cliente.getId());
		model.addObject("cliente", cliente.getDni());
		model.addObject("isVip", cliente.isVip());

		return model;
	}

}
