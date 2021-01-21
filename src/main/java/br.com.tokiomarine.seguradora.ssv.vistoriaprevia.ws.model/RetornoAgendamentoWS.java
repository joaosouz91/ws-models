package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;
import java.util.List;

/*
 * Retorno do agendamento para os serviços do Santander(Projeto AutoCompara)
 */

public class RetornoAgendamentoWS implements Serializable{

	private static final long serialVersionUID = -2540934211156549547L;
	
	private Long nmCotacaoAutocompara;
	private Long nmPropostaAutocompara;
	private String tpVistoria;
	private String voucher;
	
	private List<PostoWS> postoWS;
	private List<DataDisponivelWS> dataDisponivel;
	
	private Long cdRetorno;
	private String mensagem;
	
	
	
	public Long getNmCotacaoAutocompara() {
		return nmCotacaoAutocompara;
	}
	public void setNmCotacaoAutocompara(Long nmCotacaoAutocompara) {
		this.nmCotacaoAutocompara = nmCotacaoAutocompara;
	}
	public Long getNmPropostaAutocompara() {
		return nmPropostaAutocompara;
	}
	public void setNmPropostaAutocompara(Long nmPropostaAutocompara) {
		this.nmPropostaAutocompara = nmPropostaAutocompara;
	}
	public String getTpVistoria() {
		return tpVistoria;
	}
	public void setTpVistoria(String tpVistoria) {
		this.tpVistoria = tpVistoria;
	}
	
	public List<PostoWS> getPostoWS() {
		return postoWS;
	}
	public void setPostoWS(List<PostoWS> postoWS) {
		this.postoWS = postoWS;
	}
	public List<DataDisponivelWS> getDataDisponivel() {
		return dataDisponivel;
	}
	public void setDataDisponivel(List<DataDisponivelWS> dataDisponivel) {
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
	public String getVoucher() {
		return voucher;
	}
	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}
	
	
	
	

}
