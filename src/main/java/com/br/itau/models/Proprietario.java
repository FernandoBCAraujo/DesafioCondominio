package com.br.itau.models;

import java.io.Serializable;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProprietario;
	
	private String nomeProprietario;
	
	private String cpf;
	
	private String numeroTelefone;
	
	private String numeroDaIdentidade;
	
//	@JsonIgnore
	@OneToMany(mappedBy = "proprietario")
	private List<Apartamento> listaApartamentos;
	
//	@JsonIgnore
	@OneToMany(mappedBy = "proprietario")
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinTable(name="PROPRIETARIO_DESPESA",
//    joinColumns={@JoinColumn(name = "PROPRIETARIO_ID")},
//    inverseJoinColumns={@JoinColumn(name = "DESPESA_ID")})
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((idProprietario == null) ? 0 : idProprietario.hashCode());
		result = prime * result + ((listaApartamentos == null) ? 0 : listaApartamentos.hashCode());
		result = prime * result + ((listaDespesas == null) ? 0 : listaDespesas.hashCode());
		result = prime * result + ((nomeProprietario == null) ? 0 : nomeProprietario.hashCode());
		result = prime * result + ((numeroDaIdentidade == null) ? 0 : numeroDaIdentidade.hashCode());
		result = prime * result + ((numeroTelefone == null) ? 0 : numeroTelefone.hashCode());
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
		Proprietario other = (Proprietario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (idProprietario == null) {
			if (other.idProprietario != null)
				return false;
		} else if (!idProprietario.equals(other.idProprietario))
			return false;
		if (listaApartamentos == null) {
			if (other.listaApartamentos != null)
				return false;
		} else if (!listaApartamentos.equals(other.listaApartamentos))
			return false;
		if (listaDespesas == null) {
			if (other.listaDespesas != null)
				return false;
		} else if (!listaDespesas.equals(other.listaDespesas))
			return false;
		if (nomeProprietario == null) {
			if (other.nomeProprietario != null)
				return false;
		} else if (!nomeProprietario.equals(other.nomeProprietario))
			return false;
		if (numeroDaIdentidade == null) {
			if (other.numeroDaIdentidade != null)
				return false;
		} else if (!numeroDaIdentidade.equals(other.numeroDaIdentidade))
			return false;
		if (numeroTelefone == null) {
			if (other.numeroTelefone != null)
				return false;
		} else if (!numeroTelefone.equals(other.numeroTelefone))
			return false;
		return true;
	}
	
}
