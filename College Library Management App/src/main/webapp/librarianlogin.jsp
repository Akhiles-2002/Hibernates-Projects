<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Librarian Login</title>

<style>
body {
	margin: 0px;
	color: white;
}

header {
	margin: 5px;
	padding: 10px;
}

input{
	border-radius: 12px;
}

.links {
	background-color: black;
	height: 70px;
	text-align: center;
	border: 2px solid gray;
	border-radius: 12px;
	margin-top: 50px;
}

.links:hover {
	background-color: gray;
	border: 2px solid black;
}

a:hover {
	color: black;
}

a {
	color: white;
	text-decoration: none;
	font-size: 25px;
}

.libreg {
	color: black;
	height: 300px;
	width: 500px;
	opacity: 1;
	background-color: cyan;
	margin-left: 500px;
	margin-top: 100px;
	text-align: center;
	padding: 10px;
	border: 3px solid black;
	border-radius: 12px;
}
</style>

</head>
<body>


	<header style="height: 70px; background-color: purple;">
		<h1 align="center">College E-Library Management App</h1>
	</header>

	<div
		style="float: left; height: 650px; width: 100%; background-image: url('Library Picture.jpg'); background-size: 1525px 650px; background-repeat: no-repeat;">

		<div class="libreg">

			<center>
				<h1>Librarian Login Portal</h1>
				<br />
				<form method="post" action="./liblogin">
					<table cellpadding="10px">
						<tr>
							<th>Librarian Id</th>
							<td><input type="text" name="username" /></td>
						</tr>
						<tr>
							<th>Password</th>
							<td><input type="password" name="password" /></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="Submit" style="width: 100px; height: 25px;" /></td>
						</tr>
					</table>
				</form>
				<c:choose>
					<c:when test="${status eq 'fail'}">
						<p style="color: red;">*UserName and Password are not correct</p>
					</c:when>
				</c:choose>
			</center>

		</div>
	</div>
</body>
</html>