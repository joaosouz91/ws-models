package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

/***
 *Agendamento WS para serviços do banco original
 */
public class AgendamentoVP implements Serializable{

	private static final long serialVersionUID = 9105781298620456712L;
	
	//Dados do sistema:
	private Long nrCalculo;
	private Long sistemaChamador;
	private String tpVistoria;//[D - DOMICILIAR | P - POSTO]
	
	//Dados para efetivação do agendamento:
	private String endereco;
	private Long numero;
	private String complemento;
	private String bairro;
	private Long cep;
	private String uf;
	private String cidade;
	private String tpPessoa;
	private String cpfCnpj;
	private String nomeContato;
	private Long foneContato1;
	private Long foneContato2;
	private String emailContato;
	private String referencia;
	private String observacao;
	
	//Objectos com as informações de agendamento
	private DataDisponivelWS dataDisponivelWS;
	private PostoWS postoWS;
	
	private String dataAgendamento;
	
	public Long getNrCalculo() {
		return nrCalculo;
	}
	public void setNrCalculo(Long nrCalculo) {
		this.nrCalculo = nrCalculo;
	}
	public Long getSistemaChamador() {
		return sistemaChamador;
	}
	public void setSistemaChamador(Long sistemaChamador) {
		this.sistemaChamador = sistemaChamador;
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
	public String getTpPessoa() {
		return tpPessoa;
	}
	public void setTpPessoa(String tpPessoa) {
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
	public Long getFoneContato1() {
		return foneContato1;
	}
	public void setFoneContato1(Long foneContato1) {
		this.foneContato1 = foneContato1;
	}
	public Long getFoneContato2() {
		return foneContato2;
	}
	public void setFoneContato2(Long foneContato2) {
		this.foneContato2 = foneContato2;
	}
	public String getEmailContato() {
		return emailContato;
	}
	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
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
	public PostoWS getPostoWS() {
		return postoWS;
	}
	public void setPostoWS(PostoWS postoWS) {
		this.postoWS = postoWS;
	}
	public String getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	} 
	
	
		
}
