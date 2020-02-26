package com.br.itau.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.br.itau.models.Apartamento;
import com.br.itau.models.Despesa;
import com.br.itau.models.Proprietario;
import com.br.itau.models.types.StatusAlugado;
import com.br.itau.models.types.StatusPagamentoDespesa;
import com.br.itau.repositories.ProprietarioRepository;

public class ProprietarioServiceTest {
	
	@InjectMocks
	ProprietarioService proprietarioService;

	@Mock
	ProprietarioRepository proprietarioRepositoryMock;

	@Before
	public void init() {

		MockitoAnnotations.initMocks(this);
	}

	private String STRING = "STRING";
	private Integer INTEGER = 1;
	
	@Test
	public void testar_find_all_proprietarios() {
		
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

		listaApartamentos.add(apartamento);
		listaDespesas.add(despesa);
		
		List<Proprietario> expectedProprietarios = Arrays.asList(proprietario);

		doReturn(expectedProprietarios).when(proprietarioRepositoryMock).findAll();

		List<Proprietario> actualProducts = proprietarioService.findAll();

		assertThat(actualProducts).isEqualTo(expectedProprietarios);
		
	}
	
	@Test
	public void testar_find_by_id() {
		
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

		listaApartamentos.add(apartamento);
		listaDespesas.add(despesa);
		
		when(proprietarioRepositoryMock.findById(INTEGER)).thenReturn(Optional.of(proprietario));

		Proprietario actualProducts = proprietarioService.findById(INTEGER);

		assertThat(actualProducts).isEqualTo(proprietario);
		
	}
	@Test
	public void testar_find_by_nome() {
		
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
		
		listaApartamentos.add(apartamento);
		listaDespesas.add(despesa);
		
		when(proprietarioRepositoryMock.findByNomeProprietario(STRING)).thenReturn(Optional.of(proprietario));
		
		Proprietario actualProducts = proprietarioService.findByNomeProprietario(STRING);
		
		assertThat(actualProducts).isEqualTo(proprietario);
		
	}
	
}
