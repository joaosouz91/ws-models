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
 * <p>Classe Java de AvariasLaudoVP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AvariasLaudoVP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoAvaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoPecaAvariada" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="horasEletrica" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="horasFunilaria" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="horasPintura" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="horasTapecaria" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvariasLaudoVP", propOrder = {
    "codigoAvaria",
    "codigoPecaAvariada",
    "horasEletrica",
    "horasFunilaria",
    "horasPintura",
    "horasTapecaria"
})
public class AvariasLaudoVP implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5096635841841391218L;
	protected String codigoAvaria;
    protected Long codigoPecaAvariada;
    protected Long horasEletrica;
    protected Long horasFunilaria;
    protected Long horasPintura;
    protected Long horasTapecaria;

    /**
     * Obt�m o valor da propriedade codigoAvaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAvaria() {
        return codigoAvaria;
    }

    /**
     * Define o valor da propriedade codigoAvaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAvaria(String value) {
        this.codigoAvaria = value;
    }

    /**
     * Obt�m o valor da propriedade codigoPecaAvariada.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoPecaAvariada() {
        return codigoPecaAvariada;
    }

    /**
     * Define o valor da propriedade codigoPecaAvariada.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoPecaAvariada(Long value) {
        this.codigoPecaAvariada = value;
    }

    /**
     * Obt�m o valor da propriedade horasEletrica.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHorasEletrica() {
        return horasEletrica;
    }

    /**
     * Define o valor da propriedade horasEletrica.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHorasEletrica(Long value) {
        this.horasEletrica = value;
    }

    /**
     * Obt�m o valor da propriedade horasFunilaria.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHorasFunilaria() {
        return horasFunilaria;
    }

    /**
     * Define o valor da propriedade horasFunilaria.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHorasFunilaria(Long value) {
        this.horasFunilaria = value;
    }

    /**
     * Obt�m o valor da propriedade horasPintura.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHorasPintura() {
        return horasPintura;
    }

    /**
     * Define o valor da propriedade horasPintura.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHorasPintura(Long value) {
        this.horasPintura = value;
    }

    /**
     * Obt�m o valor da propriedade horasTapecaria.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHorasTapecaria() {
        return horasTapecaria;
    }

    /**
     * Define o valor da propriedade horasTapecaria.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHorasTapecaria(Long value) {
        this.horasTapecaria = value;
    }

}
