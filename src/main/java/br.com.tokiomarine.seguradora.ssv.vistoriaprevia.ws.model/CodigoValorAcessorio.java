package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CodigoValorAcessorio implements Serializable {

	public CodigoValorAcessorio() {

	}

	public CodigoValorAcessorio(Long codigo, Double valor) {
		super();
		this.codigo = codigo;
		this.valor = valor;
	}

	private Long codigo;
	private Double valor;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
