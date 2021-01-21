//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.29 �s 06:00:41 PM BRT 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java de ParametroStatusAgendamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ParametroStatusAgendamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusAgendamento" type="{http://www.tokiomarine.com.br}StatusAgendamento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codigoAgrupamentoPrestadora" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametroStatusAgendamento", propOrder = {
    "statusAgendamento",
    "codigoAgrupamentoPrestadora",
    "senha"
})
public class ParametroStatusAgendamento {

    @XmlElement(nillable = true)
    protected List<StatusAgendamento> statusAgendamento;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long codigoAgrupamentoPrestadora;
    @XmlElement(required = true, nillable = true)
    protected String senha;

    /**
     * Gets the value of the statusAgendamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusAgendamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusAgendamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusAgendamento }
     * 
     * 
     */
    public List<StatusAgendamento> getStatusAgendamento() {
        if (statusAgendamento == null) {
            statusAgendamento = new ArrayList<StatusAgendamento>();
        }
        return this.statusAgendamento;
    }

    /**
     * Obt�m o valor da propriedade codigoAgrupamentoPrestadora.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoAgrupamentoPrestadora() {
        return codigoAgrupamentoPrestadora;
    }

    /**
     * Define o valor da propriedade codigoAgrupamentoPrestadora.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoAgrupamentoPrestadora(Long value) {
        this.codigoAgrupamentoPrestadora = value;
    }

    /**
     * Obt�m o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

}
