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
 *         &lt;element name="parametroAgendamento" type="{http://www.tokiomarine.com.br}ParametroAgendamento" maxOccurs="unbounded" minOccurs="0"/>
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
    "parametroAgendamento"
})
@XmlRootElement(name = "obterAgendamentos")
public class ObterAgendamentosRequest implements Serializable {
    
	private static final long serialVersionUID = 3795558355497885771L;
	
	@XmlElement(name="parametroAgendamento", nillable = true)
    protected ParametroAgendamento parametroAgendamento;

    /**
     * Gets the value of the parametroAgendamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametroAgendamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametroAgendamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroAgendamento }
     * 
     * 
     */
    public ParametroAgendamento getParametroAgendamento() {
        return this.parametroAgendamento;
    }

}
