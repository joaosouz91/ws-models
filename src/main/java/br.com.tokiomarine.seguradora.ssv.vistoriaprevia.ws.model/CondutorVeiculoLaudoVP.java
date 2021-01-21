package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;
import java.util.Date;

public class CondutorVeiculoLaudoVP implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
    private String estadoCivil;
    private Long cpf;
    private Date dataNascimento;
    private String cnh;
    private String ufCnh;
    private Long tipo;
	
    
    public CondutorVeiculoLaudoVP() {}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public Long getCpf() {
		return cpf;
	}


	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getCnh() {
		return cnh;
	}


	public void setCnh(String cnh) {
		this.cnh = cnh;
	}


	public String getUfCnh() {
		return ufCnh;
	}


	public void setUfCnh(String ufCnh) {
		this.ufCnh = ufCnh;
	}


	public Long getTipo() {
		return tipo;
	}


	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}
}
