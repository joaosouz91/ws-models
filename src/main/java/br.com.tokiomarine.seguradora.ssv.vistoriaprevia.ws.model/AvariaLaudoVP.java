package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

public class AvariaLaudoVP implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long codigoPecaAvariada;
	private String codigoAvaria;
	private Long horasFunilaria;
	private Long horasPintura;
	private Long horasTapecaria;
	private Long horasEletrica;
	
    public AvariaLaudoVP() {}

	public Long getCodigoPecaAvariada() {
		return codigoPecaAvariada;
	}

	public void setCodigoPecaAvariada(Long codigoPecaAvariada) {
		this.codigoPecaAvariada = codigoPecaAvariada;
	}

	public String getCodigoAvaria() {
		return codigoAvaria;
	}

	public void setCodigoAvaria(String codigoAvaria) {
		this.codigoAvaria = codigoAvaria;
	}

	public Long getHorasFunilaria() {
		return horasFunilaria;
	}

	public void setHorasFunilaria(Long horasFunilaria) {
		this.horasFunilaria = horasFunilaria;
	}

	public Long getHorasPintura() {
		return horasPintura;
	}

	public void setHorasPintura(Long horasPintura) {
		this.horasPintura = horasPintura;
	}

	public Long getHorasTapecaria() {
		return horasTapecaria;
	}

	public void setHorasTapecaria(Long horasTapecaria) {
		this.horasTapecaria = horasTapecaria;
	}

	public Long getHorasEletrica() {
		return horasEletrica;
	}

	public void setHorasEletrica(Long horasEletrica) {
		this.horasEletrica = horasEletrica;
	}
}
