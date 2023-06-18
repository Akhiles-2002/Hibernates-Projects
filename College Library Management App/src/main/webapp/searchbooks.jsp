<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body {
	margin: 0px;
	color: white;
	background-image: url('Library Picture.jpg');
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
	background-color: gray;
	border: 2px solid black;
}

a:hover {
	color: black;
}

a {
	color: white;
	text-decoration: none;
}

h1{
	text-align: center;
}

.libreg {
	color: black;
	height: 500px;
	width: 500px;
	margin-top: 50px;
	background-color: lightblue;
	opacity: 0.8;
	margin-left: 350px;
	border-radius: 20px;
}

tr{
padding: 20px;
}

input {
	border-radius: 10px;
}
</style>
</head>
<body>

	<div class="libreg">
		<h1>Search Book</h1>
		<br /> <br />
		<form method="post" action="./bookscontroller/searchbook">
			<table cellpadding="10px" align="center">
				
				<tr>
					<th>Book Id</th>
					<td><input type="text" name="bid" /> </td>
					<td colspan="2" align="center"><input type="submit" value="Search" /> </td>
				</tr>

			</table>		
		</form>
	</div>

</body>
</html>