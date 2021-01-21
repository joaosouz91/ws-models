//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.01.16 �s 03:44:08 PM BRST 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.Date;


/**
 * <p>Classe Java de ProprietarioVeiculoLaudoVP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProprietarioVeiculoLaudoVP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atividadeProfissional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCnh" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ufCnh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietarioVeiculoLaudoVP", propOrder = {
    "atividadeProfissional",
    "cnh",
    "dataCnh",
    "dataNascimento",
    "estadoCivil",
    "sexo",
    "ufCnh"
})
public class ProprietarioVeiculoLaudoVP implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4729350991882784354L;
	protected String atividadeProfissional;
    protected String cnh;
    @XmlSchemaType(name = "dateTime")
    protected Date dataCnh;
    @XmlSchemaType(name = "dateTime")
    protected Date dataNascimento;
    protected String estadoCivil;
    protected String sexo;
    protected String ufCnh;

    /**
     * Obt�m o valor da propriedade atividadeProfissional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtividadeProfissional() {
        return atividadeProfissional;
    }

    /**
     * Define o valor da propriedade atividadeProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtividadeProfissional(String value) {
        this.atividadeProfissional = value;
    }

    /**
     * Obt�m o valor da propriedade cnh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnh() {
        return cnh;
    }

    /**
     * Define o valor da propriedade cnh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnh(String value) {
        this.cnh = value;
    }

    /**
     * Obt�m o valor da propriedade dataCnh.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDataCnh() {
        return dataCnh;
    }

    /**
     * Define o valor da propriedade dataCnh.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCnh(Date value) {
        this.dataCnh = value;
    }

    /**
     * Obt�m o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNascimento(Date value) {
        this.dataNascimento = value;
    }

    /**
     * Obt�m o valor da propriedade estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define o valor da propriedade estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Obt�m o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obt�m o valor da propriedade ufCnh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfCnh() {
        return ufCnh;
    }

    /**
     * Define o valor da propriedade ufCnh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfCnh(String value) {
        this.ufCnh = value;
    }

}
