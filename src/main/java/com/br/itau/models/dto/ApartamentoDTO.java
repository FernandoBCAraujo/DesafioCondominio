package com.br.itau.models.dto;

import java.io.Serializable;

import com.br.itau.models.Apartamento;
import com.br.itau.models.Proprietario;
import com.br.itau.models.types.StatusAlugado;

public class ApartamentoDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer idApartamento;

	private Integer proprietario;

	private String numeroApartamento;

	private StatusAlugado statusAlugado;

	private String vagaEstacionamento;

	private String observacao;

	public Integer getIdApartamento() {
		return idApartamento;
	}

	public void setIdApartamento(Integer idApartamento) {
		this.idApartamento = idApartamento;
	}

	public Integer getProprietario() {
		return proprietario;
	}

	public void setProprietario(Integer proprietario) {
		this.proprietario = proprietario;
	}

	public String getNumeroApartamento() {
		return numeroApartamento;
	}

	public void setNumeroApartamento(String numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
	}

	public StatusAlugado getStatusAlugado() {
		return statusAlugado;
	}

	public void setStatusAlugado(StatusAlugado statusAlugado) {
		this.statusAlugado = statusAlugado;
	}

	public String getVagaEstacionamento() {
		return vagaEstacionamento;
	}

	public void setVagaEstacionamento(String vagaEstacionamento) {
		this.vagaEstacionamento = vagaEstacionamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public static ApartamentoDTO convert(Apartamento source) {
		ApartamentoDTO apartamento = new ApartamentoDTO();
		apartamento.setIdApartamento(source.getIdApartamento());
		apartamento.setStatusAlugado(source.getStatusAlugado());
		apartamento.setNumeroApartamento(source.getNumeroApartamento());
		apartamento.setProprietario(source.getProprietario().getIdProprietario());
		//apartamento.setObservacao(source.);
		return apartamento;
	}
	
}
