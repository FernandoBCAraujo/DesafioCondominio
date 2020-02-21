package com.br.itau.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.itau.models.Apartamento;
import com.br.itau.models.Despesa;
import com.br.itau.models.dto.DespesaView;
import com.br.itau.repositories.DespesaRepository;

@Service
public class DespesaService {
	
	@Autowired
	private DespesaRepository despesaRepository;
	
	public List<Despesa> findAll(){
		return despesaRepository.findAll();
	}
	
	public List<Despesa> findAllDespesasByIdProprietario(Integer idProprietario){
		return despesaRepository.findAllDespesasByIdProprietario(idProprietario);
	}
	
//	public List<DespesaView> findAll(){
//		List<DespesaView> listaDespesaView = new ArrayList<>();
//		for(Despesa d : despesaRepository.findAll()) {
//			DespesaView despesaView = new DespesaView();
//			despesaView = DespesaView.convert(d);
//			listaDespesaView.add(despesaView);
//		}
//		return listaDespesaView;
//	}
	
	public Despesa findById(Integer id) {
		Optional<Despesa> objDespesa = despesaRepository.findById(id);
		return objDespesa.get();
	}
//	public DespesaView findById(Integer id) {
//		Despesa despesa = despesaRepository.findById(id);
//		DespesaView objDespesaView = new DespesaView();
//		objDespesaView = DespesaView.convert(despesa);
//		return objDespesaView.get();
//	}
	
	public Despesa insertDespesas(Despesa objDespesa) {
		return despesaRepository.save(objDespesa);
	}

}
