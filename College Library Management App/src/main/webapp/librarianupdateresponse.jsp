<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Librarian Delete Result</title>
<style>
body {
	margin: 0px;
	color: white;
}

header {
	margin: 0px;
	padding: 5px;
	background-color: white;
}

.links {
	background-color: lightblue;
	height: 30px;
	text-align: center;
	padding: 0px;
	border: 2px solid gray;
	border-radius: 10px;
	padding: 20px;
	margin: 20px;
	padding: 5px;
}

.links:hover {
	background-color: cyan;
	border: 2px solid black;
}

a {
	color: blue;
	text-decoration: none;
}

.libreg {
	color: black;
	height: 500px;
	width: 700px;
	background-color: lightblue;
	border: 2px solid;
	border-radius: 12px;
	opacity: 0.9;
	margin-left: 300px;
	margin-top: 30px;
	text-align: center;
}

input {
	border-radius: 10px;
}
</style>

</head>
<body>

	<!-- This is Header -->
	<header
		style="height: 90px; background-color: purple; border-bottom: 5px solid white;">
		<h1 align="center">College E-Library</h1>
	</header>

	<!--For Menu Option to the Admin  -->
	<div
		style="background-color: honeydew; height: 650px; width: 20%; float: left;">

		<div class="links">
			<a href="../../adminwindow.jsp">ADMIN</a>
		</div>
		<div class="links">
			<a href="../../librarianregistration.jsp">Register More Librarian</a>
		</div>

		<div class="links">
			<a href="../../librariansearch.html">Search Librarian</a>
		</div>
		<div class="links">
			<a href="../../updatelibrarian.html">Update Librarian</a>
		</div>
		<div class="links">
			<a href="../../librariandelete.html">Delete Librarian</a>
		</div>
		<div class="links">
			<a href="../../librarian/showalllibrarian">Show All Librarian</a>
		</div>
		<div class="links">
			<a href="../../adminlogout.jsp">Logout</a>
		</div>

	</div>

	<div
		style="float: left; height: 650px; width: 80%; background-image: url('../../Library Picture.jpg'); background-size: 1215px 650px;">
		<!-- <img src="background-modified.jpg" width="1215px" height="650px" /> -->

		<div class="libreg">
			<h1>Result Page</h1>
			<br /> <br />
			<c:choose>
				<c:when test="${status eq 'success'}">
					<h1 style="color: green; text-align: center">Record Updated
						Successfully</h1>
					<div class="links">
						<a href="../../updatelibrarian.html">Update Librarian</a>
					</div>
					<div class="links">
						<a href="../../adminwindow.jsp">Go Back</a>
					</div>
				</c:when>
				<c:otherwise>
					<h1 style="color: red; text-align: center">Record Not Updated
					</h1>

					<div class="links">
						<a href="../../updatelibrarian.html">Update Librarian</a>
					</div>
					<div class="links" style="width: 300px;">
						<a href="../../adminwindow.jsp">Go Back</a>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</body>
</html>