<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	
	<c:if test="${not empty usuarioInvalido }">
		<strong>${usuarioInvalido }</strong><br/>
	</c:if>

	<form action="controladorAcesso?tarefa=Login" method="post">
		<label for="email">Email:</label> <input type="text" id="email"
			name="email" /> <br /> <label for="senha">Senha:</label> <input
			type="password" id="senha" name="senha" /><br /> <input type="submit"
			value="Entrar" />
	</form>
</body>
</html>