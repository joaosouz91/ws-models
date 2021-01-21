package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

public class ParametroEnvioLaudos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long codigoAgrupamentoPrestadora;
	private String senha;
	private LaudoVP[] laudos;

	public ParametroEnvioLaudos() {}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Long getCodigoAgrupamentoPrestadora() {
		return codigoAgrupamentoPrestadora;
	}
	public void setCodigoAgrupamentoPrestadora(Long codigoAgrupamentoPrestadora) {
		this.codigoAgrupamentoPrestadora = codigoAgrupamentoPrestadora;
	}
	public LaudoVP[] getLaudos() {
		return laudos;
	}
	public void setLaudos(LaudoVP[] laudos) {
		this.laudos = laudos;
	}
}
