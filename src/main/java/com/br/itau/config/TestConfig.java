package com.br.itau.config;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.br.itau.model.Apartamento;
import com.br.itau.model.Despesa;
import com.br.itau.model.Proprietario;
import com.br.itau.model.types.StatusAlugado;
import com.br.itau.repositories.ApartamentoRepository;
import com.br.itau.repositories.DespesaRepository;
import com.br.itau.repositories.ProprietarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ProprietarioRepository proprietarioRepository;

	@Autowired
	private ApartamentoRepository apartamentoRepository;

	@Autowired
	private DespesaRepository despesaRepository;

	public void run(String... args) throws Exception {

		Proprietario proprietario1 = new Proprietario(null, null, null, "Fernando", "08971512477", "6474377");

		Apartamento apartamento1 = new Apartamento(null, proprietario1, "777", "7", StatusAlugado.ALUGADO, "2",
				"Apartamento se encontra com o dono morando.");
		
		Despesa despesa1 = new Despesa(null, "Conta de Energia", new BigDecimal(257), LocalDate.now(),
				"Conta de Energia do apartamento 777", proprietario1);
		
		List<Apartamento> listaApartamento = new ArrayList<Apartamento>();
		listaApartamento.add(apartamento1);
		
		List<Despesa> listaDespesa = new ArrayList<Despesa>();
		listaDespesa.add(despesa1);

		proprietarioRepository.saveAll(Arrays.asList(proprietario1));
		apartamentoRepository.saveAll(Arrays.asList(apartamento1));
		despesaRepository.saveAll(Arrays.asList(despesa1));
	}

}
