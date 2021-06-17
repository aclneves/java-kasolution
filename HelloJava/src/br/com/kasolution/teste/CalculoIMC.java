package br.com.kasolution.teste;

import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esse programa calcula o IMC \n");
		
		System.out.print("Digite o nome do paciente: ");
		String nome = sc.next();
		
		System.out.print("Digite o peso do paciente: ");
		double peso = sc.nextDouble();
		
		System.out.print("Digite a altura do paciente: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.printf("O valor do IMC do paciente %s eh: %.2f",nome, imc);		
	} // fim main
} // fim class
