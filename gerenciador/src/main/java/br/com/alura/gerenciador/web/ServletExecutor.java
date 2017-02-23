package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExecutor extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse resp,
			String classPackage) throws ServletException, IOException {
		
		String tarefa = req.getParameter("tarefa");
		
		if (tarefa == null) {
			throw new IllegalArgumentException("O atributo tarefa não existe");
		}
		
		tarefa = classPackage + tarefa;
		
		String pagina = "/WEB-INF/index.jsp";
		try {
			Class<?> tarefaClass = Class.forName(tarefa);
			Tarefa object = (Tarefa) tarefaClass.newInstance();
			pagina = object.execute(req, resp);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(pagina);
		dispatcher.forward(req, resp);
	}
}
