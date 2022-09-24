package com.ecommerce.api.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.api.app.DTO.ClienteDTO;
import com.ecommerce.api.app.Mappers.ClienteMapper;
import com.ecommerce.api.app.model.Cliente;
import com.ecommerce.api.app.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@PostMapping("/save")
	public String guardarCliente(@RequestBody ClienteDTO clienteDTO, Model model) {
		
		Cliente cliente = clienteService.guardarCliente(clienteDTO);
		model.addAttribute("cliente", cliente);
		
		return "index";
	}
	
}
