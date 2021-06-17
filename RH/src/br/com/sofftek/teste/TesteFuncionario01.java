package br.com.sofftek.teste;

import br.com.sofftek.dominio.Funcionario;

public class TesteFuncionario01 {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Francisco Carlos", "234.567.112-00");
		
		// funcionario.cpf = "234.567.112-00";
		// funcionario.setor = "TI - Desenv";
		// funcionario.salario = 25_000.00;
				
			
		System.out.println("Codigo: " + funcionario.getCodigo());
		System.out.println("Nome: " + funcionario.getNome());
//		System.out.println("CPF: " + funcionario.cpf);
//		System.out.println("Setor: " + funcionario.setor);
//		System.out.println("Salario: " + funcionario.salario);
//		
	}

}
