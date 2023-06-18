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
	width: 500px;
	background-color: lightblue;
	border: 2px solid;
	border-radius: 12px;
	opacity: 0.9;
	margin-left: 300px;
	padding-left: 150px;
	margin-top: 30px;
	text-align: center;
}

input {
	border-radius: 10px;
}
</style>

</head>
<body bgcolor="gray">

		<!-- This is Header -->
	<header
		style=" height: 90px; background-color: purple; border-bottom: 5px solid white;">
		<h1 align="center">College E-Library Management App</h1>
	</header>

	<!--For Menu Option to the Admin  -->
	<div
		style="background-color: honeydew; height: 650px; width: 20%; float: left;">

		<div class="links">
			<a href="adminwindow.jsp">ADMIN</a>
		</div>

		<div class="links">
			<a href="librarianregistration.jsp">Register Librarian</a>
		</div>
		<div class="links">
			<a href="librariansearch.html">Search Librarian</a>
		</div>
		<div class="links">
			<a href="updatelibrarian.html">Update Librarian</a>
		</div>
		<div class="links">
			<a href="librariandelete.html">Delete Librarian</a>
		</div>
		<div class="links">
			<a href="./librarian/showalllibrarian">Show All Librarian</a>
		</div>
		<div class="links">
			<a href="adminlogout.jsp">Logout</a>
		</div>

	</div>

	<div
		style="float: left; height: 650px; width: 80%; background-image: url('../Library Picture.jpg'); background-size: 1215px 650px;">
		<!-- <img src="background-modified.jpg" width="1215px" height="650px" /> -->

		<div class="libreg">
			<h1>Edit Librarian</h1>
			<c:choose>
				<c:when test="${searchLibrarian ne null}">
					<br />
					<br />
					<form method="post" action="./librarian/update">
						<table cellpadding="10px">
							<tr>
								<th>Id</th>
								<td><input type="text" name="lid"
									value="${searchLibrarian.libId}" readonly="readonly" /></td>
							</tr>
							<tr>
								<th>Name</th>
								<td><input type="text" name="lname"
									value="${searchLibrarian.fullname}" /></td>
							</tr>
							<tr>
								<th>Mail Id</th>
								<td><input type="text" name="lmailid"
									value="${searchLibrarian.mailid}" /></td>
							</tr>
							<tr>
								<th>Contact No.</th>
								<td><input type="text" name="lcontactno"
									value="${searchLibrarian.contactno}" /></td>
							</tr>
							<tr>
								<th>Set Password</th>

								<td><input type="password" name="lpassword"
									value="${searchLibrarian.password}" /></td>
							</tr>
							<tr>
								<td colspan="2" align="center"><input type="submit"
									value="Update" style="width: 150px; height: 30px;" /></td>
							</tr>
						</table>
					</form>
				</c:when>
				<c:otherwise>
					<h1 style="color: red; text-align: center">Record Not
						Available</h1>

					<div class="links" style="width: 300px;">
						<a href="../updatelibrarian.html">Update Librarian</a>
					</div>

					<div class="links" style="width: 300px;">
						<a href="../adminwindow.html">Go Back</a>
					</div>

				</c:otherwise>
			</c:choose>
		</div>

	</div>
</body>
</html>

