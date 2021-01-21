package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ParametroRegrasVPRequest implements Serializable {

	private Long sistemaChamador;
	private Long numItem;
	private Long codEndosso;
	private String chassiAnterior;
	private Long codCoberturaAnterior;
	private String dataFimVigenciaAnterior;
	private String dataCancelamentoAnterior;

	public Long getSistemaChamador() {
		return sistemaChamador;
	}

	public void setSistemaChamador(Long sistemaChamador) {
		this.sistemaChamador = sistemaChamador;
	}

	public Long getNumItem() {
		return numItem;
	}

	public void setNumItem(Long numItem) {
		this.numItem = numItem;
	}

	public Long getCodEndosso() {
		return codEndosso;
	}

	public void setCodEndosso(Long codEndosso) {
		this.codEndosso = codEndosso;
	}

	public String getChassiAnterior() {
		return chassiAnterior;
	}

	public void setChassiAnterior(String chassiAnterior) {
		this.chassiAnterior = chassiAnterior;
	}

	public Long getCodCoberturaAnterior() {
		return codCoberturaAnterior;
	}

	public void setCodCoberturaAnterior(Long codCoberturaAnterior) {
		this.codCoberturaAnterior = codCoberturaAnterior;
	}

	public String getDataFimVigenciaAnterior() {
		return dataFimVigenciaAnterior;
	}

	public void setDataFimVigenciaAnterior(String dataFimVigenciaAnterior) {
		this.dataFimVigenciaAnterior = dataFimVigenciaAnterior;
	}

	public String getDataCancelamentoAnterior() {
		return dataCancelamentoAnterior;
	}

	public void setDataCancelamentoAnterior(String dataCancelamentoAnterior) {
		this.dataCancelamentoAnterior = dataCancelamentoAnterior;
	}


}
