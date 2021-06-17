package br.com.softtek.teste;

public class CalculadoraJava {

	public static void main(String[] args) {
		int a[] = {10, 12, 9, 7, 15};
		double b[] = {10.5, 15.4, 12.8, 25.5, 12, 14, 18};
		
		double soma_a = 0;
		double soma_b = 0;
		
		for(int i : a) {
			soma_a += i;
		}
		
		for(double d : b) {
			soma_b += d;
		}
		
		double media_a = soma_a / a.length;
		double media_b = soma_b / b.length;
		
		System.out.printf("A media do vetor a = %.2f e a media do vetor b = %.2f", media_a, media_b);
	
	}
}
