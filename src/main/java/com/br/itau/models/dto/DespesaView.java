package com.br.itau.models.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.br.itau.models.Despesa;
import com.br.itau.models.types.StatusPagamentoDespesa;
import com.fasterxml.jackson.annotation.JsonFormat;

public class DespesaView implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idDespesa;

	private Integer proprietario;

	private String nomeProprietario;

	private String nomeDespesa;

	private BigDecimal valorDespesa;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dataDaDespesa;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dataVencimentoDespesa;

	private StatusPagamentoDespesa statusPagamentoDespesa;

	private String descricaoDespesa;

	public Integer getIdDespesa() {
		return idDespesa;
	}

	public void setIdDespesa(Integer idDespesa) {
		this.idDespesa = idDespesa;
	}

	public Integer getProprietario() {
		return proprietario;
	}

	public void setProprietario(Integer proprietario) {
		this.proprietario = proprietario;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
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
		return statusPagamentoDespesa;
	}

	public void setStatusPagamentoDespesa(StatusPagamentoDespesa statusPagamentoDespesa) {
		this.statusPagamentoDespesa = statusPagamentoDespesa;
	}

	public String getDescricaoDespesa() {
		return descricaoDespesa;
	}

	public void setDescricaoDespesa(String descricaoDespesa) {
		this.descricaoDespesa = descricaoDespesa;
	}

	public static DespesaView convert(Despesa source) {

		DespesaView despesaView = new DespesaView();
		despesaView.setIdDespesa(source.getIdDespesa());
		despesaView.setProprietario(source.getProprietario().getIdProprietario());
		despesaView.setNomeProprietario(source.getProprietario().getNomeProprietario());
		despesaView.setNomeDespesa(source.getNomeDespesa());
		despesaView.setValorDespesa(source.getValorDespesa());
		despesaView.setDataDaDespesa(source.getDataDaDespesa());
		despesaView.setDataVencimentoDespesa(source.getDataVencimentoDespesa());
		despesaView.setStatusPagamentoDespesa(source.getStatusPagamentoDespesa());
		despesaView.setDescricaoDespesa(source.getDescricaoDespesa());

		return despesaView;

	}

}
