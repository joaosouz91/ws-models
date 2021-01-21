//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.04.29 às 06:00:41 PM BRT 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Agendamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Agendamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosVeiculo" type="{http://www.tokiomarine.com.br}DadosVeiculo"/>
 *         &lt;element name="dadosCorretor" type="{http://www.tokiomarine.com.br}DadosCorretor"/>
 *         &lt;element name="dadosGerais" type="{http://www.tokiomarine.com.br}DadosGerais"/>
 *         &lt;element name="dadosSegurado" type="{http://www.tokiomarine.com.br}DadosSegurado"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agendamento", propOrder = {
    "dadosVeiculo",
    "dadosCorretor",
    "dadosGerais",
    "dadosSegurado"
})
public class Agendamento {

    @XmlElement(required = true, nillable = true)
    protected DadosVeiculo dadosVeiculo;
    @XmlElement(required = true, nillable = true)
    protected DadosCorretor dadosCorretor;
    @XmlElement(required = true, nillable = true)
    protected DadosGerais dadosGerais;
    @XmlElement(required = true, nillable = true)
    protected DadosSegurado dadosSegurado;

    /**
     * Obtém o valor da propriedade dadosVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link DadosVeiculo }
     *     
     */
    public DadosVeiculo getDadosVeiculo() {
        return dadosVeiculo;
    }

    /**
     * Define o valor da propriedade dadosVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosVeiculo }
     *     
     */
    public void setDadosVeiculo(DadosVeiculo value) {
        this.dadosVeiculo = value;
    }

    /**
     * Obtém o valor da propriedade dadosCorretor.
     * 
     * @return
     *     possible object is
     *     {@link DadosCorretor }
     *     
     */
    public DadosCorretor getDadosCorretor() {
        return dadosCorretor;
    }

    /**
     * Define o valor da propriedade dadosCorretor.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCorretor }
     *     
     */
    public void setDadosCorretor(DadosCorretor value) {
        this.dadosCorretor = value;
    }

    /**
     * Obtém o valor da propriedade dadosGerais.
     * 
     * @return
     *     possible object is
     *     {@link DadosGerais }
     *     
     */
    public DadosGerais getDadosGerais() {
        return dadosGerais;
    }

    /**
     * Define o valor da propriedade dadosGerais.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosGerais }
     *     
     */
    public void setDadosGerais(DadosGerais value) {
        this.dadosGerais = value;
    }

    /**
     * Obtém o valor da propriedade dadosSegurado.
     * 
     * @return
     *     possible object is
     *     {@link DadosSegurado }
     *     
     */
    public DadosSegurado getDadosSegurado() {
        return dadosSegurado;
    }

    /**
     * Define o valor da propriedade dadosSegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosSegurado }
     *     
     */
    public void setDadosSegurado(DadosSegurado value) {
        this.dadosSegurado = value;
    }

}
