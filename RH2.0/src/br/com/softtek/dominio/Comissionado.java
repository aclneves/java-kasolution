package br.com.softtek.dominio;

import static br.com.softtek.util.Formatador.*;

public class Comissionado extends Funcionario{
	
	//atributos
	private double vendaBruta;
	private double porcentagemComissao;
	
	//construtores
	
	public Comissionado() {
		// TODO Auto-generated constructor stub
	}

	public Comissionado(String nome, String sobrenome, String cpf, double vendaBruta, double porcentagemComissao) {
		super(nome, sobrenome, cpf);
		this.vendaBruta = vendaBruta;
		this.porcentagemComissao = porcentagemComissao;
	}

	// getters/setters
	
	public double getVendaBruta() {
		return vendaBruta;
	}

	public void setVendaBruta(double vendaBruta) {
		this.vendaBruta = vendaBruta;
	}

	public double getPorcentagemComissao() {
		return porcentagemComissao;
	}

	public void setPorcentagemComissao(double porcentagemComissao) {
		this.porcentagemComissao = porcentagemComissao;
	}

	// override toString
	@Override
	public String toString() {
		String info = super.toString();
		info += "Venda bruta: " + moeda(vendaBruta) + "\n";
		info += "Porcentagem: " + numero(porcentagemComissao) + "%\n";
		return info;
	}

	@Override
	public double calculaValorPagamento() {
		return vendaBruta * (porcentagemComissao / 100);
	}
	
	
	
	
	

}
