package com.br.itau.models.dto;

import java.io.Serializable;

import com.br.itau.models.Apartamento;
import com.br.itau.models.Proprietario;
import com.br.itau.models.types.StatusAlugado;

public class ApartamentoForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idApartamento;

	private Proprietario proprietario;

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

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
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

	public static ApartamentoForm convert(Apartamento source) {
		
		ApartamentoForm apartamentoForm = new ApartamentoForm();
		apartamentoForm.setIdApartamento(source.getIdApartamento());
		apartamentoForm.setStatusAlugado(source.getStatusAlugado());
		apartamentoForm.setNumeroApartamento(source.getNumeroApartamento());
		apartamentoForm.getProprietario().setIdProprietario(source.getProprietario().getIdProprietario());
		apartamentoForm.setObservacao(source.getObservacao());
		apartamentoForm.setVagaEstacionamento(source.getVagaEstacionamento());
		return apartamentoForm;
	}

}
