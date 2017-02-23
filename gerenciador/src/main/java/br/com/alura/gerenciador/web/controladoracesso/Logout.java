package br.com.alura.gerenciador.web.controladoracesso;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.web.Tarefa;

public class Logout implements Tarefa {

	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.getSession().invalidate();
		return "WEB-INF/paginas/logout.html";
	}

}
