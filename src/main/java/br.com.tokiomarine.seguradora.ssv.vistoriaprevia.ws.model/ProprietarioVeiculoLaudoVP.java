package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;
import java.util.Date;

public class ProprietarioVeiculoLaudoVP implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String estadoCivil;
    private String sexo;
    private Date dataNascimento;
    private String cnh;
    private String ufCnh;
    private Date dataCnh;
    private String atividadeProfissional;
	
    
    public ProprietarioVeiculoLaudoVP() {}


	public String getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	
	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
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


	public Date getDataCnh() {
		return dataCnh;
	}


	public void setDataCnh(Date dataCnh) {
		this.dataCnh = dataCnh;
	}


	public String getAtividadeProfissional() {
		return atividadeProfissional;
	}


	public void setAtividadeProfissional(String atividadeProfissional) {
		this.atividadeProfissional = atividadeProfissional;
	}
}
