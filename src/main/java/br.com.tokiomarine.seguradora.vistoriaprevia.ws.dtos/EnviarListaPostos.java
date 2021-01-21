//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.01.16 �s 03:44:08 PM BRST 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.dtos;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametroEnvioListaPostos" type="{http://www.tokiomarine.com.br}ParametroEnvioListaPostos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parametroEnvioListaPostos"
})
@XmlRootElement(name = "enviarListaPostos")
public class EnviarListaPostos implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1808639660732312422L;
	@XmlElement(nillable = true)
    protected List<ParametroEnvioListaPostos> parametroEnvioListaPostos;

    /**
     * Gets the value of the parametroEnvioListaPostos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametroEnvioListaPostos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametroEnvioListaPostos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroEnvioListaPostos }
     * 
     * 
     */
    public List<ParametroEnvioListaPostos> getParametroEnvioListaPostos() {
        if (parametroEnvioListaPostos == null) {
            parametroEnvioListaPostos = new ArrayList<ParametroEnvioListaPostos>();
        }
        return this.parametroEnvioListaPostos;
    }

}
