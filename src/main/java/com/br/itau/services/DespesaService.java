package com.br.itau.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.itau.model.Despesa;
import com.br.itau.repositories.DespesaRepository;

@Service
public class DespesaService {
	
	@Autowired
	private DespesaRepository despesaRepository;
	
	public List<Despesa> findAll(){
		return despesaRepository.findAll();
	}
	
	public Despesa findById(Integer id) {
		Optional<Despesa> objDespesa = despesaRepository.findById(id);
		return objDespesa.get();
	}

}
