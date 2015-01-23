<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Seja bem vindo ao XY Inc</title>
</head>
<body>

	<c:import url="/jsp/cabecalho.jsp" />

	<h3>MENU:</h3>
	
	
	<table>
	<form action="../jsp/insere-poi.jsp">
	
	<tr>
		<td>Adicionar Novo Ponto de Interesse: </td>
		<td><input type="submit" value="Adicionar"/> </td>
	</tr>
	
	</form>
	
	
	
	<form action="../jsp/lista-poi.jsp">
		<tr>
			<td>Listar Pontos: </td>
			<td><input type="submit" value="Listar"/> </td>
		</tr>
	
	</form>
	
	
	
	<form action="../jsp/lista-poi-proximidade.jsp">
		<tr>
			<td>Listar Pontos por Proximidade: </td>
			<td><input type="submit" value="Proximidade"/> </td>
		</tr>
	
	</form>
	</table>
	<c:import url="/jsp/rodape.jsp" />

</body>
</html>