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
 * <p>Classe Java de ErroRetornoEnvioLaudo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ErroRetornoEnvioLaudo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicadorAceiteVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="erros" type="{http://www.tokiomarine.com.br}ErroVP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numeroLaudo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErroRetornoEnvioLaudo", propOrder = {
    "indicadorAceiteVistoria",
    "erros",
    "numeroLaudo"
})
public class ErroRetornoEnvioLaudo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1884767632929767868L;
	@XmlElement(required = true)
    protected String indicadorAceiteVistoria;
    protected List<ErroVP> erros;
    @XmlElement(required = true)
    protected String numeroLaudo;

    /**
     * Obt�m o valor da propriedade indicadorAceiteVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorAceiteVistoria() {
        return indicadorAceiteVistoria;
    }

    /**
     * Define o valor da propriedade indicadorAceiteVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorAceiteVistoria(String value) {
        this.indicadorAceiteVistoria = value;
    }

    /**
     * Gets the value of the erros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErroVP }
     * 
     * 
     */
    public List<ErroVP> getErros() {
        if (erros == null) {
            erros = new ArrayList<ErroVP>();
        }
        return this.erros;
    }

    /**
     * Obt�m o valor da propriedade numeroLaudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLaudo() {
        return numeroLaudo;
    }

    /**
     * Define o valor da propriedade numeroLaudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLaudo(String value) {
        this.numeroLaudo = value;
    }

}
