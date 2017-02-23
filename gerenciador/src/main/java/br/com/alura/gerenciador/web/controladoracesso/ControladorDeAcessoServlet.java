package br.com.alura.gerenciador.web.controladoracesso;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.web.ServletExecutor;

@WebServlet(urlPatterns="/controladorAcesso")
public class ControladorDeAcessoServlet extends ServletExecutor {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.service(req, resp,
				"br.com.alura.gerenciador.web.controladoracesso.");
	}
	
}
