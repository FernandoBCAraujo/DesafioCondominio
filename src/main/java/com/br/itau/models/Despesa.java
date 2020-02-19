package com.br.itau.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Despesa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDespesa;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "ID_PROPRIETARIO")
	private Proprietario proprietario;
	
	private String nomeDespesa;

	private BigDecimal valorDespesa;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dataDaDespesa;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dataVencimentoDespesa;
	
	private String descricaoDespesa;

	public Integer getIdDespesa() {
		return idDespesa;
	}

	public void setIdDespesa(Integer idDespesa) {
		this.idDespesa = idDespesa;
	}

	public String getNomeDespesa() {
		return nomeDespesa;
	}

	public void setNomeDespesa(String nomeDespesa) {
		this.nomeDespesa = nomeDespesa;
	}

	public BigDecimal getValorDespesa() {
		return valorDespesa;
	}

	public void setValorDespesa(BigDecimal valorDespesa) {
		this.valorDespesa = valorDespesa;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public LocalDate getDataDaDespesa() {
		return dataDaDespesa;
	}

	public void setDataDaDespesa(LocalDate dataDaDespesa) {
		this.dataDaDespesa = dataDaDespesa;
	}
	
	public LocalDate getDataVencimentoDespesa() {
		return dataVencimentoDespesa;
	}

	public void setDataVencimentoDespesa(LocalDate dataVencimentoDespesa) {
		this.dataVencimentoDespesa = dataVencimentoDespesa;
	}

	public String getDescricaoDespesa() {
		return descricaoDespesa;
	}

	public void setDescricaoDespesa(String descricaoDespesa) {
		this.descricaoDespesa = descricaoDespesa;
	}

	public Despesa() {
		
	}

	public Despesa(Integer idDespesa, Proprietario proprietario, String nomeDespesa, BigDecimal valorDespesa,
			LocalDate dataDaDespesa, LocalDate dataVencimentoDespesa, String descricaoDespesa) {
		super();
		this.idDespesa = idDespesa;
		this.proprietario = proprietario;
		this.nomeDespesa = nomeDespesa;
		this.valorDespesa = valorDespesa;
		this.dataDaDespesa = dataDaDespesa;
		this.dataVencimentoDespesa = dataVencimentoDespesa;
		this.descricaoDespesa = descricaoDespesa;
	}

}
