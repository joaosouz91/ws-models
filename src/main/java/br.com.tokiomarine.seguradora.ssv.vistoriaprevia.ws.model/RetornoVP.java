package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RetornoVP implements Serializable {

	private String obrigatoriaVP;
	private String permiteAgendamento;
	private Long codRetorno;
	private Long numCalculo;
	private Long idVP;
	private String icPiloto;
	private String mensagem;
	private String codigoVoucher;
	private String[] mensagensTela;
	private String[] mensagensPDF;

	public String getObrigatoriaVP() {
		return obrigatoriaVP;
	}

	public void setObrigatoriaVP(String obrigatoriaVP) {
		this.obrigatoriaVP = obrigatoriaVP;
	}

	public String getPermiteAgendamento() {
		return permiteAgendamento;
	}

	public void setPermiteAgendamento(String permiteAgendamento) {
		this.permiteAgendamento = permiteAgendamento;
	}

	public Long getCodRetorno() {
		return codRetorno;
	}

	public void setCodRetorno(Long codRetorno) {
		this.codRetorno = codRetorno;
	}

	public Long getNumCalculo() {
		return numCalculo;
	}

	public void setNumCalculo(Long numCalculo) {
		this.numCalculo = numCalculo;
	}

	public Long getIdVP() {
		return idVP;
	}

	public void setIdVP(Long idVP) {
		this.idVP = idVP;
	}

	public String getIcPiloto() {
		return icPiloto;
	}

	public void setIcPiloto(String icPiloto) {
		this.icPiloto = icPiloto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String[] getMensagensTela() {
		return mensagensTela;
	}

	public void setMensagensTela(String[] mensagensTela) {
		this.mensagensTela = mensagensTela;
	}

	public String[] getMensagensPDF() {
		return mensagensPDF;
	}

	public void setMensagensPDF(String[] mensagensPDF) {
		this.mensagensPDF = mensagensPDF;
	}

	public String getCodigoVoucher() {
		return codigoVoucher;
	}

	public void setCodigoVoucher(String codigoVoucher) {
		this.codigoVoucher = codigoVoucher;
	}

	@Override
	public String toString() {

		StringBuffer s = new StringBuffer();
		s.append("\n\n");
		s.append("obrigatoriaVP: " + obrigatoriaVP + "; \n");
		s.append("permiteAgendamento: " + permiteAgendamento + "; \n");
		s.append("codRetorno: " + codRetorno + "; \n");
		s.append("numCalculo: " + numCalculo + "; \n");
		s.append("idVP: " + idVP + "; \n");
		s.append("icPiloto: " + icPiloto + "; \n");
		s.append("mensagem: " + mensagem + "; \n");
		s.append("\nMensagens Tela: \n");
		if (mensagensTela != null) {
			for (String mensagemTela : mensagensTela) {
				s.append("  -" + mensagemTela + "; \n");
			}
		}
		s.append("\nMensagens PDF: \n");
		if (mensagensPDF != null) {
			for (String mensagemPDF : mensagensPDF) {
				s.append("  -" + mensagemPDF + "; \n");
			}
		}

		return s.toString();
	}

}
