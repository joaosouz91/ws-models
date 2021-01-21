//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.01.16 �s 03:44:08 PM BRST 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.dtos;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * <p>Classe Java de LaudoVP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LaudoVP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cepLocalVistoria" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cidadeDestinoVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidadeOrigemVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCompanhia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCorretorInterno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoPostoVistoria" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoSituacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoVistoriador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoVoucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigosInformacoesTecnicas" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="condutor" type="{http://www.tokiomarine.com.br}CondutorVeiculoLaudoVP" minOccurs="0"/>
 *         &lt;element name="dataCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataVistoria" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="horaVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorPostoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorVistoriaFrustrada" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="kmRealizacaoVistoria" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nomeSolicitanteVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroLaudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proponente" type="{http://www.tokiomarine.com.br}ProponenteLaudoVP" minOccurs="0"/>
 *         &lt;element name="proprietario" type="{http://www.tokiomarine.com.br}ProprietarioVeiculoLaudoVP" minOccurs="0"/>
 *         &lt;element name="statusVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ufRealizacaoVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="veiculo" type="{http://www.tokiomarine.com.br}VeiculoLaudoVP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaudoVP", propOrder = {
    "cepLocalVistoria",
    "cidadeDestinoVistoria",
    "cidadeOrigemVistoria",
    "codigoCompanhia",
    "codigoCorretorInterno",
    "codigoPostoVistoria",
    "codigoSituacao",
    "codigoVistoriador",
    "codigoVoucher",
    "codigosInformacoesTecnicas",
    "condutor",
    "dataCadastro",
    "dataVistoria",
    "horaVistoria",
    "indicadorPostoDomicilio",
    "indicadorVistoriaFrustrada",
    "kmRealizacaoVistoria",
    "nomeSolicitanteVistoria",
    "numeroLaudo",
    "observacao",
    "proponente",
    "proprietario",
    "statusVistoria",
    "ufRealizacaoVistoria",
    "validacao",
    "veiculo"
})
public class LaudoVP implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8564349700965278898L;
	protected Long cepLocalVistoria;
    protected String cidadeDestinoVistoria;
    protected String cidadeOrigemVistoria;
    protected String codigoCompanhia;
    protected Long codigoCorretorInterno;
    protected Long codigoPostoVistoria;
    protected Long codigoSituacao;
    protected String codigoVistoriador;
    protected String codigoVoucher;
    @XmlElement(nillable = true)
    protected List<Long> codigosInformacoesTecnicas;
    protected CondutorVeiculoLaudoVP condutor;
    @XmlSchemaType(name = "dateTime")
    protected Date dataCadastro;
    @XmlSchemaType(name = "dateTime")
    protected Date dataVistoria;
    protected String horaVistoria;
    protected String indicadorPostoDomicilio;
    protected Long indicadorVistoriaFrustrada;
    protected Long kmRealizacaoVistoria;
    protected String nomeSolicitanteVistoria;
    protected String numeroLaudo;
    protected String observacao;
    protected ProponenteLaudoVP proponente;
    protected ProprietarioVeiculoLaudoVP proprietario;
    protected String statusVistoria;
    protected String ufRealizacaoVistoria;
    protected String validacao;
    protected VeiculoLaudoVP veiculo;

    /**
     * Obt�m o valor da propriedade cepLocalVistoria.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCepLocalVistoria() {
        return cepLocalVistoria;
    }

    /**
     * Define o valor da propriedade cepLocalVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCepLocalVistoria(Long value) {
        this.cepLocalVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade cidadeDestinoVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeDestinoVistoria() {
        return cidadeDestinoVistoria;
    }

    /**
     * Define o valor da propriedade cidadeDestinoVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeDestinoVistoria(String value) {
        this.cidadeDestinoVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade cidadeOrigemVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeOrigemVistoria() {
        return cidadeOrigemVistoria;
    }

    /**
     * Define o valor da propriedade cidadeOrigemVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeOrigemVistoria(String value) {
        this.cidadeOrigemVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade codigoCompanhia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCompanhia() {
        return codigoCompanhia;
    }

    /**
     * Define o valor da propriedade codigoCompanhia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCompanhia(String value) {
        this.codigoCompanhia = value;
    }

    /**
     * Obt�m o valor da propriedade codigoCorretorInterno.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoCorretorInterno() {
        return codigoCorretorInterno;
    }

    /**
     * Define o valor da propriedade codigoCorretorInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoCorretorInterno(Long value) {
        this.codigoCorretorInterno = value;
    }

    /**
     * Obt�m o valor da propriedade codigoPostoVistoria.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoPostoVistoria() {
        return codigoPostoVistoria;
    }

    /**
     * Define o valor da propriedade codigoPostoVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoPostoVistoria(Long value) {
        this.codigoPostoVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade codigoSituacao.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoSituacao() {
        return codigoSituacao;
    }

    /**
     * Define o valor da propriedade codigoSituacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoSituacao(Long value) {
        this.codigoSituacao = value;
    }

    /**
     * Obt�m o valor da propriedade codigoVistoriador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVistoriador() {
        return codigoVistoriador;
    }

    /**
     * Define o valor da propriedade codigoVistoriador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVistoriador(String value) {
        this.codigoVistoriador = value;
    }

    /**
     * Obt�m o valor da propriedade codigoVoucher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVoucher() {
        return codigoVoucher;
    }

    /**
     * Define o valor da propriedade codigoVoucher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVoucher(String value) {
        this.codigoVoucher = value;
    }

    /**
     * Gets the value of the codigosInformacoesTecnicas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codigosInformacoesTecnicas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodigosInformacoesTecnicas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCodigosInformacoesTecnicas() {
        if (codigosInformacoesTecnicas == null) {
            codigosInformacoesTecnicas = new ArrayList<Long>();
        }
        return this.codigosInformacoesTecnicas;
    }

    /**
     * Obt�m o valor da propriedade condutor.
     * 
     * @return
     *     possible object is
     *     {@link CondutorVeiculoLaudoVP }
     *     
     */
    public CondutorVeiculoLaudoVP getCondutor() {
        return condutor;
    }

    /**
     * Define o valor da propriedade condutor.
     * 
     * @param value
     *     allowed object is
     *     {@link CondutorVeiculoLaudoVP }
     *     
     */
    public void setCondutor(CondutorVeiculoLaudoVP value) {
        this.condutor = value;
    }

    /**
     * Obt�m o valor da propriedade dataCadastro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDataCadastro() {
        return dataCadastro;
    }

    /**
     * Define o valor da propriedade dataCadastro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCadastro(Date value) {
        this.dataCadastro = value;
    }

    /**
     * Obt�m o valor da propriedade dataVistoria.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDataVistoria() {
        return dataVistoria;
    }

    /**
     * Define o valor da propriedade dataVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVistoria(Date value) {
        this.dataVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade horaVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraVistoria() {
        return horaVistoria;
    }

    /**
     * Define o valor da propriedade horaVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraVistoria(String value) {
        this.horaVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade indicadorPostoDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorPostoDomicilio() {
        return indicadorPostoDomicilio;
    }

    /**
     * Define o valor da propriedade indicadorPostoDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorPostoDomicilio(String value) {
        this.indicadorPostoDomicilio = value;
    }

    /**
     * Obt�m o valor da propriedade indicadorVistoriaFrustrada.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIndicadorVistoriaFrustrada() {
        return indicadorVistoriaFrustrada;
    }

    /**
     * Define o valor da propriedade indicadorVistoriaFrustrada.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIndicadorVistoriaFrustrada(Long value) {
        this.indicadorVistoriaFrustrada = value;
    }

    /**
     * Obt�m o valor da propriedade kmRealizacaoVistoria.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKmRealizacaoVistoria() {
        return kmRealizacaoVistoria;
    }

    /**
     * Define o valor da propriedade kmRealizacaoVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKmRealizacaoVistoria(Long value) {
        this.kmRealizacaoVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade nomeSolicitanteVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSolicitanteVistoria() {
        return nomeSolicitanteVistoria;
    }

    /**
     * Define o valor da propriedade nomeSolicitanteVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSolicitanteVistoria(String value) {
        this.nomeSolicitanteVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade numeroLaudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLaudo() {
        return numeroLaudo;
    }

    /**
     * Define o valor da propriedade numeroLaudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLaudo(String value) {
        this.numeroLaudo = value;
    }

    /**
     * Obt�m o valor da propriedade observacao.
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
     * Obt�m o valor da propriedade proponente.
     * 
     * @return
     *     possible object is
     *     {@link ProponenteLaudoVP }
     *     
     */
    public ProponenteLaudoVP getProponente() {
        return proponente;
    }

    /**
     * Define o valor da propriedade proponente.
     * 
     * @param value
     *     allowed object is
     *     {@link ProponenteLaudoVP }
     *     
     */
    public void setProponente(ProponenteLaudoVP value) {
        this.proponente = value;
    }

    /**
     * Obt�m o valor da propriedade proprietario.
     * 
     * @return
     *     possible object is
     *     {@link ProprietarioVeiculoLaudoVP }
     *     
     */
    public ProprietarioVeiculoLaudoVP getProprietario() {
        return proprietario;
    }

    /**
     * Define o valor da propriedade proprietario.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietarioVeiculoLaudoVP }
     *     
     */
    public void setProprietario(ProprietarioVeiculoLaudoVP value) {
        this.proprietario = value;
    }

    /**
     * Obt�m o valor da propriedade statusVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusVistoria() {
        return statusVistoria;
    }

    /**
     * Define o valor da propriedade statusVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusVistoria(String value) {
        this.statusVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade ufRealizacaoVistoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfRealizacaoVistoria() {
        return ufRealizacaoVistoria;
    }

    /**
     * Define o valor da propriedade ufRealizacaoVistoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfRealizacaoVistoria(String value) {
        this.ufRealizacaoVistoria = value;
    }

    /**
     * Obt�m o valor da propriedade validacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidacao() {
        return validacao;
    }

    /**
     * Define o valor da propriedade validacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidacao(String value) {
        this.validacao = value;
    }

    /**
     * Obt�m o valor da propriedade veiculo.
     * 
     * @return
     *     possible object is
     *     {@link VeiculoLaudoVP }
     *     
     */
    public VeiculoLaudoVP getVeiculo() {
        return veiculo;
    }

    /**
     * Define o valor da propriedade veiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link VeiculoLaudoVP }
     *     
     */
    public void setVeiculo(VeiculoLaudoVP value) {
        this.veiculo = value;
    }

}
