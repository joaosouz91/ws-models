//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem.
// Gerado em: 2018.08.15 às 07:53:11 PM BRT
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mensagem",
    "statusRetorno"
})
@XmlRootElement(name = "atualizaListaPostosResponse")
public class AtualizaListaPostosResponseDto {

    protected String mensagem;
    protected String statusRetorno;

    /**
     * Obtém o valor da propriedade mensagem.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

    /**
     * Obtém o valor da propriedade statusRetorno.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusRetorno() {
        return statusRetorno;
    }

    /**
     * Define o valor da propriedade statusRetorno.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusRetorno(String value) {
        this.statusRetorno = value;
    }

}
