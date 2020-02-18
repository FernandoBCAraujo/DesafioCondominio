package com.br.itau.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Proprietario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProprietario;
	
	private String numeroDaIdentidade;
	
	private String nomeProprietario;

	private String cpf;
	
	@JsonIgnore
	@OneToMany(mappedBy = "proprietario")
	private List<Apartamento> listaApartamentos = new ArrayList<Apartamento>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "proprietario")
	private List<Despesa> listaDespesa = new ArrayList<Despesa>();

	public Integer getIdProprietario() {
		return idProprietario;
	}

	public void setIdProprietario(Integer idProprietario) {
		this.idProprietario = idProprietario;
	}

	public List<Apartamento> getListaApartamentos() {
		return listaApartamentos;
	}

	public void setListaApartamentos(List<Apartamento> listaApartamentos) {
		this.listaApartamentos = listaApartamentos;
	}

	public List<Despesa> getListaDespesa() {
		return listaDespesa;
	}

	public void setListaDespesa(List<Despesa> listaDespesa) {
		this.listaDespesa = listaDespesa;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumeroDaIdentidade() {
		return numeroDaIdentidade;
	}

	public void setNumeroDaIdentidade(String numeroDaIdentidade) {
		this.numeroDaIdentidade = numeroDaIdentidade;
	}

	public Proprietario() {
		
	}
	
	public Proprietario(Integer idProprietario, List<Apartamento> listaApartamentos, List<Despesa> listaDespesa,
			String nomeProprietario, String cpf, String numeroDaIdentidade) {
		super();
		this.idProprietario = idProprietario;
		this.listaApartamentos = listaApartamentos;
		this.listaDespesa = listaDespesa;
		this.nomeProprietario = nomeProprietario;
		this.cpf = cpf;
		this.numeroDaIdentidade = numeroDaIdentidade;
	}
	
	
}
