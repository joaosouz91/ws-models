//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.05.18 �s 04:32:21 PM BRT 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

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
 *         &lt;element name="parametroEnvioLaudos" type="{http://www.tokiomarine.com.br}ParametroEnvioLaudos"/>
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
@XmlRootElement(name = "enviarMobileLaudos")
public class EnviarMobileLaudos implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8900621649936918783L;
	@XmlElement(name="parametroEnvioLaudos", required = true, nillable = true)
    protected List<ParametroEnvioLaudos> parametroEnvioLaudos;

    /**
     * Obt�m o valor da propriedade parametroEnvioLaudos.
     * 
     * @return
     *     possible object is
     *     {@link ParametroEnvioLaudos }
     *     
     */
    public List<ParametroEnvioLaudos> getParametroEnvioLaudos() {
        if (parametroEnvioLaudos == null) {
            parametroEnvioLaudos = new ArrayList<ParametroEnvioLaudos>();
        }
        return this.parametroEnvioLaudos;
    }

}
