package br.com.softtek.teste;

import br.com.softtek.dominio.Assalariado;
import br.com.softtek.dominio.Comissionado;
import br.com.softtek.dominio.ComissionadoAssalariado;
import br.com.softtek.dominio.Fatura;
import br.com.softtek.dominio.Funcionario;
import br.com.softtek.dominio.Horista;
import br.com.softtek.dominio.Pagavel;
import br.com.softtek.util.Formatador;

public class TesteOrdemPagamento {

	public static void main(String[] args) {
		
		Horista h = new Horista("Renata", "Oliveira", "123.456.789-00", 200.00, 100);
		Assalariado a = new Assalariado("Carlos", "Henrique", "123.456.789-00", 10_000.00);
		Comissionado c = new Comissionado("Luiz", "Souza", "123.456.789-00", 60_000.00, 5.0);
		ComissionadoAssalariado ca = new ComissionadoAssalariado("Joao", "Cunha", "123.456.789-00", 45_000, 3.0, 3_000.00);
		Fatura fatura = new Fatura("Dell - Notebook", 5, 3_000.00);
		
		Pagavel pagaveis[] = {h, a, c, ca, fatura};
		
		System.out.println("Ordem Pagamento");
		for (Pagavel p : pagaveis) {
			System.out.printf("Sacador: %s - valor %s \n", p.getNome(), Formatador.moeda(p.calculaValorPagamento()));
		}
	/*
	 Metodos comuns entre funcionario/Fatura
	 - getNome()
	 - calculaValorPagamento()
	 */
	}
	

}
