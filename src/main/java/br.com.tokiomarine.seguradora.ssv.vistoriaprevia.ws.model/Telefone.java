package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Telefone implements Serializable {

	private String ddd;
	private String numero;
	private String ramal;

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		
		s.append("\n\n");
		s.append("\t\t\t\t ddd: " + ddd + "\n");
		s.append("\t\t\t\t numero: " + numero + "\n");
		s.append("\t\t\t\t ramal: " + ramal + "\n");
			
		return s.toString();
	}
}
