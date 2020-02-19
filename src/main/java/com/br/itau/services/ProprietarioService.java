package com.br.itau.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.itau.models.Proprietario;
import com.br.itau.repositories.ProprietarioRepository;
import com.br.itau.services.exceptions.ResourceNotFoundException;

@Service
public class ProprietarioService {
	
	@Autowired
	private ProprietarioRepository proprietarioRepository;
	
	public List<Proprietario> findAll(){
		return proprietarioRepository.findAll();
	}

	public Proprietario findById(Integer id) {
		Optional<Proprietario> objProprietario = proprietarioRepository.findById(id);
		return objProprietario.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Proprietario findByName(String nomeProprietario) {
		Optional<Proprietario> objProprietario = proprietarioRepository.findByNomeProprietario(nomeProprietario);
		return objProprietario.orElseThrow(() -> new ResourceNotFoundException(nomeProprietario));
	}
	
	public Proprietario insertProprietarios(Proprietario objProprietario) {
		return proprietarioRepository.save(objProprietario);
	}
}
