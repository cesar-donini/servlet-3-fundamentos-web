package br.com.alura.gerenciador.web.empresa;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;
import br.com.alura.gerenciador.web.Tarefa;

public class BuscaEmpresa implements Tarefa {
	
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		String filtro = req.getParameter("filtro");
		Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		
		req.setAttribute("empresas", empresas);
		
		return "/WEB-INF/paginas/listaEmpresas.jsp";		
	}
}
