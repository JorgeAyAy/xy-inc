<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>XY Inc.</title>

<style>
table, th, td {
    border: 1px solid black;
}
</style>

</head>
<body>

	<jsp:useBean id="dao" class="br.com.xy.DAO.PoiDao" />
	<table>
		<!-- percorre poi's montando as linhas da tabela -->
		
		<tr>
			<td><b> Nome </b></td>
			<td><b> Coordenada X </b></td>
			<td><b> Coordenada Y </b></td> 
			<td><b> Excluir Coord? </b></td> 
		</tr>
		<c:forEach var="poi" items="${dao.lista}">
			<tr>
				<td>${poi.nomePOI}</td>
				<td>${poi.coordenadaX}</td>
				<td>${poi.coordenadaY}</td>
				<td><a href="?logic=RemovePOILogic&id=${poi.id}">Remover</a>
				</td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>