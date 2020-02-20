package com.br.itau.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.itau.models.Apartamento;
import com.br.itau.models.Proprietario;
import com.br.itau.models.dto.ApartamentoForm;
import com.br.itau.models.dto.ApartamentoView;
import com.br.itau.repositories.ApartamentoRepository;

@Service
public class ApartamentoService {
	
	@Autowired
	private ApartamentoRepository apartamentoRepository;

	public List<Apartamento> findAll(){
		return apartamentoRepository.findAll();
	}
	
//	public List<ApartamentoView> findAll(){
//		List<ApartamentoView> retorno = new ArrayList<>();
//		for(Apartamento a : apartamentoRepository.findAll()) {
//			ApartamentoView dto = new ApartamentoView();
//			dto = ApartamentoView.convert(a);
//			retorno.add(dto);
//		}
//		return retorno;
//	}
//	
	public Apartamento findById(Integer id) {
		Optional<Apartamento> objApartamento = apartamentoRepository.findById(id);
		return objApartamento.get();
	}
	
//	public Apartamento insertApartamentos(ApartamentoForm apForm) {
	public Apartamento insertApartamentos(Apartamento objApartamento) {
		
//		Proprietario p = findById(apForm.getIdProprietario());
//		
//		setar o prop que veio do banco no apartamento
		return apartamentoRepository.save(objApartamento);
	}
	
//	public Apartamento inserirApartamentosDTO(ApartamentoForm objApartamentoForm) {
//		
//		Apartamento a = findById(objApartamentoForm.getProprietario().getIdProprietario());
//		
//		return apartamentoRepository.save(a);
//	}

}