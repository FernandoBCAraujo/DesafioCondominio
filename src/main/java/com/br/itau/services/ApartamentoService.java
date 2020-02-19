package com.br.itau.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.itau.models.Apartamento;
import com.br.itau.models.Proprietario;
import com.br.itau.models.dto.ApartamentoDTO;
import com.br.itau.repositories.ApartamentoRepository;

@Service
public class ApartamentoService {
	
	@Autowired
	private ApartamentoRepository apartamentoRepository;
	
	public List<ApartamentoDTO> findAll(){
		List<ApartamentoDTO> retorno = new ArrayList<>();
		for(Apartamento a : apartamentoRepository.findAll()) {
			ApartamentoDTO dto = new ApartamentoDTO();
			dto = ApartamentoDTO.convert(a);
			retorno.add(dto);
		}
		return retorno;
	}
	
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

}