package com.cnes.apirest.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_CNES_ATIVOS")
public class Cnes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="co_cnes")
	private int cdCnes;
	
	@Column(name="co_ibge")
	private int cdIbge;
	
	@Column(name="no_fantasia")
	private String nmFantasia;
	
	@Column(name="ds_tipo_unidade")
	private String dsTipoUnidade;
	
	@Column(name="tp_gestao")
	private String tpGestao;
	
	@Column(name="no_logradouro")
	private String nmLogradouro;
	
	@Column(name="nu_endereco")
	private String nuEndereco;
	
	@Column(name="no_bairro")
	private String nmBairro;

	@Column(name="co_cep")
	private int cep;
	
	@Column(name="uf")
	private String uf;
	
	@Column(name="municipio")
	private String municipio;
	
	@Column(name="nu_telefone")
	private String nuTelefone;

	public int getCdCnes() {
		return cdCnes;
	}

	public int getCdIbge() {
		return cdIbge;
	}

	public String getNmFantasia() {
		return nmFantasia;
	}

	public String getDsTipoUnidade() {
		return dsTipoUnidade;
	}

	public String getTpGestao() {
		return tpGestao;
	}

	public String getNmLogradouro() {
		return nmLogradouro;
	}

	public String getNuEndereco() {
		return nuEndereco;
	}

	public String getNmBairro() {
		return nmBairro;
	}

	public int getCep() {
		return cep;
	}

	public String getUf() {
		return uf;
	}

	public String getMunicipio() {
		return municipio;
	}

	public String getNuTelefone() {
		return nuTelefone;
	}

	public void setCdCnes(int cdCnes) {
		this.cdCnes = cdCnes;
	}

	public void setCdIbge(int cdIbge) {
		this.cdIbge = cdIbge;
	}

	public void setNmFantasia(String nmFantasia) {
		this.nmFantasia = nmFantasia;
	}

	public void setDsTipoUnidade(String dsTipoUnidade) {
		this.dsTipoUnidade = dsTipoUnidade;
	}

	public void setTpGestao(String tpGestao) {
		this.tpGestao = tpGestao;
	}

	public void setNmLogradouro(String nmLogradouro) {
		this.nmLogradouro = nmLogradouro;
	}

	public void setNuEndereco(String nuEndereco) {
		this.nuEndereco = nuEndereco;
	}

	public void setNmBairro(String nmBairro) {
		this.nmBairro = nmBairro;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void setNuTelefone(String nuTelefone) {
		this.nuTelefone = nuTelefone;
	}

	@Override
	public String toString() {
		return "Cnes [cdCnes=" + cdCnes + ", cdIbge=" + cdIbge + ", nmFantasia=" + nmFantasia + ", dsTipoUnidade="
				+ dsTipoUnidade + ", tpGestao=" + tpGestao + ", nmLogradouro=" + nmLogradouro + ", nuEndereco="
				+ nuEndereco + ", nmBairro=" + nmBairro + ", cep=" + cep + ", uf=" + uf + ", municipio=" + municipio
				+ ", nuTelefone=" + nuTelefone + "]";
	}
}