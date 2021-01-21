package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;
import java.util.Date;

public class VeiculoLaudoVP implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String numeroCRLV;
    private String nomeCRLV;
    private String cidadeExpedicaoCRLV;
    private String ufExpedicaoCRLV;
    private Date dataExpedicaoCRLV;
	private String codigoRenavam;
    private String codigoChassi;
    private String origemChassi;
    private String numeroMotor;
    private Long cpfCRLV;
    private Long cnpjCRLV;
    private String placa;
    private String codigoCombustivel;
    private Long codigoVeiculo;
    private Long codigoFabricante;
    private String descricaoModelo;
    private Long anoFabricacao;
    private Long anoModelo;
    private Long lotacao;
    private Long quantidadePortas;
    private String cor;
    private String tipoPintura;
    private String nomeAlienacao;
    private String cambio;
    private Long tipoCambio;
    private Long quantidadeMarchas;
    private Long quantidadeCilindros;
    private Long kmRodado;
    private Long codigoUtilizacao;
    
    @Deprecated
    private Long localGuarda;
    
    
    private String indicadorVeiculoCarga;
    private String marcaCarroceria;
    private String numeroCarroceria;
    private Long formatoCarroceria;
    private Long codigoMaterialCarroceria;
    private String indicadorRodoar;
    private Long codigoTipoCabine;
    private Long tipoCarroceria;
    private String indicadorVeiculoTransformado;
    private AcessorioLaudoVP [] acessorios;
    private AvariaLaudoVP [] avarias;
	
    
    public VeiculoLaudoVP() {}


	public String getNumeroCRLV() {
		return numeroCRLV;
	}


	public void setNumeroCRLV(String numeroCRLV) {
		this.numeroCRLV = numeroCRLV;
	}


	public String getNomeCRLV() {
		return nomeCRLV;
	}


	public void setNomeCRLV(String nomeCRLV) {
		this.nomeCRLV = nomeCRLV;
	}


	public String getCidadeExpedicaoCRLV() {
		return cidadeExpedicaoCRLV;
	}


	public void setCidadeExpedicaoCRLV(String cidadeExpedicaoCRLV) {
		this.cidadeExpedicaoCRLV = cidadeExpedicaoCRLV;
	}


	public String getUfExpedicaoCRLV() {
		return ufExpedicaoCRLV;
	}


	public void setUfExpedicaoCRLV(String ufExpedicaoCRLV) {
		this.ufExpedicaoCRLV = ufExpedicaoCRLV;
	}


	public Date getDataExpedicaoCRLV() {
		return dataExpedicaoCRLV;
	}


	public void setDataExpedicaoCRLV(Date dataExpedicaoCRLV) {
		this.dataExpedicaoCRLV = dataExpedicaoCRLV;
	}


	public String getCodigoRenavam() {
		return codigoRenavam;
	}


	public void setCodigoRenavam(String codigoRenavam) {
		this.codigoRenavam = codigoRenavam;
	}


	public String getCodigoChassi() {
		return codigoChassi;
	}


	public void setCodigoChassi(String codigoChassi) {
		this.codigoChassi = codigoChassi;
	}


	public String getOrigemChassi() {
		return origemChassi;
	}


	public void setOrigemChassi(String origemChassi) {
		this.origemChassi = origemChassi;
	}


	public String getNumeroMotor() {
		return numeroMotor;
	}


	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}


	public Long getCpfCRLV() {
		return cpfCRLV;
	}


	public void setCpfCRLV(Long cpfCRLV) {
		this.cpfCRLV = cpfCRLV;
	}


	public Long getCnpjCRLV() {
		return cnpjCRLV;
	}


	public void setCnpjCRLV(Long cnpjCRLV) {
		this.cnpjCRLV = cnpjCRLV;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getCodigoCombustivel() {
		return codigoCombustivel;
	}


	public void setCodigoCombustivel(String codigoCombustivel) {
		this.codigoCombustivel = codigoCombustivel;
	}


	public Long getCodigoVeiculo() {
		return codigoVeiculo;
	}


	public void setCodigoVeiculo(Long codigoVeiculo) {
		this.codigoVeiculo = codigoVeiculo;
	}


	public Long getCodigoFabricante() {
		return codigoFabricante;
	}


	public void setCodigoFabricante(Long codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}


	public String getDescricaoModelo() {
		return descricaoModelo;
	}


	public void setDescricaoModelo(String descricaoModelo) {
		this.descricaoModelo = descricaoModelo;
	}


	public Long getAnoFabricacao() {
		return anoFabricacao;
	}


	public void setAnoFabricacao(Long anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	public Long getAnoModelo() {
		return anoModelo;
	}


	public void setAnoModelo(Long anoModelo) {
		this.anoModelo = anoModelo;
	}


	public Long getLotacao() {
		return lotacao;
	}


	public void setLotacao(Long lotacao) {
		this.lotacao = lotacao;
	}


	public Long getQuantidadePortas() {
		return quantidadePortas;
	}


	public void setQuantidadePortas(Long quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getTipoPintura() {
		return tipoPintura;
	}


	public void setTipoPintura(String tipoPintura) {
		this.tipoPintura = tipoPintura;
	}


	public String getNomeAlienacao() {
		return nomeAlienacao;
	}


	public void setNomeAlienacao(String nomeAlienacao) {
		this.nomeAlienacao = nomeAlienacao;
	}


	public String getCambio() {
		return cambio;
	}


	public void setCambio(String cambio) {
		this.cambio = cambio;
	}


	public Long getTipoCambio() {
		return tipoCambio;
	}


	public void setTipoCambio(Long tipoCambio) {
		this.tipoCambio = tipoCambio;
	}


	public Long getQuantidadeMarchas() {
		return quantidadeMarchas;
	}


	public void setQuantidadeMarchas(Long quantidadeMarchas) {
		this.quantidadeMarchas = quantidadeMarchas;
	}

	public Long getQuantidadeCilindros() {
		return quantidadeCilindros;
	}


	public void setQuantidadeCilindros(Long quantidadeCilindros) {
		this.quantidadeCilindros = quantidadeCilindros;
	}


	public Long getKmRodado() {
		return kmRodado;
	}


	public void setKmRodado(Long kmRodado) {
		this.kmRodado = kmRodado;
	}


	public Long getCodigoUtilizacao() {
		return codigoUtilizacao;
	}


	public void setCodigoUtilizacao(Long codigoUtilizacao) {
		this.codigoUtilizacao = codigoUtilizacao;
	}


	public Long getLocalGuarda() {
		return localGuarda;
	}


	public void setLocalGuarda(Long localGuarda) {
		this.localGuarda = localGuarda;
	}

	public String getIndicadorVeiculoCarga() {
		return indicadorVeiculoCarga;
	}


	public void setIndicadorVeiculoCarga(String indicadorVeiculoCarga) {
		this.indicadorVeiculoCarga = indicadorVeiculoCarga;
	}


	public String getMarcaCarroceria() {
		return marcaCarroceria;
	}


	public void setMarcaCarroceria(String marcaCarroceria) {
		this.marcaCarroceria = marcaCarroceria;
	}


	public String getNumeroCarroceria() {
		return numeroCarroceria;
	}


	public void setNumeroCarroceria(String numeroCarroceria) {
		this.numeroCarroceria = numeroCarroceria;
	}


	public Long getFormatoCarroceria() {
		return formatoCarroceria;
	}


	public void setFormatoCarroceria(Long formatoCarroceria) {
		this.formatoCarroceria = formatoCarroceria;
	}


	public Long getCodigoMaterialCarroceria() {
		return codigoMaterialCarroceria;
	}


	public void setCodigoMaterialCarroceria(Long codigoMaterialCarroceria) {
		this.codigoMaterialCarroceria = codigoMaterialCarroceria;
	}

	public String getIndicadorRodoar() {
		return indicadorRodoar;
	}


	public void setIndicadorRodoar(String indicadorRodoar) {
		this.indicadorRodoar = indicadorRodoar;
	}


	public Long getCodigoTipoCabine() {
		return codigoTipoCabine;
	}


	public void setCodigoTipoCabine(Long codigoTipoCabine) {
		this.codigoTipoCabine = codigoTipoCabine;
	}


	public Long getTipoCarroceria() {
		return tipoCarroceria;
	}


	public void setTipoCarroceria(Long tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}


	public String getIndicadorVeiculoTransformado() {
		return indicadorVeiculoTransformado;
	}


	public void setIndicadorVeiculoTransformado(String indicadorVeiculoTransformado) {
		this.indicadorVeiculoTransformado = indicadorVeiculoTransformado;
	}


	public AcessorioLaudoVP[] getAcessorios() {
		return acessorios;
	}


	public void setAcessorios(AcessorioLaudoVP[] acessorios) {
		this.acessorios = acessorios;
	}


	public AvariaLaudoVP[] getAvarias() {
		return avarias;
	}


	public void setAvarias(AvariaLaudoVP[] avarias) {
		this.avarias = avarias;
	}
}
