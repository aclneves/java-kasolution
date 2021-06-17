package br.com.softtek.teste;

import br.com.softtek.dominio.Assalariado;
import br.com.softtek.dominio.Comissionado;
import br.com.softtek.dominio.ComissionadoAssalariado;
import br.com.softtek.dominio.Funcionario;
import br.com.softtek.dominio.Horista;
import br.com.softtek.util.Formatador;

public class TesteFuncionario01 {

	public static void main(String[] args) {
	
		// Funcionario f = new Funcionario("Marcelo", "Silva", "123.456.789-00");
		Horista h = new Horista("Renata", "Oliveira", "123.456.789-00", 200.00, 100);
		Assalariado a = new Assalariado("Carlos", "Henrique", "123.456.789-00", 10_000.00);
		Comissionado c = new Comissionado("Luiz", "Souza", "123.456.789-00", 60_000.00, 5.0);
		ComissionadoAssalariado ca = new ComissionadoAssalariado("Joao", "Cunha", "123.456.789-00", 45_000, 3.0, 3_000.00);
		
		Funcionario funcionarios[] = {h, a, c, ca};
		
		for(Funcionario x : funcionarios) {
			System.out.println(x.getClass().getSimpleName());
			System.out.println(x.toString());
			System.out.println("Valor pagamento: " + Formatador.moeda(x.calculaValorPagamento()));
			System.out.println("\n");
		}
		
	}
}
