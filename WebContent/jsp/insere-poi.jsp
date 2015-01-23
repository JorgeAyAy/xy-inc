<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>XY Inc.</title>
</head>
<body>


	<h1>Adicionar Ponto de Interesse</h1>
	<hr />
	<form action="../adicionaPOI" method="post">
		<table>

			<tr>
				<td>Nome do Ponto:</td>
				<td><input type="text" name="nomePOI" /></td>
			</tr>
			<tr>
				<td>Coordenada X:</td>
				<td><input type="text" name="coordenadaX" /></td>
			</tr>
			<tr>
				<td>Coordenada Y:</td>
				<td><input type="text" name="coordenadaY" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Gravar" /></td>

			</tr>

			

		</table>


	</form>


	<form action="../views/bem-vindo.jsp">
		<table>
			<td><input type="submit" value="Voltar" /></td>
		</table>
	</form>

</body>
</html>