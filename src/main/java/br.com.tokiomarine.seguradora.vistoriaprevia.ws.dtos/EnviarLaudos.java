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
 *         &lt;element name="parametroEnvioLaudos" type="{http://www.tokiomarine.com.br}ParametroEnvioLaudos" maxOccurs="unbounded" minOccurs="0"/>
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
    "parametroEnvioLaudos"
})
@XmlRootElement(name = "enviarLaudos")
public class EnviarLaudos implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -25561194675277726L;
	@XmlElement(nillable = true)
    protected List<ParametroEnvioLaudos> parametroEnvioLaudos;

    /**
     * Gets the value of the parametroEnvioLaudos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametroEnvioLaudos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametroEnvioLaudos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroEnvioLaudos }
     * 
     * 
     */
    public List<ParametroEnvioLaudos> getParametroEnvioLaudos() {
        if (parametroEnvioLaudos == null) {
            parametroEnvioLaudos = new ArrayList<ParametroEnvioLaudos>();
        }
        return this.parametroEnvioLaudos;
    }

}
