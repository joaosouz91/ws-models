package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DadosVeiculo implements Serializable {

	private String tpVeiculo;
	private String fabricante;
	private String modelo;
	private String codigoFipe;
	private String placa;
	private String chassi;
	private Long anoFabricacao;
	private Long anoModelo;
	private String zeroKm;
	private String carroceria;
	private String tipoCarroceria;
	private String adaptacaoDeEixo;
	private String observacao;

	public String getTpVeiculo() {
		return tpVeiculo;
	}

	public void setTpVeiculo(String tpVeiculo) {
		this.tpVeiculo = tpVeiculo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCodigoFipe() {
		return codigoFipe;
	}

	public void setCodigoFipe(String codigoFipe) {
		this.codigoFipe = codigoFipe;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Long getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Long anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Long getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Long anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getZeroKm() {
		return zeroKm;
	}

	public void setZeroKm(String zeroKm) {
		this.zeroKm = zeroKm;
	}

	public String getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}

	public String getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

	public String getAdaptacaoDeEixo() {
		return adaptacaoDeEixo;
	}

	public void setAdaptacaoDeEixo(String adaptacaoDeEixo) {
		this.adaptacaoDeEixo = adaptacaoDeEixo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		
		StringBuffer s = new StringBuffer();
		s.append("\n\n");
		s.append("\t\t\t tpVeiculo: " + tpVeiculo + "; \n");
		s.append("\t\t\t fabricante: " + fabricante + "; \n");
		s.append("\t\t\t modelo: " + modelo + "; \n");
		s.append("\t\t\t codigoFipe: " + codigoFipe + "; \n");
		s.append("\t\t\t placa: " + placa + "; \n");
		s.append("\t\t\t chassi: " + chassi + "; \n");
		s.append("\t\t\t anoFabricacao: " + anoFabricacao + "; \n");
		s.append("\t\t\t anoModelo: " + anoModelo + "; \n");
		s.append("\t\t\t zeroKm: " + zeroKm + "; \n");
		s.append("\t\t\t carroceria: " + carroceria + "; \n");
		s.append("\t\t\t tipoCarroceria: " + tipoCarroceria + "; \n");
		s.append("\t\t\t adaptacaoDeEixo: " + adaptacaoDeEixo + "; \n");
		s.append("\t\t\t observacao: " + observacao + "; \n");
		
		return s.toString();
	}
}
