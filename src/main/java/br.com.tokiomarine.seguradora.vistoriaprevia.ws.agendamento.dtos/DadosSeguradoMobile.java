//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.29 �s 06:17:31 PM BRT 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java de DadosSeguradoMobile complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosSeguradoMobile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfCnpj" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nomeSegurado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoPessoa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefones" type="{http://www.tokiomarine.com.br}Telefone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="emails" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosSeguradoMobile", propOrder = {
    "cpfCnpj",
    "nomeSegurado",
    "tipoPessoa",
    "telefones",
    "emails"
})
public class DadosSeguradoMobile {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cpfCnpj;
    @XmlElement(required = true, nillable = true)
    protected String nomeSegurado;
    @XmlElement(required = true, nillable = true)
    protected String tipoPessoa;
    @XmlElement(nillable = true)
    protected List<Telefone> telefones;
    @XmlElement(nillable = true)
    protected List<String> emails;

    /**
     * Obt�m o valor da propriedade cpfCnpj.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * Define o valor da propriedade cpfCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCpfCnpj(Long value) {
        this.cpfCnpj = value;
    }

    /**
     * Obt�m o valor da propriedade nomeSegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSegurado() {
        return nomeSegurado;
    }

    /**
     * Define o valor da propriedade nomeSegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSegurado(String value) {
        this.nomeSegurado = value;
    }

    /**
     * Obt�m o valor da propriedade tipoPessoa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPessoa() {
        return tipoPessoa;
    }

    /**
     * Define o valor da propriedade tipoPessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPessoa(String value) {
        this.tipoPessoa = value;
    }

    /**
     * Gets the value of the telefones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telefone }
     * 
     * 
     */
    public List<Telefone> getTelefones() {
        if (telefones == null) {
            telefones = new ArrayList<Telefone>();
        }
        return this.telefones;
    }

    /**
     * Gets the value of the emails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmails() {
        if (emails == null) {
            emails = new ArrayList<String>();
        }
        return this.emails;
    }

}
