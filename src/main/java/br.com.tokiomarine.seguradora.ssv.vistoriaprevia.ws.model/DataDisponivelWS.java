package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;
import java.util.Date;

public class DataDisponivelWS implements Serializable{

	private static final long serialVersionUID = -2054696019159099282L;
	
	private Date dataDisponivel;
	private String periodo;
	
	public Date getDataDisponivel() {
		return dataDisponivel;
	}
	public void setDataDisponivel(Date dataDisponivel) {
		this.dataDisponivel = dataDisponivel;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	
	

}
