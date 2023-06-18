<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin</title>
<style>
body {
	margin: 0px;
	color: cyan;
	background-image: url('Library Picture.jpg');
}

header {
	margin: 0px;
	padding: 25px;
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
	padding: 10px 8px;
	text-align: left;
	height: 20px;
}

.links {
	background-color: voilet;
	height: 30px;
	text-align: center;
	padding: 20px;
	border: 2px solid black;
	border-radius: 10px;
	padding: 20px;
	margin: 20px;
	padding: 5px;
}

.links:hover {
	background-color: yellow;
}

a {
	color: blue;
	text-decoration: none;
}

.libreg {
	color: black;
	height: 500px;
	width: 650px;
	background-color: cyan;
	opacity: 1.0;
	margin-left: 250px;
	text-align: center;
	padding-left: 50px;
	border-radius : 20px;
}
</style>

</head>
<body bgcolor="gray">

	<!-- This is Header -->
	<header
		style="height: 70px; background-color: purple; border-bottom: ipx solid gray;">
		<h1 align="center">College E-Library Management App</h1>
	</header>

	<!--For Menu Option to the Admin  -->
	<div
		style="background-color: honeydew; height: 650px; width: 20%; float: left;">

		<div class="links">
			<a href="../adminwindow.jsp">ADMIN</a>
		</div>
		<div class="links">
			<a href="../librarianregistration.jsp">Register Librarian</a>
		</div>

		<div class="links">
			<a href="../librariansearch.html">Search Librarian</a>
		</div>
		<div class="links">
			<a href="../updatelibrarian.html">Update Librarian</a>
		</div>
		<div class="links">
			<a href="../librariandelete.html">Delete Librarian</a>
		</div>
		<div class="links">
			<a href="../librarian/showalllibrarian">Show All Librarian</a>
		</div>
		<div class="links">
			<a href="../adminlogout.jsp">Logout</a>
		</div>

	</div>

	<div
		style="float: left; height: 650px; width: 80%; background-image: url('../Library Picture.jpg'); background-size: 1215px 650px;">
		<!-- <img src="background-modified.jpg" width="1215px" height="650px" /> -->

		<div class="libreg">
			<c:choose>
				<c:when test="${librarian ne null}">
					<h1 style="color: green; text-align: center">Record Inserted
						Successfully</h1>

					<h1>Librarian Details</h1>
					<table
						style="border: 1px solid black; cellpadding: 10px; text-align: center;">
						<tr>
							<th>Librarian ID</th>
							<td>${librarian.libId}</td>
						</tr>
						<tr>
							<th>Full Name</th>
							<td>${librarian.fullname}</td>
						</tr>
						<tr>
							<th>Email Id</th>
							<td>${librarian.mailid}</td>
						</tr>
						<tr>
							<th>Contact No.</th>
							<td>${librarian.contactno}</td>
						</tr>
						<tr>
							<th>Password</th>
							<td>${librarian.password}</td>
						</tr>
					</table>
					<div class="links">
						<a href="../librarianregistration.jsp">Register More Librarian</a>
					</div>

					<div class="links">
						<a href="../adminwindow.jsp">Go Back</a>
					</div>

				</c:when>

				<c:otherwise>
					<h1 style="color: red; text-align: center">Record Insertion
						Failed</h1>
					<div class="links">
						<a href="librarianregistration.jsp">Register Librarian</a>
					</div>

					<div class="links">
						<a href="adminwindow.jsp">Go Back</a>
					</div>

				</c:otherwise>
			</c:choose>

		</div>

	</div>
</body>
</html>
