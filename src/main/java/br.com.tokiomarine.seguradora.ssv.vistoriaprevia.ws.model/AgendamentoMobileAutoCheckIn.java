package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class AgendamentoMobileAutoCheckIn implements Serializable {


	/**
	 *
	 */
	private static final long serialVersionUID = -2787985223533338761L;

	private List<Map<String, String>> confirmacao;

	private String voucher;

	private String mensagem;

	private String status;

	public List<Map<String, String>> getConfirmacao() {
		return confirmacao;
	}


	public void setConfirmacao(List<Map<String, String>>  confirmacao) {
		this.confirmacao = confirmacao;
	}


	public String getVoucher() {
		return voucher;
	}


	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	public void addConfirmacao(Map<String, String> confirmacao){
		if(this.confirmacao == null){
			this.confirmacao = new ArrayList<Map<String,String>>();
		}

		this.confirmacao.add(confirmacao);

	}


}
