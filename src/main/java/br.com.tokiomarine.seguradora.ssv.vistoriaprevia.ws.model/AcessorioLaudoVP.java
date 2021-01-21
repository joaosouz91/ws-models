package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

public class AcessorioLaudoVP implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long codigoAcessorio;
	private String tipoAcessorio;
	private String codigoComplemento;
    
    public AcessorioLaudoVP() {}
    
	public Long getCodigoAcessorio() {
		return codigoAcessorio;
	}
	public void setCodigoAcessorio(Long codigoAcessorio) {
		this.codigoAcessorio = codigoAcessorio;
	}
	public String getTipoAcessorio() {
		return tipoAcessorio;
	}
	public void setTipoAcessorio(String tipoAcessorio) {
		this.tipoAcessorio = tipoAcessorio;
	}
	public String getCodigoComplemento() {
		return codigoComplemento;
	}
	public void setCodigoComplemento(String codigoComplemento) {
		this.codigoComplemento = codigoComplemento;
	}
}
