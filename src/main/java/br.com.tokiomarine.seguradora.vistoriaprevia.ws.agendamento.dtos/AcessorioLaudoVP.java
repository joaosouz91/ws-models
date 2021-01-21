//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.05.18 �s 04:32:21 PM BRT 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


/**
 * <p>Classe Java de AcessorioLaudoVP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AcessorioLaudoVP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoAcessorio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoAcessorio" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="codigoComplemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcessorioLaudoVP", propOrder = {
    "tipoAcessorio",
    "codigoAcessorio",
    "codigoComplemento"
})
public class AcessorioLaudoVP implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2853177762300673620L;
	@XmlElement(required = true, nillable = true)
    protected String tipoAcessorio;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long codigoAcessorio;
    @XmlElement(required = true, nillable = true)
    protected String codigoComplemento;

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

}
