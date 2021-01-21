package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;
import java.util.Date;

public class LaudoVP implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String numeroLaudo;
    private Long codigoSituacao;
    private Long indicadorVistoriaFrustrada;
    private String nomeSolicitanteVistoria;
    private String codigoCompanhia;
    private Date dataVistoria;
    private String horaVistoria;
    private ProponenteLaudoVP proponente;
    private VeiculoLaudoVP veiculo;
    private String codigoVistoriador;
    private String indicadorPostoDomicilio;
    private Long codigoPostoVistoria;
    private Date dataCadastro;
    private String observacao;
    private ProprietarioVeiculoLaudoVP proprietario;
    private CondutorVeiculoLaudoVP condutor;
    private Long [] codigosInformacoesTecnicas;
    private String statusVistoria;
    
    @Deprecated
    private Long cepLocalVistoria;
    
    private Long kmRealizacaoVistoria;
    private String cidadeOrigemVistoria;
    private String cidadeDestinoVistoria;
    private Long codigoCorretorInterno;
    private String codigoVoucher;
    private String ufRealizacaoVistoria;
    
    @Deprecated
    private String validacao;
	
    
    public LaudoVP() {}


	public String getNumeroLaudo() {
		return numeroLaudo;
	}


	public void setNumeroLaudo(String numeroLaudo) {
		this.numeroLaudo = numeroLaudo;
	}


	public Long getCodigoSituacao() {
		return codigoSituacao;
	}


	public void setCodigoSituacao(Long codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}


	public Long getIndicadorVistoriaFrustrada() {
		return indicadorVistoriaFrustrada;
	}


	public void setIndicadorVistoriaFrustrada(Long indicadorVistoriaFrustrada) {
		this.indicadorVistoriaFrustrada = indicadorVistoriaFrustrada;
	}


	public String getNomeSolicitanteVistoria() {
		return nomeSolicitanteVistoria;
	}


	public void setNomeSolicitanteVistoria(String nomeSolicitanteVistoria) {
		this.nomeSolicitanteVistoria = nomeSolicitanteVistoria;
	}

	
	public String getCodigoCompanhia() {
		return codigoCompanhia;
	}


	public void setCodigoCompanhia(String codigoCompanhia) {
		this.codigoCompanhia = codigoCompanhia;
	}


	public Date getDataVistoria() {
		return dataVistoria;
	}


	public void setDataVistoria(Date dataVistoria) {
		this.dataVistoria = dataVistoria;
	}


	public String getHoraVistoria() {
		return horaVistoria;
	}


	public void setHoraVistoria(String horaVistoria) {
		this.horaVistoria = horaVistoria;
	}

	public ProponenteLaudoVP getProponente() {
		return proponente;
	}


	public void setProponente(ProponenteLaudoVP proponente) {
		this.proponente = proponente;
	}


	public VeiculoLaudoVP getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(VeiculoLaudoVP veiculo) {
		this.veiculo = veiculo;
	}


	public String getCodigoVistoriador() {
		return codigoVistoriador;
	}


	public void setCodigoVistoriador(String codigoVistoriador) {
		this.codigoVistoriador = codigoVistoriador;
	}

	public Long getCodigoPostoVistoria() {
		return codigoPostoVistoria;
	}


	public void setCodigoPostoVistoria(Long codigoPostoVistoria) {
		this.codigoPostoVistoria = codigoPostoVistoria;
	}


	public Date getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public ProprietarioVeiculoLaudoVP getProprietario() {
		return proprietario;
	}


	public void setProprietario(ProprietarioVeiculoLaudoVP proprietario) {
		this.proprietario = proprietario;
	}


	public CondutorVeiculoLaudoVP getCondutor() {
		return condutor;
	}


	public void setCondutor(CondutorVeiculoLaudoVP condutor) {
		this.condutor = condutor;
	}


	public Long[] getCodigosInformacoesTecnicas() {
		return codigosInformacoesTecnicas;
	}


	public void setCodigosInformacoesTecnicas(Long[] codigosInformacoesTecnicas) {
		this.codigosInformacoesTecnicas = codigosInformacoesTecnicas;
	}


	public String getStatusVistoria() {
		return statusVistoria;
	}


	public void setStatusVistoria(String statusVistoria) {
		this.statusVistoria = statusVistoria;
	}


	public Long getCepLocalVistoria() {
		return cepLocalVistoria;
	}


	public void setCepLocalVistoria(Long cepLocalVistoria) {
		this.cepLocalVistoria = cepLocalVistoria;
	}


	public Long getKmRealizacaoVistoria() {
		return kmRealizacaoVistoria;
	}


	public void setKmRealizacaoVistoria(Long kmRealizacaoVistoria) {
		this.kmRealizacaoVistoria = kmRealizacaoVistoria;
	}


	public String getCidadeOrigemVistoria() {
		return cidadeOrigemVistoria;
	}


	public void setCidadeOrigemVistoria(String cidadeOrigemVistoria) {
		this.cidadeOrigemVistoria = cidadeOrigemVistoria;
	}


	public String getCidadeDestinoVistoria() {
		return cidadeDestinoVistoria;
	}


	public void setCidadeDestinoVistoria(String cidadeDestinoVistoria) {
		this.cidadeDestinoVistoria = cidadeDestinoVistoria;
	}

	
	public Long getCodigoCorretorInterno() {
		return codigoCorretorInterno;
	}


	public void setCodigoCorretorInterno(Long codigoSusepCorretor) {
		this.codigoCorretorInterno = codigoSusepCorretor;
	}


	public String getCodigoVoucher() {
		return codigoVoucher;
	}


	public void setCodigoVoucher(String codigoVoucher) {
		this.codigoVoucher = codigoVoucher;
	}


	public String getUfRealizacaoVistoria() {
		return ufRealizacaoVistoria;
	}


	public void setUfRealizacaoVistoria(String ufRealizacaoVistoria) {
		this.ufRealizacaoVistoria = ufRealizacaoVistoria;
	}


	public String getValidacao() {
		return validacao;
	}


	public void setValidacao(String validacao) {
		this.validacao = validacao;
	}


	public String getIndicadorPostoDomicilio() {
		return indicadorPostoDomicilio;
	}


	public void setIndicadorPostoDomicilio(String indicadorPostoDomicilio) {
		this.indicadorPostoDomicilio = indicadorPostoDomicilio;
	}
}
