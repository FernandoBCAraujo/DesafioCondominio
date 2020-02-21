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

import com.br.itau.models.Despesa;
import com.br.itau.services.DespesaService;

@RestController
@RequestMapping(value = "/despesas")
public class DespesaController {

	@Autowired
	private DespesaService despesaService;

	@GetMapping
	public ResponseEntity<List<Despesa>> findAll(){

		List<Despesa> listaDespesa = despesaService.findAll();
		
		return ResponseEntity.ok().body(listaDespesa);
	}
	
	@GetMapping(value = "/proprietario/{idProprietario}")
	public ResponseEntity<List<Despesa>> findAllDespesasByIdProprietario(@PathVariable Integer idProprietario) {

	List<Despesa> listaDespesa = despesaService.findAllDespesasByIdProprietario(idProprietario);

		return ResponseEntity.ok().body(listaDespesa);
	}
	
//	@GetMapping
//	public ResponseEntity<List<DespesaView>> findAll() {
//
//		List<DespesaView> listaDespesa = despesaService.findAll();
//
//		return ResponseEntity.ok().body(listaDespesa);
//	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Despesa> findById(@PathVariable Integer id) {

		Despesa objDespesa = despesaService.findById(id);

		return ResponseEntity.ok().body(objDespesa);
	}

	@PostMapping
	public ResponseEntity<Despesa> insertDespesas(@RequestBody Despesa objDespesa) {

		objDespesa = despesaService.insertDespesas(objDespesa);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(objDespesa.getIdDespesa()).toUri();
		
		return ResponseEntity.created(uri).body(objDespesa);
	}

}
