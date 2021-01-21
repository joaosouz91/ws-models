//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.01.16 �s 03:44:08 PM BRST 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.dtos;

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
 *         &lt;element name="retornoEnvioLaudo" type="{http://www.tokiomarine.com.br}RetornoEnvioLaudo"/>
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
    "retornoEnvioLaudo"
})
@XmlRootElement(name = "enviarLaudosResponse")
public class EnviarLaudosResponse implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2365276872971314836L;
	@XmlElement(required = true)
    protected RetornoEnvioLaudo retornoEnvioLaudo;

    /**
     * Obt�m o valor da propriedade retornoEnvioLaudo.
     * 
     * @return
     *     possible object is
     *     {@link RetornoEnvioLaudo }
     *     
     */
    public RetornoEnvioLaudo getRetornoEnvioLaudo() {
        return retornoEnvioLaudo;
    }

    /**
     * Define o valor da propriedade retornoEnvioLaudo.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoEnvioLaudo }
     *     
     */
    public void setRetornoEnvioLaudo(RetornoEnvioLaudo value) {
        this.retornoEnvioLaudo = value;
    }

}
