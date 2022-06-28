package br.com.claro.swagger.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarroService {
	
	public List<Carro> getCarros() {
		List<Carro> carros = new ArrayList<>();
		
		carros.add(new Carro(1L, "Maverick"));
		carros.add(new Carro(2L, "Impala"));
		carros.add(new Carro(3L, "Fusca"));
		
		return carros;
	}
}