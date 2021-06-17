package br.com.softtek.dominio;

import static br.com.softtek.util.Formatador.*;

public class Assalariado extends Funcionario{
	
	private double salarioSemanal;

	public Assalariado() {
		
	}

	public Assalariado(String nome, String sobrenome, String cpf, double salarioSemanal) {
		super(nome, sobrenome, cpf);
		this.salarioSemanal = salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public String toString() {
		String info = super.toString();
		info += "Salario semanal: " + moeda(salarioSemanal) + "\n";
		return info;
	}

	@Override
	public double calculaValorPagamento() {
		return salarioSemanal * 4.5;
	}	
	
	
}
