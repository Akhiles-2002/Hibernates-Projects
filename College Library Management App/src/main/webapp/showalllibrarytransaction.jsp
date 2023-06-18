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
	background-color: gray;
}

header {
	margin: 0px;
	padding: 5px;
}

.links {
	background-color: black;
	height: 30px;
	width: 400px;
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

.libreg {
	color: black;
	/* height: 500px; */
	width: 800px;
	margin-left: 200px;
	background-color: lightblue;
	opacity: 0.7;
	/* margin-left: 200px;  */
	text-align: center;
}

input {
	border-radius: 10px;
}

th {
	color: white;
}
</style>
</head>
<body>
	

	<div class="libreg">
		<h1>Library Transactions</h1>
		<br /> 
		<c:choose>
			<c:when test="${showAllLibraryTransaction ne null}">
				<table border="1" cellpadding="10px" align="center">
					<tr style="background-color: black;">
						<th>Student Id</th>
						<th>Book Id </th>
						<th>Issue Date</th>
						<th>Due Date</th>
						<th>Submit Date</th>
						<th>Fine</th>
					</tr>
					<c:forEach var="list" items="${showAllLibraryTransaction }">
						<tr>
							<td>${list.sId }</td>
							<td>${list.bId }</td>
							<td style="color:blue;">${list.issueDate }</td>
							<td style="color:red;">${list.dueDate }</td>
							<td style="color:green;">${list.submitDate }</td>
							<td>${list.fine}</td>
						</tr>
					</c:forEach>
				</table><br />
			</c:when>
		</c:choose>

	</div>

</body>
</html>