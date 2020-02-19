package com.br.itau.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ApartamentoTest {
	
	private String STRING = "STRING";
	
	@Test
	public void testar_getters_e_setters() {
		
		Apartamento apartamento = new Apartamento();
		apartamento.setAndarApartameto(STRING);
		
		assertEquals(STRING, apartamento.getAndarApartameto());
	}

}
