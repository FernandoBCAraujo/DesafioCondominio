package com.br.itau.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.itau.models.Apartamento;
import com.br.itau.repositories.ApartamentoRepository;

@Service
public class ApartamentoService {
	
	@Autowired
	private ApartamentoRepository apartamentoRepository;

	public List<Apartamento> findAll(){
		return apartamentoRepository.findAll();
	}

	public Apartamento findById(Integer id) {
		Optional<Apartamento> objApartamento = apartamentoRepository.findById(id);
		return objApartamento.get();
	}
	
	public Apartamento insertApartamentos(Apartamento objApartamento) {
		
		return apartamentoRepository.save(objApartamento);
	}
	
}