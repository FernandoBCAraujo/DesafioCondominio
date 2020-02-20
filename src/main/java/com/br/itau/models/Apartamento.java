package com.br.itau.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.br.itau.models.types.StatusAlugado;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Apartamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idApartamento;

    @JsonIgnore
	@ManyToOne
	@JoinColumn(name = "ID_PROPRIETARIO")
	private Proprietario proprietario;

	private String numeroApartamento;

	private Integer statusAlugado;

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
		return StatusAlugado.valueOf(statusAlugado);
	}

	public void setStatusAlugado(StatusAlugado statusAlugado) {
		this.statusAlugado = statusAlugado.getCodigoEnum();
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

	public Apartamento() {

	}

	public Apartamento(Integer idApartamento, Proprietario proprietario, String numeroApartamento,
			StatusAlugado statusAlugado, String vagaEstacionamento, String observacao) {
		super();
		this.idApartamento = idApartamento;
		this.proprietario = proprietario;
		this.numeroApartamento = numeroApartamento;
		setStatusAlugado(statusAlugado);
		this.vagaEstacionamento = vagaEstacionamento;
		this.observacao = observacao;
	}

}
