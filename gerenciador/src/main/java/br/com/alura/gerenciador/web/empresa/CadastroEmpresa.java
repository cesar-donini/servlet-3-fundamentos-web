package br.com.alura.gerenciador.web.empresa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;
import br.com.alura.gerenciador.web.Tarefa;

public class CadastroEmpresa implements Tarefa {
	
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String nomeEmpresa = req.getParameter("nomeEmpresa");
		
		Empresa empresa = new Empresa(nomeEmpresa);
		new EmpresaDAO().adiciona(empresa);
		
		req.setAttribute("empresa", empresa);
		
		return "/WEB-INF/paginas/novaEmpresa.jsp";
	}
	
}
