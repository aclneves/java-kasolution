package br.com.igordev.mvc.servico;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Servico {
	
	String executa(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	/*
	 Todos os serviços do controller tem o metodo executa em comum.
	 Esse metodo retorna uma String que aponta para a pagina que sera aberta
	 */

}
