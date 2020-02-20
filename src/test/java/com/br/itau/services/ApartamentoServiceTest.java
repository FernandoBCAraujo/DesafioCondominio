package com.br.itau.services;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.br.itau.models.Apartamento;
import com.br.itau.models.Proprietario;
import com.br.itau.models.types.StatusAlugado;
import com.br.itau.repositories.ApartamentoRepository;

//@RunWith(MockitoJUnitRunner.class)
public class ApartamentoServiceTest {
	
	@InjectMocks
	ApartamentoService apartamentoService;
	
	@Mock
	ApartamentoRepository  apartamentoRepository;
	
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	private String STRING = "STRING";
	private Integer INTEGER = 1;
	
	@Test
	public void testar_find_all_apartamentos() {
		
		List<Apartamento> listaApartamentos = new ArrayList<>();
		
		Proprietario proprietario = new Proprietario();
		proprietario.setCpf(STRING);
		proprietario.setIdProprietario(INTEGER);
		proprietario.setListaApartamentos(listaApartamentos);
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
		
		listaApartamentos.add(apartamento);
		
		List<Apartamento> expectedApartamentos = Arrays.asList(apartamento);
		
		doReturn(expectedApartamentos).when(apartamentoRepository).findAll();
		
		// when
        List<Apartamento> actualProducts = apartamentoService.findAll();

        // then
        assertThat(actualProducts).isEqualTo(expectedApartamentos);
		
	}
	
	@Test
	public void testar_find_by_id() {
		
		List<Apartamento> listaApartamentos = new ArrayList<>();
		
		Proprietario proprietario = new Proprietario();
		proprietario.setCpf(STRING);
		proprietario.setIdProprietario(INTEGER);
		proprietario.setListaApartamentos(listaApartamentos);
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
		
		listaApartamentos.add(apartamento);
		
		//doReturn(apartamento).when(apartamentoRepository).findById(INTEGER);
		
		when(apartamentoService.findById(INTEGER)).thenReturn(apartamento);
		
		// when
        Apartamento actualProducts = apartamentoService.findById(INTEGER);

        // then
        assertThat(actualProducts).isEqualTo(apartamento);
		
	}

}
