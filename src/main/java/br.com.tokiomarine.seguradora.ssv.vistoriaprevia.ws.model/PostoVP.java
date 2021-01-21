package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

public class PostoVP implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long codigo;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private Long cep;
    private String telefone1;
    private String telefone2;
    private String horario1;
    private String horario2;
    private String referencia;
    private String email;
    private String indicadorAtendeCaminhao;
    private Long indicadorPostoAtivo;
    private String codigoMunicipio;


    public PostoVP() {}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public Long getCep() {
		return cep;
	}


	public void setCep(Long cep) {
		this.cep = cep;
	}


	public String getTelefone1() {
		return telefone1;
	}


	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}


	public String getTelefone2() {
		return telefone2;
	}


	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}


	public String getHorario1() {
		return horario1;
	}


	public void setHorario1(String horario1) {
		this.horario1 = horario1;
	}


	public String getHorario2() {
		return horario2;
	}


	public void setHorario2(String horario2) {
		this.horario2 = horario2;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getIndicadorAtendeCaminhao() {
		return indicadorAtendeCaminhao;
	}


	public void setIndicadorAtendeCaminhao(String indicadorAtendeCaminhao) {
		this.indicadorAtendeCaminhao = indicadorAtendeCaminhao;
	}


	public Long getIndicadorPostoAtivo() {
		return indicadorPostoAtivo;
	}


	public void setIndicadorPostoAtivo(Long icPostoAtivo) {
		this.indicadorPostoAtivo = icPostoAtivo;
	}


	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}


	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
