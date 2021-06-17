package br.com.softtek.dominio;

import static br.com.softtek.util.Formatador.*;

public class ComissionadoAssalariado extends Comissionado{
	
	private double salarioMensal;
	
	public ComissionadoAssalariado() {
		// TODO Auto-generated constructor stub
	}

	public ComissionadoAssalariado(String nome, String sobrenome, String cpf, double vendaBruta,
			double porcentagemComissao, double salarioMensal) {
		super(nome, sobrenome, cpf, vendaBruta, porcentagemComissao);
		this.salarioMensal = salarioMensal;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	@Override
	public String toString() {
		String info = super.toString();
		info += "Salario mensal: " + moeda(salarioMensal) + "\n";
		return info;
	}

	@Override
	public double calculaValorPagamento() {
		double subtotal = super.calculaValorPagamento();
		return subtotal + salarioMensal;
		
	}
	
	
	
	
}




