<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Model.Usuario" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home - mvc</title>
</head>
<body>
	<% 	Usuario user = (Usuario) session.getAttribute("user"); %>
		Bem-vindo(a), <%=user.getresultado() %>
</body>
</html>
