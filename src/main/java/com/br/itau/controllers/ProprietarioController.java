package com.br.itau.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.itau.models.Proprietario;
import com.br.itau.services.ProprietarioService;

@RestController
@RequestMapping(value = "/proprietarios")
public class ProprietarioController {
	
	@Autowired
	private ProprietarioService proprietarioService;
	
	@GetMapping
	public ResponseEntity<List<Proprietario>> findAll(){

		List<Proprietario> listaProprietario = proprietarioService.findAll();
		
		return ResponseEntity.ok().body(listaProprietario);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Proprietario> findById(@PathVariable Integer id){
		
		Proprietario objProprietario = proprietarioService.findById(id);
		
		return ResponseEntity.ok().body(objProprietario);
	}
	
	@GetMapping(value = "/nome/{nomeProprietario}")
	public ResponseEntity<Proprietario> findByName(@PathVariable String nomeProprietario){
		
		Proprietario objProprietario = proprietarioService.findByName(nomeProprietario);
		
		return ResponseEntity.ok().body(objProprietario);
	}
	
}
