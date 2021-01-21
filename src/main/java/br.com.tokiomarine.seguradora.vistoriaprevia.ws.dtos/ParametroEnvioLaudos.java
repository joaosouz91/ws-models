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
 * <p>Classe Java de ParametroEnvioLaudos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ParametroEnvioLaudos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoAgrupamentoPrestadora" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="laudos" type="{http://www.tokiomarine.com.br}LaudoVP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametroEnvioLaudos", propOrder = {
    "codigoAgrupamentoPrestadora",
    "laudos",
    "senha"
})
public class ParametroEnvioLaudos implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5099985925309462079L;
	protected Long codigoAgrupamentoPrestadora;
    @XmlElement(nillable = true)
    protected List<LaudoVP> laudos;
    protected String senha;

    /**
     * Obt�m o valor da propriedade codigoAgrupamentoPrestadora.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoAgrupamentoPrestadora() {
        return codigoAgrupamentoPrestadora;
    }

    /**
     * Define o valor da propriedade codigoAgrupamentoPrestadora.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoAgrupamentoPrestadora(Long value) {
        this.codigoAgrupamentoPrestadora = value;
    }

    /**
     * Gets the value of the laudos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laudos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaudos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaudoVP }
     * 
     * 
     */
    public List<LaudoVP> getLaudos() {
        if (laudos == null) {
            laudos = new ArrayList<LaudoVP>();
        }
        return this.laudos;
    }

    /**
     * Obt�m o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

}
