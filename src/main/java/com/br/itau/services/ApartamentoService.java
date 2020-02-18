package com.br.itau.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.itau.model.Apartamento;
import com.br.itau.repositories.ApartamentoRepository;

@Service
public class ApartamentoService {
	
	@Autowired
	private ApartamentoRepository apartamentoRepository;
	
	public List<Apartamento> findAll(){
		return apartamentoRepository.findAll();
	}

}
