package com.br.itau.models.dto;

import java.io.Serializable;

import com.br.itau.models.Apartamento;
import com.br.itau.models.types.StatusAlugado;

public class ApartamentoView implements Serializable{

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
	
	public static ApartamentoView convert(Apartamento source) {
		ApartamentoView apartamentoView = new ApartamentoView();
		apartamentoView.setIdApartamento(source.getIdApartamento());
		apartamentoView.setStatusAlugado(source.getStatusAlugado());
		apartamentoView.setNumeroApartamento(source.getNumeroApartamento());
		apartamentoView.setProprietario(source.getProprietario().getIdProprietario());
		apartamentoView.setObservacao(source.getObservacao());
		apartamentoView.setVagaEstacionamento(source.getVagaEstacionamento());
		return apartamentoView;
	}
	
}
