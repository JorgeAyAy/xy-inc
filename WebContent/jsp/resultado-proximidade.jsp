<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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


Lista de Pontos:


<table>

		<!-- percorre poi's montando as linhas da tabela -->

		<c:forEach var="poi" items="${dao.pesquisarProximidade(param.coordenadaX,param.coordenadaY)}">
		
		<tr>
			<td> Localizacão: ${poi.nomePOI} </td>
			<td> X: ${poi.coordenadaX} </td>
			<td> Y: ${poi.coordenadaY} </td>
		</tr>
		
		</c:forEach>
</table>
</body>
</html>