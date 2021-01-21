package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CodigoValorDescricao implements Serializable {

	public CodigoValorDescricao() {

	}

	public CodigoValorDescricao(Long codigo, Long valor, String descricao) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
	}

	private Long codigo;
	private Long valor;
	private String descricao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
