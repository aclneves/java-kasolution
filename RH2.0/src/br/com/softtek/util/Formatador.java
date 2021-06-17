package br.com.softtek.util;

import java.text.NumberFormat;

public class Formatador {
	
	// nao tem atributos
	
	static public String moeda(double valor) {
		return NumberFormat.getCurrencyInstance().format(valor);
	}
	
	static public String numero(double valor ) {
		return NumberFormat.getNumberInstance().format(valor);
	}

}
