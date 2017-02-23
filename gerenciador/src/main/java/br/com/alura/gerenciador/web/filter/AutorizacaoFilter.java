package br.com.alura.gerenciador.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import br.com.alura.gerenciador.Usuario;

@WebFilter(urlPatterns="/empresa")
public class AutorizacaoFilter implements Filter {

	@Override
	public void destroy() {		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) req;
		
		if (getUsuarioLogado(request) == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/");
			dispatcher.forward(req, resp);
			return;
		}
		
		chain.doFilter(req, resp);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

	public Usuario getUsuarioLogado(HttpServletRequest req) {
		return (Usuario) req.getSession().getAttribute("usuarioLogado");
	}
	
}
