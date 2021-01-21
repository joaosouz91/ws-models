package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

/*
 * Retorno do agendamento para os serviços do Banco Original
 */

public class RetornoAgendamentoVP implements Serializable{
	
	private static final long serialVersionUID = 7413563920337438325L;
	
	private Long nrCalculo;
	private String tpVistoria;
	private String Voucher;
	
	private PostoWS postoWS;
	private DataDisponivelWS dataDisponivel;
	
	private Long cdRetorno;
	private String mensagem;
	public Long getNrCalculo() {
		return nrCalculo;
	}
	public void setNrCalculo(Long nrCalculo) {
		this.nrCalculo = nrCalculo;
	}
	public String getTpVistoria() {
		return tpVistoria;
	}
	public void setTpVistoria(String tpVistoria) {
		this.tpVistoria = tpVistoria;
	}
	public String getVoucher() {
		return Voucher;
	}
	public void setVoucher(String voucher) {
		Voucher = voucher;
	}
	public PostoWS getPostoWS() {
		return postoWS;
	}
	public void setPostoWS(PostoWS postoWS) {
		this.postoWS = postoWS;
	}
	public DataDisponivelWS getDataDisponivel() {
		return dataDisponivel;
	}
	public void setDataDisponivel(DataDisponivelWS dataDisponivel) {
		this.dataDisponivel = dataDisponivel;
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
