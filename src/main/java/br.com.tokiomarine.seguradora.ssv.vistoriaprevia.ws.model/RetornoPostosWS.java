package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;
import java.util.List;

public class RetornoPostosWS implements Serializable{

	private static final long serialVersionUID = -2540934211156549547L;
	
	private List<PostoWS> postoWS;
	
	private Long cdRetorno;
	private String mensagem;
	
	public List<PostoWS> getPostoWS() {
		return postoWS;
	}
	public void setPostoWS(List<PostoWS> postoWS) {
		this.postoWS = postoWS;
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
