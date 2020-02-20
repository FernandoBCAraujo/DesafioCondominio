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

import com.br.itau.models.types.StatusPagamentoDespesa;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Despesa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	
	private Integer statusPagamentoDespesa;
	
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
	
	public StatusPagamentoDespesa getStatusPagamentoDespesa() {
		return StatusPagamentoDespesa.valueOf(statusPagamentoDespesa);
	}

	public void setStatusPagamentoDespesa(StatusPagamentoDespesa statusPagamentoDespesa) {
		this.statusPagamentoDespesa = statusPagamentoDespesa.getCodigoEnum();
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
			LocalDate dataDaDespesa, LocalDate dataVencimentoDespesa, StatusPagamentoDespesa statusPagamentoDespesa,String descricaoDespesa) {
		super();
		this.idDespesa = idDespesa;
		this.proprietario = proprietario;
		this.nomeDespesa = nomeDespesa;
		this.valorDespesa = valorDespesa;
		this.dataDaDespesa = dataDaDespesa;
		this.dataVencimentoDespesa = dataVencimentoDespesa;
		setStatusPagamentoDespesa(statusPagamentoDespesa);
		this.descricaoDespesa = descricaoDespesa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataDaDespesa == null) ? 0 : dataDaDespesa.hashCode());
		result = prime * result + ((dataVencimentoDespesa == null) ? 0 : dataVencimentoDespesa.hashCode());
		result = prime * result + ((descricaoDespesa == null) ? 0 : descricaoDespesa.hashCode());
		result = prime * result + ((idDespesa == null) ? 0 : idDespesa.hashCode());
		result = prime * result + ((nomeDespesa == null) ? 0 : nomeDespesa.hashCode());
		result = prime * result + ((proprietario == null) ? 0 : proprietario.hashCode());
		result = prime * result + ((statusPagamentoDespesa == null) ? 0 : statusPagamentoDespesa.hashCode());
		result = prime * result + ((valorDespesa == null) ? 0 : valorDespesa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Despesa other = (Despesa) obj;
		if (dataDaDespesa == null) {
			if (other.dataDaDespesa != null)
				return false;
		} else if (!dataDaDespesa.equals(other.dataDaDespesa))
			return false;
		if (dataVencimentoDespesa == null) {
			if (other.dataVencimentoDespesa != null)
				return false;
		} else if (!dataVencimentoDespesa.equals(other.dataVencimentoDespesa))
			return false;
		if (descricaoDespesa == null) {
			if (other.descricaoDespesa != null)
				return false;
		} else if (!descricaoDespesa.equals(other.descricaoDespesa))
			return false;
		if (idDespesa == null) {
			if (other.idDespesa != null)
				return false;
		} else if (!idDespesa.equals(other.idDespesa))
			return false;
		if (nomeDespesa == null) {
			if (other.nomeDespesa != null)
				return false;
		} else if (!nomeDespesa.equals(other.nomeDespesa))
			return false;
		if (proprietario == null) {
			if (other.proprietario != null)
				return false;
		} else if (!proprietario.equals(other.proprietario))
			return false;
		if (statusPagamentoDespesa == null) {
			if (other.statusPagamentoDespesa != null)
				return false;
		} else if (!statusPagamentoDespesa.equals(other.statusPagamentoDespesa))
			return false;
		if (valorDespesa == null) {
			if (other.valorDespesa != null)
				return false;
		} else if (!valorDespesa.equals(other.valorDespesa))
			return false;
		return true;
	}

	

}
