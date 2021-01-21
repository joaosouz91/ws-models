//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.01.16 �s 03:44:08 PM BRST 
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.dtos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * <p>Classe Java de VeiculoLaudoVP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VeiculoLaudoVP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acessorios" type="{http://www.tokiomarine.com.br}AcessoriosLaudoVP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="anoFabricacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="anoModelo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="avarias" type="{http://www.tokiomarine.com.br}AvariasLaudoVP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cambio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidadeExpedicaoCRLV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cnpjCRLV" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoChassi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCombustivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoFabricante" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoMaterialCarroceria" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoRenavam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTipoCabine" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoUtilizacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codigoVeiculo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpfCRLV" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dataExpedicaoCRLV" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="descricaoModelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formatoCarroceria" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="indicadorRodoar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorVeiculoCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicadorVeiculoTransformado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kmRodado" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="localGuarda" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lotacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="marcaCarroceria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeAlienacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCRLV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCRLV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCarroceria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroMotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origemChassi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantidadeCilindros" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quantidadeMarchas" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quantidadePortas" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoCambio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoCarroceria" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoPintura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ufExpedicaoCRLV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeiculoLaudoVP", propOrder = {
    "acessorios",
    "anoFabricacao",
    "anoModelo",
    "avarias",
    "cambio",
    "cidadeExpedicaoCRLV",
    "cnpjCRLV",
    "codigoChassi",
    "codigoCombustivel",
    "codigoFabricante",
    "codigoMaterialCarroceria",
    "codigoRenavam",
    "codigoTipoCabine",
    "codigoUtilizacao",
    "codigoVeiculo",
    "cor",
    "cpfCRLV",
    "dataExpedicaoCRLV",
    "descricaoModelo",
    "formatoCarroceria",
    "indicadorRodoar",
    "indicadorVeiculoCarga",
    "indicadorVeiculoTransformado",
    "kmRodado",
    "localGuarda",
    "lotacao",
    "marcaCarroceria",
    "nomeAlienacao",
    "nomeCRLV",
    "numeroCRLV",
    "numeroCarroceria",
    "numeroMotor",
    "origemChassi",
    "placa",
    "quantidadeCilindros",
    "quantidadeMarchas",
    "quantidadePortas",
    "tipoCambio",
    "tipoCarroceria",
    "tipoPintura",
    "ufExpedicaoCRLV"
})
public class VeiculoLaudoVP implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8029367076578905366L;
	protected List<AcessoriosLaudoVP> acessorios;
    protected Long anoFabricacao;
    protected Long anoModelo;
    protected List<AvariasLaudoVP> avarias;
    protected String cambio;
    protected String cidadeExpedicaoCRLV;
    protected Long cnpjCRLV;
    protected String codigoChassi;
    protected String codigoCombustivel;
    protected Long codigoFabricante;
    protected Long codigoMaterialCarroceria;
    protected String codigoRenavam;
    protected Long codigoTipoCabine;
    protected Long codigoUtilizacao;
    protected Long codigoVeiculo;
    protected String cor;
    protected Long cpfCRLV;
    @XmlSchemaType(name = "dateTime")
    protected Date dataExpedicaoCRLV;
    protected String descricaoModelo;
    protected Long formatoCarroceria;
    protected String indicadorRodoar;
    protected String indicadorVeiculoCarga;
    protected String indicadorVeiculoTransformado;
    protected Long kmRodado;
    protected Long localGuarda;
    protected Long lotacao;
    protected String marcaCarroceria;
    protected String nomeAlienacao;
    protected String nomeCRLV;
    protected String numeroCRLV;
    protected String numeroCarroceria;
    protected String numeroMotor;
    protected String origemChassi;
    protected String placa;
    protected Long quantidadeCilindros;
    protected Long quantidadeMarchas;
    protected Long quantidadePortas;
    protected Long tipoCambio;
    protected Long tipoCarroceria;
    protected String tipoPintura;
    protected String ufExpedicaoCRLV;

    /**
     * Gets the value of the acessorios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acessorios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcessorios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcessoriosLaudoVP }
     * 
     * 
     */
    public List<AcessoriosLaudoVP> getAcessorios() {
        if (acessorios == null) {
            acessorios = new ArrayList<AcessoriosLaudoVP>();
        }
        return this.acessorios;
    }

    /**
     * Obt�m o valor da propriedade anoFabricacao.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnoFabricacao() {
        return anoFabricacao;
    }

    /**
     * Define o valor da propriedade anoFabricacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnoFabricacao(Long value) {
        this.anoFabricacao = value;
    }

    /**
     * Obt�m o valor da propriedade anoModelo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnoModelo() {
        return anoModelo;
    }

    /**
     * Define o valor da propriedade anoModelo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnoModelo(Long value) {
        this.anoModelo = value;
    }

    /**
     * Gets the value of the avarias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avarias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvarias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvariasLaudoVP }
     * 
     * 
     */
    public List<AvariasLaudoVP> getAvarias() {
        if (avarias == null) {
            avarias = new ArrayList<AvariasLaudoVP>();
        }
        return this.avarias;
    }

    /**
     * Obt�m o valor da propriedade cambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCambio() {
        return cambio;
    }

    /**
     * Define o valor da propriedade cambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCambio(String value) {
        this.cambio = value;
    }

    /**
     * Obt�m o valor da propriedade cidadeExpedicaoCRLV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeExpedicaoCRLV() {
        return cidadeExpedicaoCRLV;
    }

    /**
     * Define o valor da propriedade cidadeExpedicaoCRLV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeExpedicaoCRLV(String value) {
        this.cidadeExpedicaoCRLV = value;
    }

    /**
     * Obt�m o valor da propriedade cnpjCRLV.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCnpjCRLV() {
        return cnpjCRLV;
    }

    /**
     * Define o valor da propriedade cnpjCRLV.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCnpjCRLV(Long value) {
        this.cnpjCRLV = value;
    }

    /**
     * Obt�m o valor da propriedade codigoChassi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoChassi() {
        return codigoChassi;
    }

    /**
     * Define o valor da propriedade codigoChassi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoChassi(String value) {
        this.codigoChassi = value;
    }

    /**
     * Obt�m o valor da propriedade codigoCombustivel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCombustivel() {
        return codigoCombustivel;
    }

    /**
     * Define o valor da propriedade codigoCombustivel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCombustivel(String value) {
        this.codigoCombustivel = value;
    }

    /**
     * Obt�m o valor da propriedade codigoFabricante.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoFabricante() {
        return codigoFabricante;
    }

    /**
     * Define o valor da propriedade codigoFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoFabricante(Long value) {
        this.codigoFabricante = value;
    }

    /**
     * Obt�m o valor da propriedade codigoMaterialCarroceria.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoMaterialCarroceria() {
        return codigoMaterialCarroceria;
    }

    /**
     * Define o valor da propriedade codigoMaterialCarroceria.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoMaterialCarroceria(Long value) {
        this.codigoMaterialCarroceria = value;
    }

    /**
     * Obt�m o valor da propriedade codigoRenavam.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    /**
     * Define o valor da propriedade codigoRenavam.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRenavam(String value) {
        this.codigoRenavam = value;
    }

    /**
     * Obt�m o valor da propriedade codigoTipoCabine.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoTipoCabine() {
        return codigoTipoCabine;
    }

    /**
     * Define o valor da propriedade codigoTipoCabine.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoTipoCabine(Long value) {
        this.codigoTipoCabine = value;
    }

    /**
     * Obt�m o valor da propriedade codigoUtilizacao.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoUtilizacao() {
        return codigoUtilizacao;
    }

    /**
     * Define o valor da propriedade codigoUtilizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoUtilizacao(Long value) {
        this.codigoUtilizacao = value;
    }

    /**
     * Obt�m o valor da propriedade codigoVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoVeiculo() {
        return codigoVeiculo;
    }

    /**
     * Define o valor da propriedade codigoVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoVeiculo(Long value) {
        this.codigoVeiculo = value;
    }

    /**
     * Obt�m o valor da propriedade cor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCor() {
        return cor;
    }

    /**
     * Define o valor da propriedade cor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCor(String value) {
        this.cor = value;
    }

    /**
     * Obt�m o valor da propriedade cpfCRLV.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCpfCRLV() {
        return cpfCRLV;
    }

    /**
     * Define o valor da propriedade cpfCRLV.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCpfCRLV(Long value) {
        this.cpfCRLV = value;
    }

    /**
     * Obt�m o valor da propriedade dataExpedicaoCRLV.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDataExpedicaoCRLV() {
        return dataExpedicaoCRLV;
    }

    /**
     * Define o valor da propriedade dataExpedicaoCRLV.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataExpedicaoCRLV(Date value) {
        this.dataExpedicaoCRLV = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoModelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoModelo() {
        return descricaoModelo;
    }

    /**
     * Define o valor da propriedade descricaoModelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoModelo(String value) {
        this.descricaoModelo = value;
    }

    /**
     * Obt�m o valor da propriedade formatoCarroceria.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFormatoCarroceria() {
        return formatoCarroceria;
    }

    /**
     * Define o valor da propriedade formatoCarroceria.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFormatoCarroceria(Long value) {
        this.formatoCarroceria = value;
    }

    /**
     * Obt�m o valor da propriedade indicadorRodoar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorRodoar() {
        return indicadorRodoar;
    }

    /**
     * Define o valor da propriedade indicadorRodoar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorRodoar(String value) {
        this.indicadorRodoar = value;
    }

    /**
     * Obt�m o valor da propriedade indicadorVeiculoCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorVeiculoCarga() {
        return indicadorVeiculoCarga;
    }

    /**
     * Define o valor da propriedade indicadorVeiculoCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorVeiculoCarga(String value) {
        this.indicadorVeiculoCarga = value;
    }

    /**
     * Obt�m o valor da propriedade indicadorVeiculoTransformado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorVeiculoTransformado() {
        return indicadorVeiculoTransformado;
    }

    /**
     * Define o valor da propriedade indicadorVeiculoTransformado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorVeiculoTransformado(String value) {
        this.indicadorVeiculoTransformado = value;
    }

    /**
     * Obt�m o valor da propriedade kmRodado.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKmRodado() {
        return kmRodado;
    }

    /**
     * Define o valor da propriedade kmRodado.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKmRodado(Long value) {
        this.kmRodado = value;
    }

    /**
     * Obt�m o valor da propriedade localGuarda.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocalGuarda() {
        return localGuarda;
    }

    /**
     * Define o valor da propriedade localGuarda.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocalGuarda(Long value) {
        this.localGuarda = value;
    }

    /**
     * Obt�m o valor da propriedade lotacao.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLotacao() {
        return lotacao;
    }

    /**
     * Define o valor da propriedade lotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLotacao(Long value) {
        this.lotacao = value;
    }

    /**
     * Obt�m o valor da propriedade marcaCarroceria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarcaCarroceria() {
        return marcaCarroceria;
    }

    /**
     * Define o valor da propriedade marcaCarroceria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarcaCarroceria(String value) {
        this.marcaCarroceria = value;
    }

    /**
     * Obt�m o valor da propriedade nomeAlienacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAlienacao() {
        return nomeAlienacao;
    }

    /**
     * Define o valor da propriedade nomeAlienacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAlienacao(String value) {
        this.nomeAlienacao = value;
    }

    /**
     * Obt�m o valor da propriedade nomeCRLV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCRLV() {
        return nomeCRLV;
    }

    /**
     * Define o valor da propriedade nomeCRLV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCRLV(String value) {
        this.nomeCRLV = value;
    }

    /**
     * Obt�m o valor da propriedade numeroCRLV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCRLV() {
        return numeroCRLV;
    }

    /**
     * Define o valor da propriedade numeroCRLV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCRLV(String value) {
        this.numeroCRLV = value;
    }

    /**
     * Obt�m o valor da propriedade numeroCarroceria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCarroceria() {
        return numeroCarroceria;
    }

    /**
     * Define o valor da propriedade numeroCarroceria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCarroceria(String value) {
        this.numeroCarroceria = value;
    }

    /**
     * Obt�m o valor da propriedade numeroMotor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMotor() {
        return numeroMotor;
    }

    /**
     * Define o valor da propriedade numeroMotor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMotor(String value) {
        this.numeroMotor = value;
    }

    /**
     * Obt�m o valor da propriedade origemChassi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigemChassi() {
        return origemChassi;
    }

    /**
     * Define o valor da propriedade origemChassi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigemChassi(String value) {
        this.origemChassi = value;
    }

    /**
     * Obt�m o valor da propriedade placa.
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
     * Obt�m o valor da propriedade quantidadeCilindros.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantidadeCilindros() {
        return quantidadeCilindros;
    }

    /**
     * Define o valor da propriedade quantidadeCilindros.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantidadeCilindros(Long value) {
        this.quantidadeCilindros = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeMarchas.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantidadeMarchas() {
        return quantidadeMarchas;
    }

    /**
     * Define o valor da propriedade quantidadeMarchas.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantidadeMarchas(Long value) {
        this.quantidadeMarchas = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadePortas.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantidadePortas() {
        return quantidadePortas;
    }

    /**
     * Define o valor da propriedade quantidadePortas.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantidadePortas(Long value) {
        this.quantidadePortas = value;
    }

    /**
     * Obt�m o valor da propriedade tipoCambio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define o valor da propriedade tipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTipoCambio(Long value) {
        this.tipoCambio = value;
    }

    /**
     * Obt�m o valor da propriedade tipoCarroceria.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTipoCarroceria() {
        return tipoCarroceria;
    }

    /**
     * Define o valor da propriedade tipoCarroceria.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTipoCarroceria(Long value) {
        this.tipoCarroceria = value;
    }

    /**
     * Obt�m o valor da propriedade tipoPintura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPintura() {
        return tipoPintura;
    }

    /**
     * Define o valor da propriedade tipoPintura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPintura(String value) {
        this.tipoPintura = value;
    }

    /**
     * Obt�m o valor da propriedade ufExpedicaoCRLV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfExpedicaoCRLV() {
        return ufExpedicaoCRLV;
    }

    /**
     * Define o valor da propriedade ufExpedicaoCRLV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfExpedicaoCRLV(String value) {
        this.ufExpedicaoCRLV = value;
    }

}
