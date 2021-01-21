//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.29 �s 06:00:41 PM BRT 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DadosSegurado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosSegurado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complementoEndereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpfCnpj" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomeSegurado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referenciaEndereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nrEndereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoPessoa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosSegurado", propOrder = {
    "complementoEndereco",
    "cpfCnpj",
    "cidade",
    "bairro",
    "cep",
    "uf",
    "nomeSegurado",
    "referenciaEndereco",
    "nrEndereco",
    "tipoPessoa",
    "endereco"
})
public class DadosSegurado {

    @XmlElement(required = true, nillable = true)
    protected String complementoEndereco;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long cpfCnpj;
    @XmlElement(required = true, nillable = true)
    protected String cidade;
    @XmlElement(required = true, nillable = true)
    protected String bairro;
    @XmlElement(required = true, nillable = true)
    protected String cep;
    @XmlElement(required = true, nillable = true)
    protected String uf;
    @XmlElement(required = true, nillable = true)
    protected String nomeSegurado;
    @XmlElement(required = true, nillable = true)
    protected String referenciaEndereco;
    @XmlElement(required = true, nillable = true)
    protected String nrEndereco;
    @XmlElement(required = true, nillable = true)
    protected String tipoPessoa;
    @XmlElement(required = true, nillable = true)
    protected String endereco;

    /**
     * Obt�m o valor da propriedade complementoEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    /**
     * Define o valor da propriedade complementoEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoEndereco(String value) {
        this.complementoEndereco = value;
    }

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
     * Obt�m o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obt�m o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Obt�m o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Obt�m o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
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
     * Obt�m o valor da propriedade referenciaEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaEndereco() {
        return referenciaEndereco;
    }

    /**
     * Define o valor da propriedade referenciaEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaEndereco(String value) {
        this.referenciaEndereco = value;
    }

    /**
     * Obt�m o valor da propriedade nrEndereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrEndereco() {
        return nrEndereco;
    }

    /**
     * Define o valor da propriedade nrEndereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrEndereco(String value) {
        this.nrEndereco = value;
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
     * Obt�m o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

}
