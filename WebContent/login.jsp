<%@page import="java.sql.Connection"%>
<%@page import="loginzote.ManejadorDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<style>
body {
	width: 100%;
	margin: 0;
	padding: 0;
}

div {
	margin: 20px auto;
	width: 50%;
	padding: 20px;
	border: 1px solid black;
}

p {
	text-align: center;
	
}

h1 {
	text-align: center;
}

form, table, tr, td, input {
	width: 100%;
}

td, tr, input {
	margin: 5px 0;
	height: 30px;
}

.btn {
	background-color: #000;
	color: #fff;
	border: none;
}

.btn:hover {
	background-color: #444;
	cursor: pointer;
}

.btn:active {
	background-color: #888;
}
</style>

	<h1>Login</h1>
	<div>
		<form method="post" action="LoginCheck">
			<table>
				<tr>
					<td><label>Username</label></td>
				</tr>
				<tr>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
				</tr>
				<tr>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input class="btn" type="submit" value="login"></td>
				</tr>
			</table>
		</form>
	</div>



</body>
</html>