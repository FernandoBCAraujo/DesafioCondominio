package com.br.itau.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.br.itau.model.types.StatusAlugado;

@Entity
public class Apartamento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idApartamento;
	
	@ManyToOne
	@JoinColumn(name = "ID_PROPRIETARIO")
	private Proprietario proprietario;
	
	private String numeroApartamento;
	
	/*
	 *apesar da grande maioria dos apartamentos estarem no andar correspondente ao início do seu número, não sei
	 * essa regra vale para todos os condominios
	 */
	private String andarApartameto; 
	
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

	public String getAndarApartameto() {
		return andarApartameto;
	}

	public void setAndarApartameto(String andarApartameto) {
		this.andarApartameto = andarApartameto;
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
			String andarApartameto, StatusAlugado statusAlugado, String vagaEstacionamento, String observacao) {
		super();
		this.idApartamento = idApartamento;
		this.proprietario = proprietario;
		this.numeroApartamento = numeroApartamento;
		this.andarApartameto = andarApartameto;
		setStatusAlugado(statusAlugado);
		this.vagaEstacionamento = vagaEstacionamento;
		this.observacao = observacao;
	}
	
}
