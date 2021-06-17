package br.com.igordev.mvc.servico;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.igordev.dao.ImovelDao;
import br.com.igordev.modelo.Imovel;

public class RemoveImovelServico implements Servico {
	
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Long id = Long.parseLong(request.getParameter("id"));
		Imovel imovel = new Imovel();
		imovel.setId(id);
		System.out.println("Excluindo o im�vel...");
		new ImovelDao().remove(imovel);
		return new ListaImoveisServico().executa(request, response);//redirecionamento no servidor
		//return "mvc?servico=ListaImoveisServico" //redirecionamento no cliente
		
	}	
}
