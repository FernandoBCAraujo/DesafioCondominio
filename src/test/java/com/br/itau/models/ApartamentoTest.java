package com.br.itau.models;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.br.itau.models.types.StatusAlugado;

public class ApartamentoTest {
	
	private String STRING = "STRING";
	private Integer INTEGER = 1;
	
	@Test
	public void testar_getters_e_setters() {
		
		List<Apartamento> listaApartamentos = new ArrayList<>();
		
		Proprietario proprietario = new Proprietario();
		proprietario.setCpf(STRING);
		proprietario.setIdProprietario(INTEGER);
		proprietario.setListaApartamentos(listaApartamentos);
		proprietario.setNomeProprietario(STRING);
		proprietario.setNumeroDaIdentidade(STRING);
		proprietario.setNumeroTelefone(STRING);
		
		@SuppressWarnings("unused")
		Apartamento apartamentoVazio = new Apartamento();
		Apartamento apartamento = new Apartamento(INTEGER, proprietario, STRING, StatusAlugado.ALUGADO, STRING, STRING);
		apartamento.setIdApartamento(INTEGER);
		apartamento.setNumeroApartamento(STRING);
		apartamento.setObservacao(STRING);
		apartamento.setProprietario(proprietario);
		apartamento.setStatusAlugado(StatusAlugado.ALUGADO);
		apartamento.setVagaEstacionamento(STRING);
		
		listaApartamentos.add(apartamento);
		
		assertEquals(INTEGER, apartamento.getIdApartamento());
		assertEquals(STRING, apartamento.getNumeroApartamento());
		assertEquals(STRING, apartamento.getObservacao());
		assertEquals(proprietario, apartamento.getProprietario());
		assertEquals(StatusAlugado.ALUGADO, apartamento.getStatusAlugado());
		assertEquals(STRING, apartamento.getVagaEstacionamento());

	}

}
