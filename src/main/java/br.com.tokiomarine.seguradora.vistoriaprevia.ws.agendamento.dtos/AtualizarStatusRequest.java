package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


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
 *         &lt;element name="parametroStatusAgendamento" type="{http://www.tokiomarine.com.br}ParametroStatusAgendamento" maxOccurs="unbounded" minOccurs="0"/>
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
    "parametroStatusAgendamento"
})
@XmlRootElement(name = "atualizarStatus")
public class AtualizarStatusRequest implements Serializable {
    
	private static final long serialVersionUID = -6947967996942391915L;
	
	@XmlElement(name = "parametroStatusAgendamento", nillable = true)
    protected ParametroStatusAgendamento parametroStatusAgendamento;

    /**
     * Gets the value of the parametroStatusAgendamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametroStatusAgendamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametroStatusAgendamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroStatusAgendamento }
     * 
     * 
     */
    public ParametroStatusAgendamento getParametroStatusAgendamento() { 
        return this.parametroStatusAgendamento;
    }

}
