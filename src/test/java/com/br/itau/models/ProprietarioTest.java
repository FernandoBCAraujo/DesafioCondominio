package com.br.itau.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.br.itau.models.types.StatusAlugado;

public class ProprietarioTest {
	
	private String STRING = "STRING";
	private Integer INTEGER = 1;
	
	@Test
	public void testar_getters_e_setters() {
		
		List<Apartamento> listaApartamentos =  new ArrayList<>();
		List<Despesa> listaDespesas =  new ArrayList<>();
		
		Proprietario proprietario = new Proprietario();
		proprietario.setCpf(STRING);
		proprietario.setIdProprietario(INTEGER);
		proprietario.setListaApartamentos(listaApartamentos);
		proprietario.setListaDespesas(listaDespesas);
		proprietario.setNomeProprietario(STRING);
		proprietario.setNumeroDaIdentidade(STRING);
		proprietario.setNumeroTelefone(STRING);
		
		Apartamento apartamento = new Apartamento();
		apartamento.setIdApartamento(INTEGER);
		apartamento.setNumeroApartamento(STRING);
		apartamento.setObservacao(STRING);
		apartamento.setProprietario(proprietario);
		apartamento.setStatusAlugado(StatusAlugado.ALUGADO);
		apartamento.setVagaEstacionamento(STRING);
		
		Despesa despesa = new Despesa();
		despesa.setDataDaDespesa(LocalDate.now());
		despesa.setDataVencimentoDespesa(LocalDate.now());
//		despesa.set
		
		listaApartamentos.add(apartamento);
//		listaDespesas.add(e)
		
	}

}
