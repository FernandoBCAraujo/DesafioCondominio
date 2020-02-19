package com.br.itau.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.itau.models.Proprietario;
import com.br.itau.repositories.ProprietarioRepository;

@Service
public class ProprietarioService {
	
	@Autowired
	private ProprietarioRepository proprietarioRepository;
	
	public List<Proprietario> findAll(){
		return proprietarioRepository.findAll();
	}

	public Proprietario findById(Integer id) {
		Optional<Proprietario> objProprietario = proprietarioRepository.findById(id);
		return objProprietario.get();
	}
	
	public Proprietario findByName(String nomeProprietario) {
		Optional<Proprietario> objProprietario = proprietarioRepository.findByNomeProprietario(nomeProprietario);
		return objProprietario.get();
	}
}
