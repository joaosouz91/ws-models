package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;
import java.util.List;

public class RetornoDtDisponiveisWS implements Serializable{

	private static final long serialVersionUID = -2540934211156549547L;
	
	private List<DataDisponivelWS> datasDisponiveisWS;
	
	private Long cdRetorno;
	private String mensagem;
	
	public List<DataDisponivelWS> getDatasDisponiveisWS() {
		return datasDisponiveisWS;
	}
	public void setDatasDisponiveisWS(List<DataDisponivelWS> datasDisponiveisWS) {
		this.datasDisponiveisWS = datasDisponiveisWS;
	}
	public Long getCdRetorno() {
		return cdRetorno;
	}
	public void setCdRetorno(Long cdRetorno) {
		this.cdRetorno = cdRetorno;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}	

}
