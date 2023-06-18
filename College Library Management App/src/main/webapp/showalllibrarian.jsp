<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Librarians Details</title>
<style>
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
	padding: 10px 8px;
	text-align: left;
	height: 20px;
}

a {
	border: 1px solid black;
	border-radius: 12px;
	background-color: cyan;
	color: blue;
	text-decoration: none;
	padding: 8px;
}

header {
	margin: -10px;
	padding: 10px;
	background-color: purple;
	text-align: center;
	border: 5px solid white;
}
</style>
</head>
<body style="background-color: lightblue; text-align: center">
	<header>
		<h1 style="color: white;">College E-Library</h1>
	</header>
	<c:choose>
		<c:when test="${librarianList ne null}">
			<table border="1" cellpadding="5px" align="center">
				<tr style="color: white;">
					<th>Librarian Id</th>
					<th>Full Name</th>
					<th>EMail Id</th>
					<th>Contact No.</th>
					<th>Password</th>
				</tr>
				<br />
				<c:forEach var="librarian" items="${librarianList}">
					<tr>
						<!-- Display the employee details -->
						<td>${librarian.libId}</td>
						<td>${librarian.fullname}</td>
						<td>${librarian.mailid}</td>
						<td>${librarian.contactno}</td>
						<td>${librarian.password}</td>
					</tr>
				</c:forEach>
			</table>
			<br />
			<br />
		</c:when>
		<c:otherwise>
			<h2 style="color: red; text-align: center;">No Records Available</h2>
		</c:otherwise>
	</c:choose>
</body>
</html>
