package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CoberturaVida implements Serializable {

	private String codigoRamo;
	private Long codigoCobertura;
	private Long capitalMaximo;
	private String statusCobertura;

	public String getCodigoRamo() {
		return codigoRamo;
	}

	public void setCodigoRamo(String codigoRamo) {
		this.codigoRamo = codigoRamo;
	}

	public Long getCodigoCobertura() {
		return codigoCobertura;
	}

	public void setCodigoCobertura(Long codigoCobertura) {
		this.codigoCobertura = codigoCobertura;
	}

	public Long getCapitalMaximo() {
		return capitalMaximo;
	}

	public void setCapitalMaximo(Long capitalMaximo) {
		this.capitalMaximo = capitalMaximo;
	}

	public String getStatusCobertura() {
		return statusCobertura;
	}

	public void setStatusCobertura(String statusCobertura) {
		this.statusCobertura = statusCobertura;
	}



}
