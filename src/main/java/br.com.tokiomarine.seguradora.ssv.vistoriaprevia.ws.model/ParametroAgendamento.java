package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ParametroAgendamento implements Serializable {

	private Long codigoAgrupamentoPrestadora;
	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getCodigoAgrupamentoPrestadora() {
		return codigoAgrupamentoPrestadora;
	}

	public void setCodigoAgrupamentoPrestadora(Long codigoAgrupamentoPrestadora) {
		this.codigoAgrupamentoPrestadora = codigoAgrupamentoPrestadora;
	}
}
