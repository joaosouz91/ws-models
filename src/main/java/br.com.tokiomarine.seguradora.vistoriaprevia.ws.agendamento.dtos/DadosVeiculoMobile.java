//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.04.29 às 06:17:31 PM BRT 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DadosVeiculoMobile complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosVeiculoMobile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carroceria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zeroKm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tpVeiculo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anoFabricacao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="chassi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoModelo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoFabricante" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fabricante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anoModelo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codigoFipe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adaptacaoDeEixo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoCarroceria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosVeiculoMobile", propOrder = {
    "carroceria",
    "zeroKm",
    "tpVeiculo",
    "anoFabricacao",
    "chassi",
    "codigoModelo",
    "modelo",
    "observacao",
    "codigoFabricante",
    "fabricante",
    "anoModelo",
    "codigoFipe",
    "placa",
    "adaptacaoDeEixo",
    "tipoCarroceria"
})
public class DadosVeiculoMobile {

    @XmlElement(required = true, nillable = true)
    protected String carroceria;
    @XmlElement(required = true, nillable = true)
    protected String zeroKm;
    @XmlElement(required = true, nillable = true)
    protected String tpVeiculo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long anoFabricacao;
    @XmlElement(required = true, nillable = true)
    protected String chassi;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long codigoModelo;
    @XmlElement(required = true, nillable = true)
    protected String modelo;
    @XmlElement(required = true, nillable = true)
    protected String observacao;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long codigoFabricante;
    @XmlElement(required = true, nillable = true)
    protected String fabricante;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long anoModelo;
    @XmlElement(required = true, nillable = true)
    protected String codigoFipe;
    @XmlElement(required = true, nillable = true)
    protected String placa;
    @XmlElement(required = true, nillable = true)
    protected String adaptacaoDeEixo;
    @XmlElement(required = true, nillable = true)
    protected String tipoCarroceria;

    /**
     * Obtém o valor da propriedade carroceria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarroceria() {
        return carroceria;
    }

    /**
     * Define o valor da propriedade carroceria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarroceria(String value) {
        this.carroceria = value;
    }

    /**
     * Obtém o valor da propriedade zeroKm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroKm() {
        return zeroKm;
    }

    /**
     * Define o valor da propriedade zeroKm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroKm(String value) {
        this.zeroKm = value;
    }

    /**
     * Obtém o valor da propriedade tpVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpVeiculo() {
        return tpVeiculo;
    }

    /**
     * Define o valor da propriedade tpVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpVeiculo(String value) {
        this.tpVeiculo = value;
    }

    /**
     * Obtém o valor da propriedade anoFabricacao.
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
     * Obtém o valor da propriedade chassi.
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
     * Obtém o valor da propriedade codigoModelo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoModelo() {
        return codigoModelo;
    }

    /**
     * Define o valor da propriedade codigoModelo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoModelo(Long value) {
        this.codigoModelo = value;
    }

    /**
     * Obtém o valor da propriedade modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o valor da propriedade modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obtém o valor da propriedade codigoFabricante.
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
     * Obtém o valor da propriedade fabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Define o valor da propriedade fabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFabricante(String value) {
        this.fabricante = value;
    }

    /**
     * Obtém o valor da propriedade anoModelo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnoModelo() {
        return anoModelo;
    }

    /**
     * Define o valor da propriedade anoModelo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnoModelo(Long value) {
        this.anoModelo = value;
    }

    /**
     * Obtém o valor da propriedade codigoFipe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFipe() {
        return codigoFipe;
    }

    /**
     * Define o valor da propriedade codigoFipe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFipe(String value) {
        this.codigoFipe = value;
    }

    /**
     * Obtém o valor da propriedade placa.
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
     * Obtém o valor da propriedade adaptacaoDeEixo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdaptacaoDeEixo() {
        return adaptacaoDeEixo;
    }

    /**
     * Define o valor da propriedade adaptacaoDeEixo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdaptacaoDeEixo(String value) {
        this.adaptacaoDeEixo = value;
    }

    /**
     * Obtém o valor da propriedade tipoCarroceria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    /**
     * Define o valor da propriedade tipoCarroceria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCarroceria(String value) {
        this.tipoCarroceria = value;
    }

}
