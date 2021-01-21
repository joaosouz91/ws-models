//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.05.18 �s 04:32:21 PM BRT 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * <p>Classe Java de LaudoVP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LaudoVP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="horaVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroLaudo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ufRealizacaoVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataVistoria" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="cidadeOrigemVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoCorretorInterno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="proponente" type="{http://www.tokiomarine.com.br}ProponenteLaudoVP"/>
 *         &lt;element name="statusVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataCadastro" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="codigosInformacoesTecnicas" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codigoVoucher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="veiculo" type="{http://www.tokiomarine.com.br}VeiculoLaudoVP"/>
 *         &lt;element name="linkFotoVistoria" type="{http://www.tokiomarine.com.br}LinkFotoVistoria" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaudoVP", propOrder = {
    "horaVistoria",
    "numeroLaudo",
    "ufRealizacaoVistoria",
    "dataVistoria",
    "cidadeOrigemVistoria",
    "codigoCorretorInterno",
    "proponente",
    "statusVistoria",
    "dataCadastro",
    "codigosInformacoesTecnicas",
    "codigoVoucher",
    "observacao",
    "veiculo",
    "linkFotoVistoria"
})
public class LaudoVP implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8078402989652400281L;
	@XmlElement(required = true, nillable = true)
    protected String horaVistoria;
    @XmlElement(required = true, nillable = true)
    protected String numeroLaudo;
    @XmlElement(required = true, nillable = true)
    protected String ufRealizacaoVistoria;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected String dataVistoria;
    @XmlElement(required = true, nillable = true)
    protected String cidadeOrigemVistoria;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long codigoCorretorInterno;
    @XmlElement(required = true, nillable = true)
    protected ProponenteLaudoVP proponente;
    @XmlElement(required = true, nillable = true)
    protected String statusVistoria;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected Date dataCadastro;
    @XmlElement(nillable = true)
    protected List<Long> codigosInformacoesTecnicas;
    @XmlElement(required = true, nillable = true)
    protected String codigoVoucher;
    @XmlElement(required = true, nillable = true)
    protected String observacao;
    @XmlElement(required = true, nillable = true)
    protected VeiculoLaudoVP veiculo;
    @XmlElement(nillable = true)
    protected List<LinkFotoVistoria> linkFotoVistoria;

    /**
     * Obt�m o valor da propriedade horaVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraVistoria() {
        return horaVistoria;
    }

    /**
     * Define o valor da propriedade horaVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraVistoria(String value) {
        this.horaVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade numeroLaudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLaudo() {
        return numeroLaudo;
    }

    /**
     * Define o valor da propriedade numeroLaudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLaudo(String value) {
        this.numeroLaudo = value;
    }

    /**
     * Obt�m o valor da propriedade ufRealizacaoVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfRealizacaoVistoria() {
        return ufRealizacaoVistoria;
    }

    /**
     * Define o valor da propriedade ufRealizacaoVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfRealizacaoVistoria(String value) {
        this.ufRealizacaoVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade dataVistoria.
     * 
     * @return
     *     
     */
    public String getDataVistoria() {
        return dataVistoria;
    }

    /**
     * Define o valor da propriedade dataVistoria.
     * 
     * @param value
     *    
     *     
     */
    public void setDataVistoria(String value) {
        this.dataVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade cidadeOrigemVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeOrigemVistoria() {
        return cidadeOrigemVistoria;
    }

    /**
     * Define o valor da propriedade cidadeOrigemVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeOrigemVistoria(String value) {
        this.cidadeOrigemVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade codigoCorretorInterno.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoCorretorInterno() {
        return codigoCorretorInterno;
    }

    /**
     * Define o valor da propriedade codigoCorretorInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoCorretorInterno(Long value) {
        this.codigoCorretorInterno = value;
    }

    /**
     * Obt�m o valor da propriedade proponente.
     * 
     * @return
     *     possible object is
     *     {@link ProponenteLaudoVP }
     *     
     */
    public ProponenteLaudoVP getProponente() {
        return proponente;
    }

    /**
     * Define o valor da propriedade proponente.
     * 
     * @param value
     *     allowed object is
     *     {@link ProponenteLaudoVP }
     *     
     */
    public void setProponente(ProponenteLaudoVP value) {
        this.proponente = value;
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
     * Obt�m o valor da propriedade dataCadastro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDataCadastro() {
        return dataCadastro;
    }

    /**
     * Define o valor da propriedade dataCadastro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCadastro(Date value) {
        this.dataCadastro = value;
    }

    /**
     * Gets the value of the codigosInformacoesTecnicas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codigosInformacoesTecnicas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodigosInformacoesTecnicas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCodigosInformacoesTecnicas() {
        if (codigosInformacoesTecnicas == null) {
            codigosInformacoesTecnicas = new ArrayList<Long>();
        }
        return this.codigosInformacoesTecnicas;
    }

    /**
     * Obt�m o valor da propriedade codigoVoucher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVoucher() {
        return codigoVoucher;
    }

    /**
     * Define o valor da propriedade codigoVoucher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVoucher(String value) {
        this.codigoVoucher = value;
    }

    /**
     * Obt�m o valor da propriedade observacao.
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
     * Obt�m o valor da propriedade veiculo.
     * 
     * @return
     *     possible object is
     *     {@link VeiculoLaudoVP }
     *     
     */
    public VeiculoLaudoVP getVeiculo() {
        return veiculo;
    }

    /**
     * Define o valor da propriedade veiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link VeiculoLaudoVP }
     *     
     */
    public void setVeiculo(VeiculoLaudoVP value) {
        this.veiculo = value;
    }

    /**
     * Gets the value of the linkFotoVistoria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkFotoVistoria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkFotoVistoria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkFotoVistoria }
     * 
     * 
     */
    public List<LinkFotoVistoria> getLinkFotoVistoria() {
        if (linkFotoVistoria == null) {
            linkFotoVistoria = new ArrayList<LinkFotoVistoria>();
        }
        return this.linkFotoVistoria;
    }

}
