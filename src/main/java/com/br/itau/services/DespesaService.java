package com.br.itau.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.itau.models.Despesa;
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
	
	public List<Despesa> findAllDespesasByIdProprietario(Integer idProprietario){
		return despesaRepository.findAllDespesasByIdProprietario(idProprietario);
	}
	
	public Despesa insertDespesas(Despesa objDespesa) {
		return despesaRepository.save(objDespesa);
	}
	
	public void deleteDespesa(Integer idDespesa) {
		despesaRepository.deleteById(idDespesa);
	}
	
	public Despesa updateDespesa(Integer idDespesa, Despesa despesa) {
		Despesa entity = despesaRepository.getOne(idDespesa);
		updateDados(entity, despesa);
		return despesaRepository.save(entity);
	}

	private void updateDados(Despesa entity, Despesa despesa) {
		entity.setDataDaDespesa(despesa.getDataDaDespesa());
		entity.setDataVencimentoDespesa(despesa.getDataVencimentoDespesa());
		entity.setDescricaoDespesa(despesa.getDescricaoDespesa());
		entity.setNomeDespesa(despesa.getNomeDespesa());
		entity.setStatusPagamentoDespesa(despesa.getStatusPagamentoDespesa());
		entity.setValorDespesa(despesa.getValorDespesa());
		
	}

}