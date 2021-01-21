package br.com.tokiomarine.seguradora.ssv.vistoriaprevia.ws.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Agendamento implements Serializable {

	private DadosGerais dadosGerais = new DadosGerais();
	private DadosSegurado dadosSegurado = new DadosSegurado();
	private DadosCorretor dadosCorretor = new DadosCorretor();
	private DadosVeiculo dadosVeiculo = new DadosVeiculo();

	public DadosGerais getDadosGerais() {
		return dadosGerais;
	}

	public void setDadosGerais(DadosGerais dadosGerais) {
		this.dadosGerais = dadosGerais;
	}

	public DadosSegurado getDadosSegurado() {
		return dadosSegurado;
	}

	public void setDadosSegurado(DadosSegurado dadosSegurado) {
		this.dadosSegurado = dadosSegurado;
	}

	public DadosCorretor getDadosCorretor() {
		return dadosCorretor;
	}

	public void setDadosCorretor(DadosCorretor dadosCorretor) {
		this.dadosCorretor = dadosCorretor;
	}

	public DadosVeiculo getDadosVeiculo() {
		return dadosVeiculo;
	}

	public void setDadosVeiculo(DadosVeiculo dadosVeiculo) {
		this.dadosVeiculo = dadosVeiculo;
	}
	
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		
		s.append("\n\n");
		s.append("\t\t dadosGerais: " + dadosGerais + "\n");
		s.append("\t\t dadosSegurado: " + dadosSegurado + "\n");
		s.append("\t\t dadosCorretor: " + dadosCorretor + "\n");
		s.append("\t\t dadosVeiculo: " + dadosVeiculo + "\n");
	
			
		return s.toString();
	}

}
