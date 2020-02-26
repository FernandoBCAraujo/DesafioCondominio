package com.br.itau.models;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.br.itau.models.types.StatusAlugado;
import com.br.itau.models.types.StatusPagamentoDespesa;

public class ProprietarioTest {
	
	private String STRING = "STRING";
	private Integer INTEGER = 1;
	
	@Test
	public void testar_getters_e_setters() {
		
		List<Apartamento> listaApartamentos =  new ArrayList<>();
		List<Despesa> listaDespesas =  new ArrayList<>();
		
		Proprietario proprietario = new Proprietario(INTEGER, STRING, STRING, STRING, STRING, listaApartamentos, listaDespesas);
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
		
		Despesa despesa = new Despesa(INTEGER, proprietario, STRING, new BigDecimal(111), LocalDate.now(), LocalDate.now(), StatusPagamentoDespesa.PAGO, STRING);
		despesa.setDataDaDespesa(LocalDate.now());
		despesa.setDataVencimentoDespesa(LocalDate.now());
		despesa.setDescricaoDespesa(STRING);
		despesa.setIdDespesa(INTEGER);
		despesa.setNomeDespesa(STRING);
		despesa.setProprietario(proprietario);
		despesa.setStatusPagamentoDespesa(StatusPagamentoDespesa.PAGO);
		despesa.setValorDespesa(new BigDecimal(111));
		
		listaApartamentos.add(apartamento);
		listaDespesas.add(despesa);
		
		assertEquals(STRING, proprietario.getCpf());
		assertEquals(INTEGER, proprietario.getIdProprietario());
		assertEquals(listaApartamentos, proprietario.getListaApartamentos());
		assertEquals(listaDespesas, proprietario.getListaDespesas());
		assertEquals(STRING, proprietario.getNomeProprietario());
		assertEquals(STRING, proprietario.getNumeroDaIdentidade());
		assertEquals(STRING, proprietario.getNumeroTelefone());
		
	}

}
