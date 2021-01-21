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
 * <p>Classe Java de DadosGeraisMobile complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DadosGeraisMobile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeContatoVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nrVoucher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailsContato" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="telefonesContato" type="{http://www.tokiomarine.com.br}Telefone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosGeraisMobile", propOrder = {
    "nomeContatoVistoria",
    "nrVoucher",
    "emailsContato",
    "telefonesContato"
})
public class DadosGeraisMobile {

    @XmlElement(required = true, nillable = true)
    protected String nomeContatoVistoria;
    @XmlElement(required = true, nillable = true)
    protected String nrVoucher;
    @XmlElement(nillable = true)
    protected List<String> emailsContato;
    @XmlElement(nillable = true)
    protected List<Telefone> telefonesContato;

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

}
