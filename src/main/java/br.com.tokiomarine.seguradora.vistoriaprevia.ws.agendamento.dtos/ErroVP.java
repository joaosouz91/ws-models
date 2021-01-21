//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.05.18 �s 04:32:21 PM BRT 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;


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
 *         &lt;element name="codigoFabricante" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="indicadorAceiteVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoVeiculo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dataTransmissaoVistoria" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dataRealizacaoVistoria" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="codigoErro" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
	private static final long serialVersionUID = -3784360712460841024L;
	@XmlElement(required = true, type = Long.class, nillable = true)
    protected Long anoFabricacao;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long codigoFabricante;
    @XmlElement(required = true, nillable = true)
    protected String indicadorAceiteVistoria;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long codigoVeiculo;
    @XmlElement(required = true, nillable = true)    
    protected String dataTransmissaoVistoria;
    @XmlElement(required = true, nillable = true)    
    protected String dataRealizacaoVistoria;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long codigoErro;
    @XmlElement(required = true, nillable = true)
    protected String statusVistoria;
    @XmlElement(required = true, nillable = true)
    protected String chassi;
    @XmlElement(required = true, nillable = true)
    protected String descricaoMotivoErro;
    @XmlElement(required = true, nillable = true)
    protected String placa;
    @XmlElement(required = true, nillable = true)
    protected String detalheErro1;
    @XmlElement(required = true, nillable = true)
    protected String descricaoModelo;
    @XmlElement(required = true, nillable = true)
    protected String detalheErro2;
    @XmlElement(required = true, nillable = true)
    protected String tipoCombustivel;

    /**
     * Obt�m o valor da propriedade anoFabricacao.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnoFabricacao() {
        return anoFabricacao;
    }

    /**
     * Define o valor da propriedade anoFabricacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnoFabricacao(Long value) {
        this.anoFabricacao = value;
    }

    /**
     * Obt�m o valor da propriedade codigoFabricante.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoFabricante() {
        return codigoFabricante;
    }

    /**
     * Define o valor da propriedade codigoFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoFabricante(Long value) {
        this.codigoFabricante = value;
    }

    /**
     * Obt�m o valor da propriedade indicadorAceiteVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorAceiteVistoria() {
        return indicadorAceiteVistoria;
    }

    /**
     * Define o valor da propriedade indicadorAceiteVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorAceiteVistoria(String value) {
        this.indicadorAceiteVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade codigoVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoVeiculo() {
        return codigoVeiculo;
    }

    /**
     * Define o valor da propriedade codigoVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoVeiculo(Long value) {
        this.codigoVeiculo = value;
    }

    /**
     * Obt�m o valor da propriedade dataTransmissaoVistoria.
     * 
     * @return
     *     
     */
    public String getDataTransmissaoVistoria() {
        return dataTransmissaoVistoria;
    }

    /**
     * Define o valor da propriedade dataTransmissaoVistoria.
     * 
     * @param value

     *     
     */
    public void setDataTransmissaoVistoria(String value) {
        this.dataTransmissaoVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade dataRealizacaoVistoria.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDataRealizacaoVistoria() {
        return dataRealizacaoVistoria;
    }

    /**
     * Define o valor da propriedade dataRealizacaoVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRealizacaoVistoria(String value) {
        this.dataRealizacaoVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade codigoErro.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoErro() {
        return codigoErro;
    }

    /**
     * Define o valor da propriedade codigoErro.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoErro(Long value) {
        this.codigoErro = value;
    }

    /**
     * Obt�m o valor da propriedade statusVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusVistoria() {
        return statusVistoria;
    }

    /**
     * Define o valor da propriedade statusVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusVistoria(String value) {
        this.statusVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade chassi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * Define o valor da propriedade chassi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassi(String value) {
        this.chassi = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoMotivoErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoMotivoErro() {
        return descricaoMotivoErro;
    }

    /**
     * Define o valor da propriedade descricaoMotivoErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoMotivoErro(String value) {
        this.descricaoMotivoErro = value;
    }

    /**
     * Obt�m o valor da propriedade placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define o valor da propriedade placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obt�m o valor da propriedade detalheErro1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalheErro1() {
        return detalheErro1;
    }

    /**
     * Define o valor da propriedade detalheErro1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalheErro1(String value) {
        this.detalheErro1 = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoModelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoModelo() {
        return descricaoModelo;
    }

    /**
     * Define o valor da propriedade descricaoModelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoModelo(String value) {
        this.descricaoModelo = value;
    }

    /**
     * Obt�m o valor da propriedade detalheErro2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalheErro2() {
        return detalheErro2;
    }

    /**
     * Define o valor da propriedade detalheErro2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalheErro2(String value) {
        this.detalheErro2 = value;
    }

    /**
     * Obt�m o valor da propriedade tipoCombustivel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * Define o valor da propriedade tipoCombustivel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCombustivel(String value) {
        this.tipoCombustivel = value;
    }

}
