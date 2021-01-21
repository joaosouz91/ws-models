package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;
import java.util.Date;

public class ErroVP implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long codigoErro;
    private String descricaoMotivoErro;
    private String indicadorAceiteVistoria;
    private Date dataRealizacaoVistoria;
    private Date dataTransmissaoVistoria;
    private String placa;
    private String chassi;
    private String tipoCombustivel;
    private Long anoFabricacao;
    private String descricaoModelo;
    private Long codigoVeiculo;
    private Long codigoFabricante;
    private String detalheErro1;
    private String detalheErro2;
    private String codigoAgrupamentoEmpresaVistoriadora;
    private String statusVistoria;
    
    
    public ErroVP() {
    }
    
	public Long getCodigoErro() {
		return codigoErro;
	}
	public void setCodigoErro(Long codigoErro) {
		this.codigoErro = codigoErro;
	}
	public String getDescricaoMotivoErro() {
		return descricaoMotivoErro;
	}
	public void setDescricaoMotivoErro(String descricaoMotivoErro) {
		this.descricaoMotivoErro = descricaoMotivoErro;
	}
	public String getIndicadorAceiteVistoria() {
		return indicadorAceiteVistoria;
	}
	public void setIndicadorAceiteVistoria(String indicadorAceiteVistoria) {
		this.indicadorAceiteVistoria = indicadorAceiteVistoria;
	}
	public Date getDataRealizacaoVistoria() {
		return dataRealizacaoVistoria;
	}
	public void setDataRealizacaoVistoria(Date dataRealizacaoVistoria) {
		this.dataRealizacaoVistoria = dataRealizacaoVistoria;
	}
	public Date getDataTransmissaoVistoria() {
		return dataTransmissaoVistoria;
	}
	public void setDataTransmissaoVistoria(Date dataTransmissaoVistoria) {
		this.dataTransmissaoVistoria = dataTransmissaoVistoria;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public Long getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Long anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getDescricaoModelo() {
		return descricaoModelo;
	}
	public void setDescricaoModelo(String descricaoModelo) {
		this.descricaoModelo = descricaoModelo;
	}
	public Long getCodigoVeiculo() {
		return codigoVeiculo;
	}
	public void setCodigoVeiculo(Long codigoVeiculo) {
		this.codigoVeiculo = codigoVeiculo;
	}
	public Long getCodigoFabricante() {
		return codigoFabricante;
	}
	public void setCodigoFabricante(Long codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}
	public String getDetalheErro1() {
		return detalheErro1;
	}
	public void setDetalheErro1(String detalheErro1) {
		this.detalheErro1 = detalheErro1;
	}
	public String getDetalheErro2() {
		return detalheErro2;
	}
	public void setDetalheErro2(String detalheErro2) {
		this.detalheErro2 = detalheErro2;
	}
	public String getCodigoAgrupamentoEmpresaVistoriadora() {
		return codigoAgrupamentoEmpresaVistoriadora;
	}
	public void setCodigoAgrupamentoEmpresaVistoriadora(
			String codigoAgrupamentoEmpresaVistoriadora) {
		this.codigoAgrupamentoEmpresaVistoriadora = codigoAgrupamentoEmpresaVistoriadora;
	}
	public String getStatusVistoria() {
		return statusVistoria;
	}
	public void setStatusVistoria(String statusVistoria) {
		this.statusVistoria = statusVistoria;
	}
}
