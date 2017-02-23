<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Funcionalidades Empresa</title>
</head>
<body>
	
	Bem vindo ao nosso gerenciador de empresas!<br/>

	<c:if test="${!empty usuarioLogado}">
		<br/>
		Usuário logado como <strong>${usuarioLogado.email }</strong>
		<br/>
	</c:if>

	<form action="controladorAcesso?tarefa=Logout" method="post">
		<input type="submit" value="Logout"/>
	</form>

	<form action="empresa?tarefa=CadastroEmpresa" method="post">
		<label for="nomeEmpresa">Nome da Empresa: </label> <input type="text"
			name="nomeEmpresa" id="nomeEmpresa" /> <input type="submit"
			value="Salvar">
	</form>
	
	<form action="empresa?tarefa=BuscaEmpresa" method="post">
		<label for="filtro">Filtro: </label>
		<input type="text" name="filtro" id="filtro" />
		<input type="submit" value="Buscar">
	</form>
</body>
</html>