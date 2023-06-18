<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body {
	margin: 0px;
	font-family: "Audiowide", sans-serif;
	color: white;
	background-image: url('../Library Picture.jpg');
	background-repeat: no-repeat;
	height: 500px;
	width: 700px;
	background-size: 1525px 650px;
}

header {
	margin: 0px;
	padding: 5px;
}

.links {
	background-color: black;
	height: 30px;
	text-align: center;
	padding: 10px;
	border: 2px solid gray;
	border-radius: 12px;
	padding: 5px;
	margin: 10px;
	padding: 5px;
}

.links:hover {
	background-color: cyan;
	border: 2px solid black;
}

a:hover {
	color: black;
}

a {
	color: white;
	text-decoration: none;
}

.libreg {
	color: black;
	height: 600px;
	width: 600px;
	background-color: lightblue;
	opacity: 0.8;
	margin-left: 300px;
	text-align: center;
}

input {
	border-radius: 10px;
}

/* Set some basic styles for the table */
table {
	border-collapse: collapse;
	margin: 0 auto;
	width: 70%;
}

/* Set alternating background colors for the rows */
tr:nth-child(even) {
	background-color: #f2f2f2;
}

/* Style the table headers */
th {
	background-color: #4CAF50;
	color: white;
	font-weight: bold;
	font-size: 12px;
	padding: 10px 8px;
	text-align: left;
	height: 20px;
}

</style>
</head>
<body>

	<div class="libreg">
		<h1>Result Page</h1>
		<br /> <br />
		<c:choose>
			<c:when test="${addStudent eq 'success'}">
				<h1 style="color: green; text-align: center">Record Inserted
					Successfully</h1>
				<div class="links">
					<a href="../studentregistration.html">Register More Student</a>
				</div>

				<div class="links">
					<a href="../welcome.html">Go Back</a>
				</div>

			</c:when>

			<c:otherwise>
				<h1 style="color: red; text-align: center">Record Insertion
					Failed</h1>
				<div class="links">
					<a href="../studentregistration.html">Register Student</a>
				</div>

				<div class="links">
					<a href="../welcome.html">Go Back</a>
				</div>

			</c:otherwise>
		</c:choose>

	</div>

</body>
</html>