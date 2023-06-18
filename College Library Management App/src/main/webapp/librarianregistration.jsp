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

input{
	border-radius : 10px;
	margin-left : 10px;
}

.libreg {
	color: black;
	height: 500px;
	width: 500px;
	background-color: cyan;
	opacity: 1.0;
	margin-left: 300px;
	text-align: center;
	padding-left: 100px;
	border-radius: 20px;
}
</style>

</head>
<body>

	<header
		style="height: 70px; background-color: purple; border-bottom: 5px solid voilet;">
		<h1 align="center">College E-Library Management App</h1>
	</header>


	<div
		style="background-color: Honeydew; height: 650px; width: 20%; float: left;">

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
		style="float: left; height: 650px; width: 80%; background-size: 1215px 650px;">
		<!-- <img src="background-modified.jpg" width="1215px" height="650px" /> -->

		<div class="libreg">
			<h1>Librarian Registration</h1>
			<br /> <br />
			<form method="post" action="./librarian/regi">
				<table cellpadding="10px">
					<tr>
						<th>Full Name ::</th>
						<td><input type="text" name="fullname" /></td>
					</tr>
					<tr>
						<th>E-Mail Id ::</th>
						<td><input type="email" name="emailid" /></td>
					</tr>
					<tr>
						<th>Contact No. ::</th>
						<td><input type="text" name="contactno" /></td>
					</tr>
					<tr>
						<th>Password ::</th>

						<td><input type="password" name="password" /></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="Submit" style="width: 150px; height: 30px;" /></td>
					</tr>
				</table>
			</form>
		</div>




	</div>


</body>
</html>


