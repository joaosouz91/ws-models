//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.01.16 �s 03:44:08 PM BRST 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="retornoAtualizaListaPostos" type="{http://www.tokiomarine.com.br}RetornoAtualizaListaPostos" maxOccurs="unbounded" minOccurs="0"/>
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
    "retornoAtualizaListaPostos"
})
@XmlRootElement(name = "enviarListaPostosResponse")
public class EnviarListaPostosResponse implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1501956742783465489L;
	protected List<RetornoAtualizaListaPostos> retornoAtualizaListaPostos;

    /**
     * Gets the value of the retornoAtualizaListaPostos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retornoAtualizaListaPostos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetornoAtualizaListaPostos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetornoAtualizaListaPostos }
     * 
     * 
     */
    public List<RetornoAtualizaListaPostos> getRetornoAtualizaListaPostos() {
        if (retornoAtualizaListaPostos == null) {
            retornoAtualizaListaPostos = new ArrayList<RetornoAtualizaListaPostos>();
        }
        return this.retornoAtualizaListaPostos;
    }

}
