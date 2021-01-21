package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

public class RetiradaDtDisponiveisWS implements Serializable{

	private static final long serialVersionUID = -8839578910291545915L;
	
	private Long nrCalculo;
	private Long sistemaChamador;
	private String tpVistoria;//[D - DOMICILIAR | P - POSTO]
	
	public String getTpVistoria() {
		return tpVistoria;
	}
	public void setTpVistoria(String tpVistoria) {
		this.tpVistoria = tpVistoria;
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
