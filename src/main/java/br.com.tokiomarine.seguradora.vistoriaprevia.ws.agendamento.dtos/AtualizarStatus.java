//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.29 �s 06:00:41 PM BRT 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="parametroStatusAgendamento" type="{http://www.tokiomarine.com.br}ParametroStatusAgendamento"/>
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
public class AtualizarStatus {

    @XmlElement(required = true, nillable = true)
    protected ParametroStatusAgendamento parametroStatusAgendamento;

    /**
     * Obt�m o valor da propriedade parametroStatusAgendamento.
     * 
     * @return
     *     possible object is
     *     {@link ParametroStatusAgendamento }
     *     
     */
    public ParametroStatusAgendamento getParametroStatusAgendamento() {
        return parametroStatusAgendamento;
    }

    /**
     * Define o valor da propriedade parametroStatusAgendamento.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametroStatusAgendamento }
     *     
     */
    public void setParametroStatusAgendamento(ParametroStatusAgendamento value) {
        this.parametroStatusAgendamento = value;
    }

}
