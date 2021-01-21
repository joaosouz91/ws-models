package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

public class ParametroEnvioListaPostos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long codigoAgrupamentoPrestadora;
	private String senha;
	private PostoVP [] postos;
	
	public ParametroEnvioListaPostos() {}
	
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
	public PostoVP[] getPostos() {
		return postos;
	}
	public void setPostos(PostoVP[] postos) {
		this.postos = postos;
	}
}
