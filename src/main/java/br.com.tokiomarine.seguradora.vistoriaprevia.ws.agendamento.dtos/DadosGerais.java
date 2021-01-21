//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.29 �s 06:00:41 PM BRT 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * <p>Classe Java de DadosGerais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosGerais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="periodoVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomeContatoVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailsContato" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoEnvio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomePosto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nrVoucher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefonesContato" type="{http://www.tokiomarine.com.br}Telefone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataVistoria" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosGerais", propOrder = {
    "periodoVistoria",
    "nomeContatoVistoria",
    "emailsContato",
    "tipoEnvio",
    "nomePosto",
    "tipoVistoria",
    "nrVoucher",
    "telefonesContato",
    "dataVistoria"
})
public class DadosGerais {

    @XmlElement(required = true, nillable = true)
    protected String periodoVistoria;
    @XmlElement(required = true, nillable = true)
    protected String nomeContatoVistoria;
    @XmlElement(nillable = true)
    protected List<String> emailsContato;
    @XmlElement(required = true, nillable = true)
    protected String tipoEnvio;
    @XmlElement(required = true, nillable = true)
    protected String nomePosto;
    @XmlElement(required = true, nillable = true)
    protected String tipoVistoria;
    @XmlElement(required = true, nillable = true)
    protected String nrVoucher;
    @XmlElement(nillable = true)
    protected List<Telefone> telefonesContato;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected Date dataVistoria;

    /**
     * Obt�m o valor da propriedade periodoVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoVistoria() {
        return periodoVistoria;
    }

    /**
     * Define o valor da propriedade periodoVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoVistoria(String value) {
        this.periodoVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade nomeContatoVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeContatoVistoria() {
        return nomeContatoVistoria;
    }

    /**
     * Define o valor da propriedade nomeContatoVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeContatoVistoria(String value) {
        this.nomeContatoVistoria = value;
    }

    /**
     * Gets the value of the emailsContato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailsContato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailsContato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailsContato() {
        if (emailsContato == null) {
            emailsContato = new ArrayList<String>();
        }
        return this.emailsContato;
    }

    /**
     * Obt�m o valor da propriedade tipoEnvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEnvio() {
        return tipoEnvio;
    }

    /**
     * Define o valor da propriedade tipoEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEnvio(String value) {
        this.tipoEnvio = value;
    }

    /**
     * Obt�m o valor da propriedade nomePosto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePosto() {
        return nomePosto;
    }

    /**
     * Define o valor da propriedade nomePosto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePosto(String value) {
        this.nomePosto = value;
    }

    /**
     * Obt�m o valor da propriedade tipoVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVistoria() {
        return tipoVistoria;
    }

    /**
     * Define o valor da propriedade tipoVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVistoria(String value) {
        this.tipoVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade nrVoucher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrVoucher() {
        return nrVoucher;
    }

    /**
     * Define o valor da propriedade nrVoucher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrVoucher(String value) {
        this.nrVoucher = value;
    }

    /**
     * Gets the value of the telefonesContato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefonesContato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefonesContato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telefone }
     * 
     * 
     */
    public List<Telefone> getTelefonesContato() {
        if (telefonesContato == null) {
            telefonesContato = new ArrayList<Telefone>();
        }
        return this.telefonesContato;
    }

    /**
     * Obt�m o valor da propriedade dataVistoria.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDataVistoria() {
        return dataVistoria;
    }

    /**
     * Define o valor da propriedade dataVistoria.
     * 
     * @param date
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVistoria(Date date) {
        this.dataVistoria = date;
    }

}
