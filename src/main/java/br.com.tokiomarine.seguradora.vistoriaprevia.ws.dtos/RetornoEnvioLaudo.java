//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.01.16 �s 03:44:08 PM BRST 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java de RetornoEnvioLaudo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetornoEnvioLaudo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusRetorno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errosLaudo" type="{http://www.tokiomarine.com.br}ErroRetornoEnvioLaudo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetornoEnvioLaudo", propOrder = {
    "statusRetorno",
    "mensagem",
    "errosLaudo"
})
public class RetornoEnvioLaudo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7903809262768563773L;
	@XmlElement(required = true)
    protected String statusRetorno;
    @XmlElement(required = true)
    protected String mensagem;
    protected List<ErroRetornoEnvioLaudo> errosLaudo;

    /**
     * Obt�m o valor da propriedade statusRetorno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusRetorno() {
        return statusRetorno;
    }

    /**
     * Define o valor da propriedade statusRetorno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusRetorno(String value) {
        this.statusRetorno = value;
    }

    /**
     * Obt�m o valor da propriedade mensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

    /**
     * Gets the value of the errosLaudo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errosLaudo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrosLaudo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErroRetornoEnvioLaudo }
     * 
     * 
     */
    public List<ErroRetornoEnvioLaudo> getErrosLaudo() {
        if (errosLaudo == null) {
            errosLaudo = new ArrayList<ErroRetornoEnvioLaudo>();
        }
        return this.errosLaudo;
    }

}
