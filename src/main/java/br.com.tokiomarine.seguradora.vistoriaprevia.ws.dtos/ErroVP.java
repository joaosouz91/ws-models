//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.01.16 �s 03:44:08 PM BRST 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.dtos;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>Classe Java de ErroVP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ErroVP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anoFabricacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codigoAgrupamentoEmpresaVistoriadora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoFabricante" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="indicadorAceiteVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoVeiculo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dataTransmissaoVistoria" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dataRealizacaoVistoria" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="codigoErro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="statusVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chassi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descricaoMotivoErro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detalheErro1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descricaoModelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detalheErro2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoCombustivel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErroVP", propOrder = {
    "anoFabricacao",
    "codigoAgrupamentoEmpresaVistoriadora",
    "codigoFabricante",
    "indicadorAceiteVistoria",
    "codigoVeiculo",
    "dataTransmissaoVistoria",
    "dataRealizacaoVistoria",
    "codigoErro",
    "statusVistoria",
    "chassi",
    "descricaoMotivoErro",
    "placa",
    "detalheErro1",
    "descricaoModelo",
    "detalheErro2",
    "tipoCombustivel"
})
public class ErroVP implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4655595160069687288L;
	protected Long anoFabricacao;
    @XmlElement(required = true)
    protected String codigoAgrupamentoEmpresaVistoriadora;
    protected Long codigoFabricante;
    @XmlElement(required = true)
    protected String indicadorAceiteVistoria;
    protected Long codigoVeiculo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date dataTransmissaoVistoria;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date dataRealizacaoVistoria;
    protected Long codigoErro;
    @XmlElement(required = true)
    protected String statusVistoria;
    @XmlElement(required = true)
    protected String chassi;
    @XmlElement(required = true)
    protected String descricaoMotivoErro;
    @XmlElement(required = true)
    protected String placa;
    @XmlElement(required = true)
    protected String detalheErro1;
    @XmlElement(required = true)
    protected String descricaoModelo;
    @XmlElement(required = true)
    protected String detalheErro2;
    @XmlElement(required = true)
    protected String tipoCombustivel;
	public Long getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Long anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getCodigoAgrupamentoEmpresaVistoriadora() {
		return codigoAgrupamentoEmpresaVistoriadora;
	}
	public void setCodigoAgrupamentoEmpresaVistoriadora(String codigoAgrupamentoEmpresaVistoriadora) {
		this.codigoAgrupamentoEmpresaVistoriadora = codigoAgrupamentoEmpresaVistoriadora;
	}
	public Long getCodigoFabricante() {
		return codigoFabricante;
	}
	public void setCodigoFabricante(Long codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}
	public String getIndicadorAceiteVistoria() {
		return indicadorAceiteVistoria;
	}
	public void setIndicadorAceiteVistoria(String indicadorAceiteVistoria) {
		this.indicadorAceiteVistoria = indicadorAceiteVistoria;
	}
	public Long getCodigoVeiculo() {
		return codigoVeiculo;
	}
	public void setCodigoVeiculo(Long codigoVeiculo) {
		this.codigoVeiculo = codigoVeiculo;
	}
	public Date getDataTransmissaoVistoria() {
		return dataTransmissaoVistoria;
	}
	public void setDataTransmissaoVistoria(Date dataTransmissaoVistoria) {
		this.dataTransmissaoVistoria = dataTransmissaoVistoria;
	}
	public Date getDataRealizacaoVistoria() {
		return dataRealizacaoVistoria;
	}
	public void setDataRealizacaoVistoria(Date dataRealizacaoVistoria) {
		this.dataRealizacaoVistoria = dataRealizacaoVistoria;
	}
	public Long getCodigoErro() {
		return codigoErro;
	}
	public void setCodigoErro(Long codigoErro) {
		this.codigoErro = codigoErro;
	}
	public String getStatusVistoria() {
		return statusVistoria;
	}
	public void setStatusVistoria(String statusVistoria) {
		this.statusVistoria = statusVistoria;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getDescricaoMotivoErro() {
		return descricaoMotivoErro;
	}
	public void setDescricaoMotivoErro(String descricaoMotivoErro) {
		this.descricaoMotivoErro = descricaoMotivoErro;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getDetalheErro1() {
		return detalheErro1;
	}
	public void setDetalheErro1(String detalheErro1) {
		this.detalheErro1 = detalheErro1;
	}
	public String getDescricaoModelo() {
		return descricaoModelo;
	}
	public void setDescricaoModelo(String descricaoModelo) {
		this.descricaoModelo = descricaoModelo;
	}
	public String getDetalheErro2() {
		return detalheErro2;
	}
	public void setDetalheErro2(String detalheErro2) {
		this.detalheErro2 = detalheErro2;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

 
}
