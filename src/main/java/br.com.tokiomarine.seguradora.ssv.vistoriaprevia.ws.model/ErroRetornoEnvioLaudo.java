package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

public class ErroRetornoEnvioLaudo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String numeroLaudo;
	private String indicadorAceiteVistoria;
    private ErroVP [] erros; 
	
    public ErroRetornoEnvioLaudo() {
    }

	public String getNumeroLaudo() {
		return numeroLaudo;
	}
	public void setNumeroLaudo(String numeroLaudo) {
		this.numeroLaudo = numeroLaudo;
	}
	public ErroVP[] getErros() {
		return erros;
	}
	public void setErros(ErroVP[] erros) {
		this.erros = erros;
	}

	public String getIndicadorAceiteVistoria() {
		return indicadorAceiteVistoria;
	}

	public void setIndicadorAceiteVistoria(String indicadorAceiteVistoria) {
		this.indicadorAceiteVistoria = indicadorAceiteVistoria;
	}
}
