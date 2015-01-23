<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>XY Inc.</title>
</head>
<body>

	<h2>Digite aqui os números das coordenadas, elas devem ser inteiras positivas</h2>
	<hr />
	
	<form action="../listaInteressePOI">
	<table>
	
		<tr>
			<td>Digite a coordenada X: <input type="text" name="coordenadaX"/></td>
		</tr>
		<tr>
			<td>Digite a coordenada Y: <input type="text" name="coordenadaY"/></td>
			
		</tr>
		<tr>
			<td><input type="submit" value="Encontrar" /></td>
		</tr>
	</table>
	</form>
	
	
	
	
	<form action="../views/bem-vindo.jsp">
		<table>
		<td><input type="submit" value="Voltar" /> </td> 
		</table>
	</form>
	
</body>
</html>