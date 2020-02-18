package com.br.itau.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.itau.model.Despesa;
import com.br.itau.services.DespesaService;

@RestController
@RequestMapping(value = "/despesas")
public class DespesaController {

	@Autowired
	private DespesaService despesaService;

	@GetMapping
	public ResponseEntity<List<Despesa>> findAll() {

		List<Despesa> listaDespesa = despesaService.findAll();

		return ResponseEntity.ok().body(listaDespesa);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Despesa> findById(@PathVariable Integer id){
		
		Despesa objDespesa = despesaService.findById(id);
		
		return ResponseEntity.ok().body(objDespesa);
	}
}
