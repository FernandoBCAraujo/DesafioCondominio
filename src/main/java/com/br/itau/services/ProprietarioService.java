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
	
	public Proprietario findByNomeProprietario(String nomeProprietario) {
		Optional<Proprietario> objProprietario = proprietarioRepository.findByNomeProprietario(nomeProprietario);
		return objProprietario.orElseThrow(() -> new ResourceNotFoundException(nomeProprietario));
	}
	
	public Proprietario insertProprietarios(Proprietario objProprietario) {
		return proprietarioRepository.save(objProprietario);
	}
	
	public void deleteProprietario(Integer idProprietario) {
		proprietarioRepository.deleteById(idProprietario);
	}
	
	public Proprietario updateProprietario(Integer idProprietario, Proprietario proprietario) {
		Proprietario entity = proprietarioRepository.getOne(idProprietario);
		updateDados(entity, proprietario);
		return proprietarioRepository.save(entity);
	}

	private void updateDados(Proprietario entity, Proprietario proprietario) {
		entity.setCpf(proprietario.getCpf());
		entity.setNomeProprietario(proprietario.getNomeProprietario());
		entity.setNumeroDaIdentidade(proprietario.getNumeroDaIdentidade());
		entity.setNumeroTelefone(proprietario.getNumeroTelefone());
		entity.setListaApartamentos(proprietario.getListaApartamentos());
		entity.setListaDespesas(proprietario.getListaDespesas());
		
	}
}
