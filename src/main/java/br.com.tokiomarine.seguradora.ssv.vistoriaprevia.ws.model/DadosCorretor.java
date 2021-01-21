package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DadosCorretor implements Serializable {

	private String codigoCorretorCia;
	private String nomeCorretor;
	private String[] emails;
	private Telefone[] telefones;

	public String getCodigoCorretorCia() {
		return codigoCorretorCia;
	}

	public void setCodigoCorretorCia(String codigoCorretorCia) {
		this.codigoCorretorCia = codigoCorretorCia;
	}

	public String getNomeCorretor() {
		return nomeCorretor;
	}

	public void setNomeCorretor(String nomeCorretor) {
		this.nomeCorretor = nomeCorretor;
	}

	public String[] getEmails() {
		return emails;
	}

	public void setEmails(String[] emails) {
		this.emails = emails;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		
		s.append("\n\n");
		s.append("\t\t\t codigoCorretorCia: " + codigoCorretorCia + "\n");
		s.append("\t\t\t nomeCorretor: " + nomeCorretor + "\n");
		s.append("\t\t\t Telefones: \n");
		for (Telefone telefone : telefones) {
			s.append("\t\t\t\t telefone: " + telefone + "\n");
		}
		s.append("\t\t\t Emails Contato: \n");
		for (String email : emails) {
			s.append("\t\t\t\t email: " + email + "\n");
		}
		
		return s.toString();
	}
}