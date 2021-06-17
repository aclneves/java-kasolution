package br.com.softtek.dominio;

public class Fatura implements Pagavel{
	
	private String nome;
	private int quantidade;
	private double valorUnitario;

	public Fatura() {
	}

	public Fatura(String nome, int quantidade, double valorUnitario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Override
	public String toString() {
		String info = "Nome: " + nome + "\n";
		info += "Quantidade: " + quantidade + "\n";
		info += "Valor unitario: " + valorUnitario + "\n";
		return info;
	}

	@Override
	public double calculaValorPagamento() {
		return valorUnitario * quantidade;
	}
	
	
	
	
}
