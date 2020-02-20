package com.br.itau.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.br.itau.models.types.StatusAlugado;
import com.br.itau.models.types.StatusPagamentoDespesa;

public class DespesaTest {
	
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
		
		Despesa despesa = new Despesa(INTEGER, proprietario, STRING, new BigDecimal(1), LocalDate.now(), LocalDate.now(), StatusPagamentoDespesa.PAGO, STRING);
		despesa.setDataDaDespesa(LocalDate.now());
		despesa.setDataVencimentoDespesa(LocalDate.now());
		despesa.setDescricaoDespesa(STRING);
		despesa.setIdDespesa(INTEGER);
		despesa.setNomeDespesa(STRING);
		despesa.setProprietario(proprietario);
		despesa.setStatusPagamentoDespesa(StatusPagamentoDespesa.PAGO);
		despesa.setValorDespesa(new BigDecimal(1));
		
		assertEquals(LocalDate.now(), despesa.getDataDaDespesa());
		assertEquals(LocalDate.now(), despesa.getDataVencimentoDespesa());
		assertEquals(STRING, despesa.getDescricaoDespesa());
		assertEquals(INTEGER, despesa.getIdDespesa());
		assertEquals(STRING, despesa.getNomeDespesa());
		assertEquals(proprietario, despesa.getProprietario());
		assertEquals(StatusPagamentoDespesa.PAGO, despesa.getStatusPagamentoDespesa());
		assertEquals(new BigDecimal(1), despesa.getValorDespesa());
		
	}
	
	@Test
	public void testEquals_Symmetric() {
		
		Despesa x = new Despesa();
		Despesa y = new Despesa();
	    assertTrue(x.equals(y) && y.equals(x));
	    assertTrue(x.hashCode() == y.hashCode());

	}

}
