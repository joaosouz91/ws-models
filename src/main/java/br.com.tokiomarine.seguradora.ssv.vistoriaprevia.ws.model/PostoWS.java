package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

public class PostoWS implements Serializable{

	private static final long serialVersionUID = 1451043254278424242L;
	
	
	private String nome;
	private String endereco;
	private String bairro;
	
	private Long cdAgrmtVspre;
	private Long cdPostoVspre;
	private String nmPostoVspre;
	private String sgUniddFedrc;
	private String nmCidad;
	private String dsEnder;
	private String nmBairr;
	private Long fone;
	private String hrFuncionamento;
	public Long getCdAgrmtVspre() {
		return cdAgrmtVspre;
	}
	public void setCdAgrmtVspre(Long cdAgrmtVspre) {
		this.cdAgrmtVspre = cdAgrmtVspre;
	}
	public Long getCdPostoVspre() {
		return cdPostoVspre;
	}
	public void setCdPostoVspre(Long cdPostoVspre) {
		this.cdPostoVspre = cdPostoVspre;
	}
	public String getNmPostoVspre() {
		return nmPostoVspre;
	}
	public void setNmPostoVspre(String nmPostoVspre) {
		this.nmPostoVspre = nmPostoVspre;
	}
	public String getSgUniddFedrc() {
		return sgUniddFedrc;
	}
	public void setSgUniddFedrc(String sgUniddFedrc) {
		this.sgUniddFedrc = sgUniddFedrc;
	}
	public String getNmCidad() {
		return nmCidad;
	}
	public void setNmCidad(String nmCidad) {
		this.nmCidad = nmCidad;
	}
	public String getDsEnder() {
		return dsEnder;
	}
	public void setDsEnder(String dsEnder) {
		this.dsEnder = dsEnder;
	}
	public String getNmBairr() {
		return nmBairr;
	}
	public void setNmBairr(String nmBairr) {
		this.nmBairr = nmBairr;
	}
	public Long getFone() {
		return fone;
	}
	public void setFone(Long fone) {
		this.fone = fone;
	}
	public String getHrFuncionamento() {
		return hrFuncionamento;
	}
	public void setHrFuncionamento(String hrFuncionamento) {
		this.hrFuncionamento = hrFuncionamento;
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
	
	
	
}
