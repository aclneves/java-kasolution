package br.com.softtek.dominio;

import br.com.softtek.util.Formatador;

public class Horista extends Funcionario { //herança de funcionario (exceto construtor)
	
	//herda nome, sobrenome e CPF
	private double valorHora;
	private double horasTrabalhadas;

	// ctrl + espaço
	public Horista() {
}

	// ctrl + 3 
	public Horista(String nome, String sobrenome, String cpf, double valorHora, double horasTrabalhadas) {
		super(nome, sobrenome, cpf); //envia os campos para o construtor base
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	// ctrl + 3 overr
	@Override
	public String toString() {
		String info = super.toString(); // pega a primeira parte de funcionario
		info += "Valor hora: " + Formatador.moeda(valorHora) + "\n";
		info += "Horas trabalhadas: " + Formatador.numero(horasTrabalhadas) + "\n";
		return info;
	}

	@Override
	public double calculaValorPagamento() {
		return valorHora * horasTrabalhadas;
	}
	
	

}
