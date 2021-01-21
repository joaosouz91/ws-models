package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RetornoStatusAgendamento implements Serializable {

	private String nrVoucher;
	private String situacao;
	private String mensagem;

	public String getNrVoucher() {
		return nrVoucher;
	}

	public void setNrVoucher(String nrVoucher) {
		this.nrVoucher = nrVoucher;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		
		s.append("\n\n");
		s.append("\t nrVoucher: " + nrVoucher + "\n");
		s.append("\t situacao: " + situacao + "\n");
		s.append("\t mensagem: " + mensagem + "\n");
			
		return s.toString();
	}
}
