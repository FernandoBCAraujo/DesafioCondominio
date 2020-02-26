package com.br.itau.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Proprietario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProprietario;
	
	private String nomeProprietario;
	
	private String cpf;
	
	private String numeroTelefone;
	
	private String numeroDaIdentidade;
	
	@OneToMany(mappedBy = "proprietario")
	private List<Apartamento> listaApartamentos;
	
	@OneToMany(mappedBy = "proprietario")

	private List<Despesa> listaDespesas;

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

	public List<Despesa> getListaDespesas() {
		return listaDespesas;
	}

	public void setListaDespesas(List<Despesa> listaDespesas) {
		this.listaDespesas = listaDespesas;
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
	
	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public Proprietario() {
		
	}

	public Proprietario(Integer idProprietario, String nomeProprietario, String cpf, String numeroTelefone,
			String numeroDaIdentidade, List<Apartamento> listaApartamentos, List<Despesa> listaDespesas) {
		super();
		this.idProprietario = idProprietario;
		this.nomeProprietario = nomeProprietario;
		this.cpf = cpf;
		this.numeroTelefone = numeroTelefone;
		this.numeroDaIdentidade = numeroDaIdentidade;
		this.listaApartamentos = listaApartamentos;
		this.listaDespesas = listaDespesas;
	}
}
