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

import com.br.itau.models.Apartamento;
import com.br.itau.models.Despesa;
import com.br.itau.models.Proprietario;
import com.br.itau.models.types.StatusAlugado;
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

		Proprietario proprietario1 = new Proprietario(null, "Fernando", "08971512477", "8130343854", "6474377", null,
				null);
		Proprietario proprietario2 = new Proprietario(null, "Maria da Silva", "88764437035", "8130984285", "456051843",
				null, null);

		Apartamento apartamento1 = new Apartamento(null, proprietario1, "777", StatusAlugado.ALUGADO, "2",
				"Apartamento encontra-se com o dono morando.");
		Apartamento apartamento2 = new Apartamento(null, proprietario2, "700", StatusAlugado.DESALUGADO, "1",
				"Apartamento encontra-se desalugado.");

		Despesa despesa1 = new Despesa(null, proprietario1, "Conta de Energia", new BigDecimal(257), LocalDate.now(), LocalDate.of(2020, 03, 19),
				"Conta de Energia do apartamento 777");
		
		Despesa despesa2 = new Despesa(null, proprietario2, "Conta de Água", new BigDecimal(145), LocalDate.now(), LocalDate.of(2020, 03, 19),
				"Conta de água do apartamento 700");
		
		Despesa despesa3 = new Despesa(null, proprietario1, "Condominio", new BigDecimal(349), LocalDate.now(), LocalDate.of(2020, 03, 19),
				"Conta Condominio do Apartamento 777");

		List<Apartamento> listaApartamento = new ArrayList<Apartamento>();
		listaApartamento.add(apartamento1);
		listaApartamento.add(apartamento2);

		List<Despesa> listaDespesa = new ArrayList<Despesa>();
		listaDespesa.add(despesa1);
		listaDespesa.add(despesa2);
		listaDespesa.add(despesa3);
		
		

		proprietarioRepository.saveAll(Arrays.asList(proprietario1, proprietario2));
		apartamentoRepository.saveAll(Arrays.asList(apartamento1, apartamento2));
		despesaRepository.saveAll(Arrays.asList(despesa1, despesa2, despesa3));
	}

}
