package com.br.itau.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.itau.models.Apartamento;
import com.br.itau.repositories.ApartamentoRepository;

@RestController
@RequestMapping(value = "/apartamentos")
public class ApartamentoController {
	
	@Autowired
	private ApartamentoRepository apartamentoRepository;

	@GetMapping
	public ResponseEntity<List<Apartamento>> findAll() {
		
		List<Apartamento> listaApartamento = apartamentoRepository.findAll();
		return ResponseEntity.ok().body(listaApartamento);
	}

}
