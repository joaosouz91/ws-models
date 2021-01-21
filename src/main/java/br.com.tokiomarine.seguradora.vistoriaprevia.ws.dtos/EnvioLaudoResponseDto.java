//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem.
// Gerado em: 2018.08.15 às 07:53:11 PM BRT
//


package br.com.tokiomarine.seguradora.vistoriaprevia.ws.dtos;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

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
 *         &lt;element name="erroRetornoEnvioLaudo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="errosVP" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="anoFabricacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="chassi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="codigoAgrupamentoEmpresaVistoriadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="codigoErro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="codigoFabricante" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="codigoVeiculo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                             &lt;element name="dataRealizacaoVistoria" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="dataTransmissaoVistoria" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="descricaoModelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="descricaoMotivoErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="detalheErro1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="detalheErro2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="indicadorAceiteVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="statusVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="tipoCombustivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="indicadorAceiteVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numeroLaudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "erroRetornoEnvioLaudo",
    "mensagem",
    "statusRetorno"
})
@XmlRootElement(name = "envioLaudoResponse")
public class EnvioLaudoResponseDto implements Serializable {

	private static final long serialVersionUID = 6599988598971696570L;

	@XmlElement(required = true)
    protected ErroRetornoEnvioLaudo[] erroRetornoEnvioLaudo;
    protected String mensagem;
    protected String statusRetorno;

    /**
     * Obtém o valor da propriedade erroRetornoEnvioLaudo.
     *
     * @return
     *     possible object is
     *     {@link ErroRetornoEnvioLaudo }
     *
     */
    public ErroRetornoEnvioLaudo[] getErroRetornoEnvioLaudo() {
        return erroRetornoEnvioLaudo;
    }

    /**
     * Define o valor da propriedade erroRetornoEnvioLaudo.
     *
     * @param value
     *     allowed object is
     *     {@link ErroRetornoEnvioLaudo }
     *
     */
    public void setErroRetornoEnvioLaudo(ErroRetornoEnvioLaudo[] value) {
        this.erroRetornoEnvioLaudo = value;
    }

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
     *         &lt;element name="errosVP" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="anoFabricacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="chassi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="codigoAgrupamentoEmpresaVistoriadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="codigoErro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="codigoFabricante" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="codigoVeiculo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                   &lt;element name="dataRealizacaoVistoria" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="dataTransmissaoVistoria" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="descricaoModelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="descricaoMotivoErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="detalheErro1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="detalheErro2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="indicadorAceiteVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="statusVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="tipoCombustivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="indicadorAceiteVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numeroLaudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "ErroRetornoEnvioLaudo", propOrder = {
        "erros",
        "indicadorAceiteVistoria",
        "numeroLaudo"
    })
    public static class ErroRetornoEnvioLaudo implements Serializable {

		private static final long serialVersionUID = -5811719521862778995L;

		@XmlElement(required = true)
        protected ErrosVP[] erros;
        protected String indicadorAceiteVistoria;
        protected String numeroLaudo;

        /**
         * Obtém o valor da propriedade errosVP.
         *
         * @return
         *     possible object is
         *     {@link ErrosVP }
         *
         */
        public ErrosVP[] getErrosVP() {
            return erros;
        }

        /**
         * Define o valor da propriedade errosVP.
         *
         * @param value
         *     allowed object is
         *     {@link ErrosVP }
         *
         */
        public void setErrosVP(ErrosVP[] value) {
            this.erros = value;
        }

        /**
         * Obtém o valor da propriedade indicadorAceiteVistoria.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getIndicadorAceiteVistoria() {
            return indicadorAceiteVistoria;
        }

        /**
         * Define o valor da propriedade indicadorAceiteVistoria.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIndicadorAceiteVistoria(String value) {
            this.indicadorAceiteVistoria = value;
        }

        /**
         * Obtém o valor da propriedade numeroLaudo.
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
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="anoFabricacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="chassi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="codigoAgrupamentoEmpresaVistoriadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="codigoErro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="codigoFabricante" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="codigoVeiculo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *         &lt;element name="dataRealizacaoVistoria" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="dataTransmissaoVistoria" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="descricaoModelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="descricaoMotivoErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="detalheErro1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="detalheErro2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="indicadorAceiteVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="statusVistoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="tipoCombustivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "ErrosVP", propOrder = {
            "anoFabricacao",
            "chassi",
            "codigoAgrupamentoEmpresaVistoriadora",
            "codigoErro",
            "codigoFabricante",
            "codigoVeiculo",
            "dataRealizacaoVistoria",
            "dataTransmissaoVistoria",
            "descricaoModelo",
            "descricaoMotivoErro",
            "detalheErro1",
            "detalheErro2",
            "indicadorAceiteVistoria",
            "placa",
            "statusVistoria",
            "tipoCombustivel"
        })
        public static class ErrosVP implements Serializable {

			private static final long serialVersionUID = -1755699881020213570L;

			protected Long anoFabricacao;
            protected String chassi;
            protected String codigoAgrupamentoEmpresaVistoriadora;
            protected Long codigoErro;
            protected Long codigoFabricante;
            protected Long codigoVeiculo;
            protected Date dataRealizacaoVistoria;
            protected Date dataTransmissaoVistoria;
            protected String descricaoModelo;
            protected String descricaoMotivoErro;
            protected String detalheErro1;
            protected String detalheErro2;
            protected String indicadorAceiteVistoria;
            protected String placa;
            protected String statusVistoria;
            protected String tipoCombustivel;

            /**
             * Obtém o valor da propriedade anoFabricacao.
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
             * Obtém o valor da propriedade codigoAgrupamentoEmpresaVistoriadora.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCodigoAgrupamentoEmpresaVistoriadora() {
                return codigoAgrupamentoEmpresaVistoriadora;
            }

            /**
             * Define o valor da propriedade codigoAgrupamentoEmpresaVistoriadora.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCodigoAgrupamentoEmpresaVistoriadora(String value) {
                this.codigoAgrupamentoEmpresaVistoriadora = value;
            }

            /**
             * Obtém o valor da propriedade codigoErro.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getCodigoErro() {
                return codigoErro;
            }

            /**
             * Define o valor da propriedade codigoErro.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setCodigoErro(Long value) {
                this.codigoErro = value;
            }

            /**
             * Obtém o valor da propriedade codigoFabricante.
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
             * Obtém o valor da propriedade codigoVeiculo.
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
             * Obtém o valor da propriedade dataRealizacaoVistoria.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public Date getDataRealizacaoVistoria() {
                return dataRealizacaoVistoria;
            }

            /**
             * Define o valor da propriedade dataRealizacaoVistoria.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setDataRealizacaoVistoria(Date value) {
                this.dataRealizacaoVistoria = value;
            }

            /**
             * Obtém o valor da propriedade dataTransmissaoVistoria.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public Date getDataTransmissaoVistoria() {
                return dataTransmissaoVistoria;
            }

            /**
             * Define o valor da propriedade dataTransmissaoVistoria.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setDataTransmissaoVistoria(Date value) {
                this.dataTransmissaoVistoria = value;
            }

            /**
             * Obtém o valor da propriedade descricaoModelo.
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
             * Obtém o valor da propriedade descricaoMotivoErro.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDescricaoMotivoErro() {
                return descricaoMotivoErro;
            }

            /**
             * Define o valor da propriedade descricaoMotivoErro.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDescricaoMotivoErro(String value) {
                this.descricaoMotivoErro = value;
            }

            /**
             * Obtém o valor da propriedade detalheErro1.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDetalheErro1() {
                return detalheErro1;
            }

            /**
             * Define o valor da propriedade detalheErro1.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDetalheErro1(String value) {
                this.detalheErro1 = value;
            }

            /**
             * Obtém o valor da propriedade detalheErro2.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDetalheErro2() {
                return detalheErro2;
            }

            /**
             * Define o valor da propriedade detalheErro2.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDetalheErro2(String value) {
                this.detalheErro2 = value;
            }

            /**
             * Obtém o valor da propriedade indicadorAceiteVistoria.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIndicadorAceiteVistoria() {
                return indicadorAceiteVistoria;
            }

            /**
             * Define o valor da propriedade indicadorAceiteVistoria.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIndicadorAceiteVistoria(String value) {
                this.indicadorAceiteVistoria = value;
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
             * Obtém o valor da propriedade statusVistoria.
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
             * Obtém o valor da propriedade tipoCombustivel.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTipoCombustivel() {
                return tipoCombustivel;
            }

            /**
             * Define o valor da propriedade tipoCombustivel.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTipoCombustivel(String value) {
                this.tipoCombustivel = value;
            }

			@Override
			public String toString() {
				return "ErrosVP [anoFabricacao=" + anoFabricacao + ", chassi=" + chassi
						+ ", codigoAgrupamentoEmpresaVistoriadora=" + codigoAgrupamentoEmpresaVistoriadora
						+ ", codigoErro=" + codigoErro + ", codigoFabricante=" + codigoFabricante + ", codigoVeiculo="
						+ codigoVeiculo + ", dataRealizacaoVistoria=" + dataRealizacaoVistoria
						+ ", dataTransmissaoVistoria=" + dataTransmissaoVistoria + ", descricaoModelo="
						+ descricaoModelo + ", descricaoMotivoErro=" + descricaoMotivoErro + ", detalheErro1="
						+ detalheErro1 + ", detalheErro2=" + detalheErro2 + ", indicadorAceiteVistoria="
						+ indicadorAceiteVistoria + ", placa=" + placa + ", statusVistoria=" + statusVistoria
						+ ", tipoCombustivel=" + tipoCombustivel + "]";
			}
        }

    }

}
