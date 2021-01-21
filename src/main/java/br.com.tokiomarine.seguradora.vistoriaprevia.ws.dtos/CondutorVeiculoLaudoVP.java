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
 * <p>Classe Java de CondutorVeiculoLaudoVP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CondutorVeiculoLaudoVP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cnh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "CondutorVeiculoLaudoVP", propOrder = {
    "cnh",
    "cpf",
    "dataNascimento",
    "estadoCivil",
    "nome",
    "tipo",
    "ufCnh"
})
public class CondutorVeiculoLaudoVP implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2111977244764216080L;
	protected String cnh;
    protected Long cpf;
    @XmlSchemaType(name = "dateTime")
    protected Date dataNascimento;
    protected String estadoCivil;
    protected String nome;
    protected Long tipo;
    protected String ufCnh;

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
     * Obt�m o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCpf(Long value) {
        this.cpf = value;
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
     * Obt�m o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obt�m o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTipo(Long value) {
        this.tipo = value;
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
