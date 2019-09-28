<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<jsp:useBean id="ttt" scope="session" class="tictactoe.GameBean"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tic-Tac-Toe</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<style>
 table {
    width: auto;
    margin-left: auto;
    margin-right: auto;
}

span{
 	font-size: 1.5em;
}

.btn-outline-dark{
	width: 50px; 
	height: 50px;
}
</style>
</head>
<body>
	<h1 style="text-align: center;">Tic-Tac-Toe</h1>
	
	<c:choose>
	<c:when test="${ttt.getWinner() eq null}">
	<table>
	<tr>
		<td><a class="btn btn-outline-dark"href="PlayController?location=0"><span>${ttt.getMove(0)}</span></a></td>
		<td><a class="btn btn-outline-dark"href="PlayController?location=1"><span>${ttt.getMove(1)}</span></a></td>
		<td><a class="btn btn-outline-dark"href="PlayController?location=2"><span>${ttt.getMove(2)}</span></a></td>
	</tr>
	<tr>
		<td><a class="btn btn-outline-dark"href="PlayController?location=3"><span>${ttt.getMove(3)}</span></a></td>
		<td><a class="btn btn-outline-dark"href="PlayController?location=4"><span>${ttt.getMove(4)}</span></a></td>
		<td><a class="btn btn-outline-dark"href="PlayController?location=5"><span>${ttt.getMove(5)}</span></a></td>
	</tr>
	<tr>
		<td><a class="btn btn-outline-dark"href="PlayController?location=6"><span>${ttt.getMove(6)}</span></a></td>
		<td><a class="btn btn-outline-dark"href="PlayController?location=7"><span>${ttt.getMove(7)}</span></a></td>
		<td><a class="btn btn-outline-dark"href="PlayController?location=8"><span>${ttt.getMove(8)}</span></a></td>
	</tr>
	</table>
	
	<div style="text-align: center;">
		<h6 style="color: blue;">Player Turn: ${ttt.getPlayer() }</h6>
	</div>
	</c:when>
	
	<c:otherwise>
	<c:choose>
		<c:when test="${ttt.getWinner() eq 'X'}">
			<h6 style="text-align: center;"> X has won the game!</h6>	
			<div style="text-align: center">
			<a class="btn btn-primary" href="NewGameController">New Game</a>
			</div>
		</c:when>
		
		<c:when test="${ttt.getWinner() eq 'O'}">
			<h6 style="text-align: center;"> O has won the game!</h6>	
			<div style="text-align: center">
			<a class="btn btn-primary" href="NewGameController">New Game</a>
			</div>
		</c:when>
		
		<c:when test="${ttt.getWinner() eq 'D'}">
			<h6 style="text-align: center;"> No one wins, draw!</h6>	
			<div style="text-align: center">
			<a class="btn btn-primary" href="NewGameController">New Game</a>
			</div>
		</c:when>
		
		<c:otherwise>
		</c:otherwise>
		
	</c:choose>
	<table>
	<tr>
		<td><a class="btn btn-outline-dark"><span>${ttt.getMove(0)}</span></a></td>
		<td><a class="btn btn-outline-dark"><span>${ttt.getMove(1)}</span></a></td>
		<td><a class="btn btn-outline-dark"><span>${ttt.getMove(2)}</span></a></td>
	</tr>
	<tr>
		<td><a class="btn btn-outline-dark"><span>${ttt.getMove(3)}</span></a></td>
		<td><a class="btn btn-outline-dark"><span>${ttt.getMove(4)}</span></a></td>
		<td><a class="btn btn-outline-dark"><span>${ttt.getMove(5)}</span></a></td>
	</tr>
	<tr>
		<td><a class="btn btn-outline-dark"><span>${ttt.getMove(6)}</span></a></td>
		<td><a class="btn btn-outline-dark"><span>${ttt.getMove(7)}</span></a></td>
		<td><a class="btn btn-outline-dark"><span>${ttt.getMove(8)}</span></a></td>
	</tr>
	</table>
		</c:otherwise>	
	</c:choose>
	
</body>
</html>