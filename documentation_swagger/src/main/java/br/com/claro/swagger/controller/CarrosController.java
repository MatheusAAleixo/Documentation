package br.com.claro.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.claro.swagger.entity.CarroService;
import br.com.claro.swagger.entity.Carro;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {
	@Autowired
	private CarroService service;
	
	@GetMapping()
	public List<Carro> get() {
		return service.getCarros();
	}	
}