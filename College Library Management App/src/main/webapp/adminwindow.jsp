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
	color: white;
}

header {
	margin: 0px;
	padding: 5px;
}

.links {
	background-color: lightblue;
	height: 30px;
	text-align: center;
	padding: 10px;
	border: 1px solid gray;
	border-radius: 15px;
	padding: 5px;
	margin: 15px;
	padding: 5px;
}

.links:hover {
	background-color: cyan;
}

a:hover {
	color: blue;
}

a {
	color: black;
	text-decoration: none;
}
</style>

</head>
<body bgcolor="gray">

	<c:choose>
		<c:when test="${'success' eq status}">

			<header
				style="height: 100px; background-color: navy; border-bottom: 5px solid gray;">
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

			<!-- Body  -->
			<div
				style="float: left; height: 650px; width: 80%; background-image: url('../Library Picture.jpg'); background-size: 1215px 650px;">

				<p style="font-size: 30px; color: yellow; text-align: center">Welcome
					To The Library</p>
			</div>
		</c:when>
		<c:otherwise>
			<jsp:forward page="adminlogin.jsp"></jsp:forward>
		</c:otherwise>
	</c:choose>
</body>
</html>