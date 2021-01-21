package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import br.com.tokiomarine.seguradora.core.util.DateUtil;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class DadosGerais implements Serializable {

	private String nrVoucher;
	private String tipoEnvio;
	private String tipoVistoria;
	private Date dataVistoria;
	private String periodoVistoria;
	private String nomeContatoVistoria;
	private Telefone[] telefonesContato;
	private String[] emailsContato;
	private String nomePosto;

	public String getNrVoucher() {
		return nrVoucher;
	}

	public void setNrVoucher(String nrVoucher) {
		this.nrVoucher = nrVoucher;
	}

	public String getTipoEnvio() {
		return tipoEnvio;
	}

	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}

	public String getTipoVistoria() {
		return tipoVistoria;
	}

	public void setTipoVistoria(String tipoVistoria) {
		this.tipoVistoria = tipoVistoria;
	}

	public Date getDataVistoria() {
		return dataVistoria;
	}

	public void setDataVistoria(Date dataVistoria) {
		this.dataVistoria = dataVistoria;
	}

	public String getPeriodoVistoria() {
		return periodoVistoria;
	}

	public void setPeriodoVistoria(String periodoVistoria) {
		this.periodoVistoria = periodoVistoria;
	}

	public String getNomeContatoVistoria() {
		return nomeContatoVistoria;
	}

	public void setNomeContatoVistoria(String nomeContatoVistoria) {
		this.nomeContatoVistoria = nomeContatoVistoria;
	}

	public Telefone[] getTelefonesContato() {
		return telefonesContato;
	}

	public void setTelefonesContato(Telefone[] telefonesContato) {
		this.telefonesContato = telefonesContato;
	}

	public String[] getEmailsContato() {
		return emailsContato;
	}

	public void setEmailsContato(String[] emailsContato) {
		this.emailsContato = emailsContato;
	}

	public String getNomePosto() {
		return nomePosto;
	}

	public void setNomePosto(String nomePosto) {
		this.nomePosto = nomePosto;
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		
		s.append("\n\n");
		s.append("\t\t\t nrVoucher: " + nrVoucher + "\n");
		s.append("\t\t\t tipoEnvio: " + tipoEnvio + "\n");
		s.append("\t\t\t tipoVistoria: " + tipoVistoria + "\n");
		s.append("\t\t\t dataVistoria: " + DateUtil.formataData(dataVistoria) + "\n");
		s.append("\t\t\t periodoVistoria: " + periodoVistoria + "\n");
		s.append("\t\t\t nomeContatoVistoria: " + nomeContatoVistoria + "\n");
		s.append("\t\t\t Telefones Contato: \n");
		if (telefonesContato != null) {
			for (Telefone telefone : telefonesContato) {
				s.append("\t\t\t\t telefone: " + telefone + "\n");
			}
		}
		s.append("\t\t\t Emails Contato: \n");
		if (emailsContato != null) {
			for (String email : emailsContato) {
				s.append("\t\t\t\t email: " + email + "\n");
			}
		}
		s.append("\t\t\t nomePosto: " + nomePosto + "\n");
			
		return s.toString();
	}
}
