//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.04.29 às 06:17:31 PM BRT 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.agendamento.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AgendamentoMobile complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AgendamentoMobile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosGerais" type="{http://www.tokiomarine.com.br}DadosGeraisMobile"/>
 *         &lt;element name="dadosCorretor" type="{http://www.tokiomarine.com.br}DadosCorretorMobile"/>
 *         &lt;element name="dadosVeiculo" type="{http://www.tokiomarine.com.br}DadosVeiculoMobile"/>
 *         &lt;element name="dadosSegurado" type="{http://www.tokiomarine.com.br}DadosSeguradoMobile"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgendamentoMobile", propOrder = {
    "dadosGerais",
    "dadosCorretor",
    "dadosVeiculo",
    "dadosSegurado"
})
public class AgendamentoMobile {

    @XmlElement(required = true, nillable = true)
    protected DadosGeraisMobile dadosGerais;
    @XmlElement(required = true, nillable = true)
    protected DadosCorretorMobile dadosCorretor;
    @XmlElement(required = true, nillable = true)
    protected DadosVeiculoMobile dadosVeiculo;
    @XmlElement(required = true, nillable = true)
    protected DadosSeguradoMobile dadosSegurado;

    /**
     * Obtém o valor da propriedade dadosGerais.
     * 
     * @return
     *     possible object is
     *     {@link DadosGeraisMobile }
     *     
     */
    public DadosGeraisMobile getDadosGerais() {
        return dadosGerais;
    }

    /**
     * Define o valor da propriedade dadosGerais.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosGeraisMobile }
     *     
     */
    public void setDadosGerais(DadosGeraisMobile value) {
        this.dadosGerais = value;
    }

    /**
     * Obtém o valor da propriedade dadosCorretor.
     * 
     * @return
     *     possible object is
     *     {@link DadosCorretorMobile }
     *     
     */
    public DadosCorretorMobile getDadosCorretor() {
        return dadosCorretor;
    }

    /**
     * Define o valor da propriedade dadosCorretor.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCorretorMobile }
     *     
     */
    public void setDadosCorretor(DadosCorretorMobile value) {
        this.dadosCorretor = value;
    }

    /**
     * Obtém o valor da propriedade dadosVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link DadosVeiculoMobile }
     *     
     */
    public DadosVeiculoMobile getDadosVeiculo() {
        return dadosVeiculo;
    }

    /**
     * Define o valor da propriedade dadosVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosVeiculoMobile }
     *     
     */
    public void setDadosVeiculo(DadosVeiculoMobile value) {
        this.dadosVeiculo = value;
    }

    /**
     * Obtém o valor da propriedade dadosSegurado.
     * 
     * @return
     *     possible object is
     *     {@link DadosSeguradoMobile }
     *     
     */
    public DadosSeguradoMobile getDadosSegurado() {
        return dadosSegurado;
    }

    /**
     * Define o valor da propriedade dadosSegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosSeguradoMobile }
     *     
     */
    public void setDadosSegurado(DadosSeguradoMobile value) {
        this.dadosSegurado = value;
    }

}
