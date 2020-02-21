package com.br.itau.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.itau.models.Apartamento;
import com.br.itau.services.ApartamentoService;

@RestController
@RequestMapping(value = "/apartamentos")
public class ApartamentoController {
	
	@Autowired
	private ApartamentoService apartamentoService;

	@GetMapping
	public ResponseEntity<List<Apartamento>> findAll() {
		
		List<Apartamento> listaApartamento = apartamentoService.findAll();
		
		return ResponseEntity.ok().body(listaApartamento);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Apartamento> findById(@PathVariable Integer id){
		
		Apartamento objApartamento = apartamentoService.findById(id);
		
		return ResponseEntity.ok().body(objApartamento);
	}
	
	@GetMapping(value = "/proprietario/{idProprietario}")
	public ResponseEntity<List<Apartamento>> findAllApartamentosByIdProprietario(@PathVariable Integer idProprietario) {

	List<Apartamento> listaApartamento = apartamentoService.findAllApartamentosByIdProprietario(idProprietario);

		return ResponseEntity.ok().body(listaApartamento);
	}
	
	@PostMapping
	public ResponseEntity<Apartamento> insertApartamentos(@RequestBody Apartamento objApartamento) {

		objApartamento = apartamentoService.insertApartamentos(objApartamento);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(objApartamento.getIdApartamento()).toUri();
		
		return ResponseEntity.created(uri).body(objApartamento);
	}
	
	@DeleteMapping(value = "/{idApartamento}")
	public ResponseEntity<Void> deleteApartamento(@PathVariable Integer idApartamento){
		apartamentoService.deleteApartamento(idApartamento);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{idApartamento}")
	public ResponseEntity<Apartamento> updateApartamento(@PathVariable Integer idApartamento,
			@RequestBody Apartamento apartamento) {
		apartamento = apartamentoService.updateApartamento(idApartamento, apartamento);
		return ResponseEntity.ok().body(apartamento);

	}
	
}