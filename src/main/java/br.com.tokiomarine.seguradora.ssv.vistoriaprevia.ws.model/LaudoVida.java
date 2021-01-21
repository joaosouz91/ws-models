package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LaudoVida implements Serializable {

	private String sistemaOrigem;
	private Long idProposta;
	private String numeroLaudo;
	private String statusEntrevista;
	private String statusLaudo;
	private String dataRealizacao;
	private String numeroCPF;
	private String descricaoQuestionario;
	private CoberturaVida coberturaVida;
	private String icBeneficiarios;
	private String indicacaoExames;
	private String observacao;

	public String getSistemaOrigem() {
		return sistemaOrigem;
	}

	public void setSistemaOrigem(String sistemaOrigem) {
		this.sistemaOrigem = sistemaOrigem;
	}

	public Long getIdProposta() {
		return idProposta;
	}

	public void setIdProposta(Long idProposta) {
		this.idProposta = idProposta;
	}

	public String getNumeroLaudo() {
		return numeroLaudo;
	}

	public void setNumeroLaudo(String numeroLaudo) {
		this.numeroLaudo = numeroLaudo;
	}

	public String getStatusEntrevista() {
		return statusEntrevista;
	}

	public void setStatusEntrevista(String statusEntrevista) {
		this.statusEntrevista = statusEntrevista;
	}

	public String getStatusLaudo() {
		return statusLaudo;
	}

	public void setStatusLaudo(String statusLaudo) {
		this.statusLaudo = statusLaudo;
	}

	public String getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(String dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getDescricaoQuestionario() {
		return descricaoQuestionario;
	}

	public void setDescricaoQuestionario(String descricaoQuestionario) {
		this.descricaoQuestionario = descricaoQuestionario;
	}

	public CoberturaVida getCoberturaVida() {
		return coberturaVida;
	}

	public void setCoberturaVida(CoberturaVida coberturaVida) {
		this.coberturaVida = coberturaVida;
	}

	public String getIcBeneficiarios() {
		return icBeneficiarios;
	}

	public void setIcBeneficiarios(String icBeneficiarios) {
		this.icBeneficiarios = icBeneficiarios;
	}

	public String getIndicacaoExames() {
		return indicacaoExames;
	}

	public void setIndicacaoExames(String indicacaoExames) {
		this.indicacaoExames = indicacaoExames;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}




}
