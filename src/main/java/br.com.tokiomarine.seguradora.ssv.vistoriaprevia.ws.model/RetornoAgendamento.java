package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RetornoAgendamento implements Serializable {

	private Agendamento[] agendamentos;

	public Agendamento[] getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(Agendamento[] agendamentos) {
		this.agendamentos = agendamentos;
	}
	
	
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		
		s.append("\n\n");
		s.append("Agendamentos: \n\n");
		for (int i = 0; i < agendamentos.length; i++) {
			s.append("\t agendamento " + i +  ": " + agendamentos[i] + "\n");
		}
			
		return s.toString();
	}
}
