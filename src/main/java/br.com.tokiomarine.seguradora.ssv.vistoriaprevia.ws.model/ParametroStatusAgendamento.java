package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ParametroStatusAgendamento implements Serializable {

	private Long codigoAgrupamentoPrestadora;
	private String senha;
	private StatusAgendamento[] statusAgendamento;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getCodigoAgrupamentoPrestadora() {
		return codigoAgrupamentoPrestadora;
	}

	public void setCodigoAgrupamentoPrestadora(Long prestadora) {
		this.codigoAgrupamentoPrestadora = prestadora;
	}

	public StatusAgendamento[] getStatusAgendamento() {
		return statusAgendamento;
	}

	public void setStatusAgendamento(StatusAgendamento[] statusAgendamento) {
		this.statusAgendamento = statusAgendamento;
	}

}
