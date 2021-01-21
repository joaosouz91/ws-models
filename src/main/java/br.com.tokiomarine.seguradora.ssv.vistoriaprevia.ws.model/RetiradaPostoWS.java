package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

public class RetiradaPostoWS implements Serializable{

	private static final long serialVersionUID = -8839578910291545915L;
	
	private Long nrCalculo;
	private Long sistemaChamador;
	private String tpVistoria;//[D - DOMICILIAR | P - POSTO]
	private String bairro;
	private String uf;
	private String cidade;
	
	public String getTpVistoria() {
		return tpVistoria;
	}
	public void setTpVistoria(String tpVistoria) {
		this.tpVistoria = tpVistoria;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
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
		
	
}
