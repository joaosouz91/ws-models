package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class AgendamentoMobileAutoCheckOut implements Serializable {


	/**
	 *
	 */
	private static final long serialVersionUID = 2354677676850883728L;

	/**
	 *
	 */


	private String voucher;

	private String codigoTransacao;

	private Map<String,Object> auditoria;

	private String mensagem;

	private boolean status;

	private Date dataFinalizacao;

	public String getVoucher() {
		return voucher;
	}


	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}



	public String getCodigoTransacao() {
		return codigoTransacao;
	}



	public void setCodigoTransacao(String codigoTransacao) {
		this.codigoTransacao = codigoTransacao;
	}



	public Map<String,Object> getAuditoria() {
		return auditoria;
	}



	public void setAuditoria(Map<String,Object> auditoria) {
		this.auditoria = auditoria;
	}



	public String getMensagem() {
		return mensagem;
	}



	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public Date getDataFinalizacao() {
		return dataFinalizacao;
	}



	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}
