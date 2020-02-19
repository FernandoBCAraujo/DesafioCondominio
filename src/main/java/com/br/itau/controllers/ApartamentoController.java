package com.br.itau.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.itau.models.Apartamento;
import com.br.itau.models.dto.ApartamentoDTO;
import com.br.itau.services.ApartamentoService;

@RestController
@RequestMapping(value = "/apartamentos")
public class ApartamentoController {
	
	@Autowired
	private ApartamentoService apartamentoService;

	@GetMapping
	public ResponseEntity<List<ApartamentoDTO>> findAll() {
		
		List<ApartamentoDTO> listaApartamento = apartamentoService.findAll();
		return ResponseEntity.ok().body(listaApartamento);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Apartamento> findById(@PathVariable Integer id){
		
		Apartamento objApartamento = apartamentoService.findById(id);
		
		return ResponseEntity.ok().body(objApartamento);
	}
	
	@PostMapping
	public ResponseEntity<Apartamento> insertApartamentos(@RequestBody Apartamento objApartamento) {

		objApartamento = apartamentoService.insertApartamentos(objApartamento);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(objApartamento.getIdApartamento()).toUri();
		
		return ResponseEntity.created(uri).body(objApartamento);
	}

}