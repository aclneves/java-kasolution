/*
 Programa Hello Java
 Programador: Antonio Neves
 Data: 24/05/2021
 */

package br.com.kasolution.teste;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		System.out.println("Ola, esse e um programa em Java!");
		System.out.println("Qual seu nome?");
		Scanner sc = new Scanner(System.in); // CTRL + SHIFT = O - importa as libraries
		String nome = sc.next(); // le a informaçao digitada no teclado
		System.out.println("Ola " + nome + " seja bem vindo!"); 
	} // fim main

} // fim class
