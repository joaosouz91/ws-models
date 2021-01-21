package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StatusAgendamento implements Serializable {

	private String nrVoucher;
	private String nrLaudo;
	private String statusAgendamento;
	private String motivoVistoriaFrustrada;
	private String tipoVistoria;
	private String data;
	private String periodo;
	private String nomeSegurado;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	private String cpfCnpj;
	private String chassi;
	private String placa;
	private String modelo;
	private String anoModelo;
	private String tipoVeiculo;
	private String zeroKm;
	private String observacao;

	public String getNrVoucher() {
		return nrVoucher;
	}

	public void setNrVoucher(String nrVoucher) {
		this.nrVoucher = nrVoucher;
	}

	public String getNrLaudo() {
		return nrLaudo;
	}

	public void setNrLaudo(String nrLaudo) {
		this.nrLaudo = nrLaudo;
	}

	public String getStatusAgendamento() {
		return statusAgendamento;
	}

	public void setStatusAgendamento(String statusAgendamento) {
		this.statusAgendamento = statusAgendamento;
	}

	public String getMotivoVistoriaFrustrada() {
		return motivoVistoriaFrustrada;
	}

	public void setMotivoVistoriaFrustrada(String motivoVistoriaFrustrada) {
		this.motivoVistoriaFrustrada = motivoVistoriaFrustrada;
	}

	public String getTipoVistoria() {
		return tipoVistoria;
	}

	public void setTipoVistoria(String tipoVistoria) {
		this.tipoVistoria = tipoVistoria;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getNomeSegurado() {
		return nomeSegurado;
	}

	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getZeroKm() {
		return zeroKm;
	}

	public void setZeroKm(String zeroKm) {
		this.zeroKm = zeroKm;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
