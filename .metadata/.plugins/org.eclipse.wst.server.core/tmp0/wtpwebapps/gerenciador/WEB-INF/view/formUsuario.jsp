<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:import url="logout-parcial.jsp"/>

    <form action="/gerenciador/entrada" method="post">

        Login: <input type="text" name="Login"  placeholder="Digie seu login"/>
        Senha: <input type="password" name="senha" placeholder="Digite sua senha" />

        <input type="hidden" name="acao" value="Login" /> 

        <input type="submit" />
    </form>

</body>
</html>