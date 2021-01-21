package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DadosSegurado implements Serializable {

	private String nomeSegurado;
	private String tipoPessoa;
	private Long cpfCnpj;
	private String endereco;
	private String nrEndereco;
	private String complementoEndereco;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	private String referenciaEndereco;

	public String getNomeSegurado() {
		return nomeSegurado;
	}

	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Long getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(Long cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNrEndereco() {
		return nrEndereco;
	}

	public void setNrEndereco(String nrEndereco) {
		this.nrEndereco = nrEndereco;
	}

	public String getComplementoEndereco() {
		return complementoEndereco;
	}

	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	public String getReferenciaEndereco() {
		return referenciaEndereco;
	}

	public void setReferenciaEndereco(String referenciaEndereco) {
		this.referenciaEndereco = referenciaEndereco;
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		
		s.append("\n\n");
		s.append("\t\t\t nomeSegurado: " + nomeSegurado + "\n");
		s.append("\t\t\t tipoPessoa: " + tipoPessoa + "\n");
		s.append("\t\t\t cpfCnpj: " + cpfCnpj + "\n");
		s.append("\t\t\t endereco: " + endereco + "\n");
		s.append("\t\t\t nrEndereco: " + nrEndereco + "\n");
		s.append("\t\t\t complementoEndereco: " + complementoEndereco + "\n");
		s.append("\t\t\t bairro: " + bairro + "\n");
		s.append("\t\t\t cep: " + cep + "\n");
		s.append("\t\t\t cidade: " + cidade + "\n");
		s.append("\t\t\t uf: " + uf + "\n");
		s.append("\t\t\t referenciaEndereco: " + referenciaEndereco + "\n");
		
		return s.toString();
	}
}
