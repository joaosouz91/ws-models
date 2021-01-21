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
 * <p>Classe Java de StatusAgendamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StatusAgendamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpfCnpj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="complemento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoVistoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nrVoucher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nrLaudo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusAgendamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chassi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomeSegurado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zeroKm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anoModelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipoVeiculo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motivoVistoriaFrustrada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAgendamento", propOrder = {
    "cpfCnpj",
    "complemento",
    "uf",
    "tipoVistoria",
    "nrVoucher",
    "nrLaudo",
    "statusAgendamento",
    "data",
    "observacao",
    "numero",
    "bairro",
    "cidade",
    "cep",
    "chassi",
    "nomeSegurado",
    "zeroKm",
    "placa",
    "anoModelo",
    "tipoVeiculo",
    "periodo",
    "modelo",
    "endereco",
    "motivoVistoriaFrustrada"
})
public class StatusAgendamento {

    @XmlElement(required = true, nillable = true)
    protected String cpfCnpj;
    @XmlElement(required = true, nillable = true)
    protected String complemento;
    @XmlElement(required = true, nillable = true)
    protected String uf;
    @XmlElement(required = true, nillable = true)
    protected String tipoVistoria;
    @XmlElement(required = true, nillable = true)
    protected String nrVoucher;
    @XmlElement(required = true, nillable = true)
    protected String nrLaudo;
    @XmlElement(required = true, nillable = true)
    protected String statusAgendamento;
    @XmlElement(required = true, nillable = true)
    protected String data;
    @XmlElement(required = true, nillable = true)
    protected String observacao;
    @XmlElement(required = true, nillable = true)
    protected String numero;
    @XmlElement(required = true, nillable = true)
    protected String bairro;
    @XmlElement(required = true, nillable = true)
    protected String cidade;
    @XmlElement(required = true, nillable = true)
    protected String cep;
    @XmlElement(required = true, nillable = true)
    protected String chassi;
    @XmlElement(required = true, nillable = true)
    protected String nomeSegurado;
    @XmlElement(required = true, nillable = true)
    protected String zeroKm;
    @XmlElement(required = true, nillable = true)
    protected String placa;
    @XmlElement(required = true, nillable = true)
    protected String anoModelo;
    @XmlElement(required = true, nillable = true)
    protected String tipoVeiculo;
    @XmlElement(required = true, nillable = true)
    protected String periodo;
    @XmlElement(required = true, nillable = true)
    protected String modelo;
    @XmlElement(required = true, nillable = true)
    protected String endereco;
    @XmlElement(required = true, nillable = true)
    protected String motivoVistoriaFrustrada;

    /**
     * Obtém o valor da propriedade cpfCnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * Define o valor da propriedade cpfCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfCnpj(String value) {
        this.cpfCnpj = value;
    }

    /**
     * Obtém o valor da propriedade complemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define o valor da propriedade complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Obtém o valor da propriedade tipoVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVistoria() {
        return tipoVistoria;
    }

    /**
     * Define o valor da propriedade tipoVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVistoria(String value) {
        this.tipoVistoria = value;
    }

    /**
     * Obtém o valor da propriedade nrVoucher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrVoucher() {
        return nrVoucher;
    }

    /**
     * Define o valor da propriedade nrVoucher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrVoucher(String value) {
        this.nrVoucher = value;
    }

    /**
     * Obtém o valor da propriedade nrLaudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrLaudo() {
        return nrLaudo;
    }

    /**
     * Define o valor da propriedade nrLaudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrLaudo(String value) {
        this.nrLaudo = value;
    }

    /**
     * Obtém o valor da propriedade statusAgendamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusAgendamento() {
        return statusAgendamento;
    }

    /**
     * Define o valor da propriedade statusAgendamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusAgendamento(String value) {
        this.statusAgendamento = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade bairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o valor da propriedade bairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Obtém o valor da propriedade chassi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * Define o valor da propriedade chassi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassi(String value) {
        this.chassi = value;
    }

    /**
     * Obtém o valor da propriedade nomeSegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSegurado() {
        return nomeSegurado;
    }

    /**
     * Define o valor da propriedade nomeSegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSegurado(String value) {
        this.nomeSegurado = value;
    }

    /**
     * Obtém o valor da propriedade zeroKm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroKm() {
        return zeroKm;
    }

    /**
     * Define o valor da propriedade zeroKm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroKm(String value) {
        this.zeroKm = value;
    }

    /**
     * Obtém o valor da propriedade placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define o valor da propriedade placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obtém o valor da propriedade anoModelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoModelo() {
        return anoModelo;
    }

    /**
     * Define o valor da propriedade anoModelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoModelo(String value) {
        this.anoModelo = value;
    }

    /**
     * Obtém o valor da propriedade tipoVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    /**
     * Define o valor da propriedade tipoVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVeiculo(String value) {
        this.tipoVeiculo = value;
    }

    /**
     * Obtém o valor da propriedade periodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Define o valor da propriedade periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

    /**
     * Obtém o valor da propriedade modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o valor da propriedade modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade motivoVistoriaFrustrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoVistoriaFrustrada() {
        return motivoVistoriaFrustrada;
    }

    /**
     * Define o valor da propriedade motivoVistoriaFrustrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoVistoriaFrustrada(String value) {
        this.motivoVistoriaFrustrada = value;
    }

}
