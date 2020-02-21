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

	public List<Apartamento> findAll() {
		return apartamentoRepository.findAll();
	}

	public Apartamento findById(Integer id) {
		Optional<Apartamento> objApartamento = apartamentoRepository.findById(id);
		return objApartamento.get();
	}

	public List<Apartamento> findAllApartamentosByIdProprietario(Integer idProprietario) {
		return apartamentoRepository.findAllApartamentosByIdProprietario(idProprietario);
	}

	public Apartamento insertApartamentos(Apartamento objApartamento) {

		return apartamentoRepository.save(objApartamento);
	}

	public void deleteApartamento(Integer idApartamento) {
		apartamentoRepository.deleteById(idApartamento);
	}

	public Apartamento updateApartamento(Integer idApartamento, Apartamento apartamento) {
		Apartamento entity = apartamentoRepository.getOne(idApartamento);
		updateDados(entity, apartamento);
		return apartamentoRepository.save(entity);
	}

	private void updateDados(Apartamento entity, Apartamento apartamento) {
		entity.setNumeroApartamento(apartamento.getNumeroApartamento());
		entity.setObservacao(apartamento.getObservacao());
		entity.setStatusAlugado(apartamento.getStatusAlugado());
		entity.setVagaEstacionamento(apartamento.getVagaEstacionamento());

	}

}