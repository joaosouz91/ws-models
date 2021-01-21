package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PermiteAgendamento implements Serializable {

	private Boolean permiteAgendamento;
	private String voucher;
	private Long motivoAgendamentoNaoPermitido;

	public Boolean getPermiteAgendamento() {
		return permiteAgendamento;
	}

	public void setPermiteAgendamento(Boolean permiteAgendamento) {
		this.permiteAgendamento = permiteAgendamento;
	}

	public String getVoucher() {
		return voucher;
	}

	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}

	public Long getMotivoAgendamentoNaoPermitido() {
		return motivoAgendamentoNaoPermitido;
	}

	public void setMotivoAgendamentoNaoPermitido(Long motivoAgendamentoNaoPermitido) {
		this.motivoAgendamentoNaoPermitido = motivoAgendamentoNaoPermitido;
	}

}
