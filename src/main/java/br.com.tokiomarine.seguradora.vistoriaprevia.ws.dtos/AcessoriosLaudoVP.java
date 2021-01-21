//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.01.16 �s 03:44:08 PM BRST 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Classe Java de AcessoriosLaudoVP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AcessoriosLaudoVP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoAcessorio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoComplemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAcessorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcessoriosLaudoVP", propOrder = {
    "codigoAcessorio",
    "codigoComplemento",
    "tipoAcessorio"
})
public class AcessoriosLaudoVP implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9084168640522306996L;
	protected Long codigoAcessorio;
    protected String codigoComplemento;
    protected String tipoAcessorio;

    /**
     * Obt�m o valor da propriedade codigoAcessorio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoAcessorio() {
        return codigoAcessorio;
    }

    /**
     * Define o valor da propriedade codigoAcessorio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoAcessorio(Long value) {
        this.codigoAcessorio = value;
    }

    /**
     * Obt�m o valor da propriedade codigoComplemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoComplemento() {
        return codigoComplemento;
    }

    /**
     * Define o valor da propriedade codigoComplemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoComplemento(String value) {
        this.codigoComplemento = value;
    }

    /**
     * Obt�m o valor da propriedade tipoAcessorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAcessorio() {
        return tipoAcessorio;
    }

    /**
     * Define o valor da propriedade tipoAcessorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAcessorio(String value) {
        this.tipoAcessorio = value;
    }

}
