package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

public class RetornoAtualizaListaPostos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String statusRetorno;
	private String mensagem;
	
	public String getStatusRetorno() {
		return statusRetorno;
	}
	public void setStatusRetorno(String statusRetorno) {
		this.statusRetorno = statusRetorno;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
