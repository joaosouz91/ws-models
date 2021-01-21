package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/***
 *Agendamento WS para servi�os do Santander (AutoCompara)
 */
public class AgendamentoWS implements Serializable{

	private static final long serialVersionUID = 1500173629454266654L;

	private Long nmCotacaoAutocompara;//Autocompara
	private Long nmPropostaAutocompara;
	private String tpVistoria;//[D - DOMICILIAR | P - POSTO]
	private String endereco;
	private Long numero;
	private String complemento;
	private String bairro;
	private Long cep;
	//private String codigoNomePosto;
	private String uf;
	private String cidade;
	private Long tpPessoa;//[13 - CPF | 14- CNPJ]
	private String cpfCnpj;
	private String nomeContato;
	private Long foneContato;
	private String referencia;
	private String observacao;
	private String placa;
	private String chassi;
	@XmlElement(required=false)
	private DataDisponivelWS dataDisponivelWS;
			
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Long getCep() {
		return cep;
	}
	public void setCep(Long cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Long getTpPessoa() {
		return tpPessoa;
	}
	public void setTpPessoa(Long tpPessoa) {
		this.tpPessoa = tpPessoa;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public Long getFoneContato() {
		return foneContato;
	}
	public void setFoneContato(Long foneContato) {
		this.foneContato = foneContato;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public DataDisponivelWS getDataDisponivelWS() {
		return dataDisponivelWS;
	}
	public void setDataDisponivelWS(DataDisponivelWS dataDisponivelWS) {
		this.dataDisponivelWS = dataDisponivelWS;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
//	public String getCodigoNomePosto() {
//		return codigoNomePosto;
//	}	
//	public void setCodigoNomePosto(String codigoNomePosto) {
//		this.codigoNomePosto = codigoNomePosto;
//	}
	
}
