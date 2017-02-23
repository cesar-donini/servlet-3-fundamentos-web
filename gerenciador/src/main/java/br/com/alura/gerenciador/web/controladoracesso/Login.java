package br.com.alura.gerenciador.web.controladoracesso;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;
import br.com.alura.gerenciador.web.Tarefa;

public class Login implements Tarefa {

	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);
		
		if (usuario == null) {
			req.setAttribute("usuarioInvalido", "Usuário e/ou senha inválida.");
			return "/";
		}
		
		req.getSession().setAttribute("usuarioLogado", usuario);
		return "/WEB-INF/paginas/empresa.jsp";
	}
	
}
