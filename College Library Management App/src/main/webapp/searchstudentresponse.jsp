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
	margin-left: 200px;
	margin-top: 100px;
	/* height: 500px; */
	width: 700px;
	background-color: Lightblue;
	opacity: 0.8;
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
		<h1>All Student Record</h1>
		<br /> 
		<c:choose>
			<c:when test="${searchStudents ne null}">
				<table border="1" cellpadding="5px" align="center">
					<tr style="background-color: black;">
						<th>Id</th>
						<th>Name</th>
						<th>Mail Id</th>
						<th>Contact No</th>
						<th>Password</th>
						<th>Gender</th>
						<th>Department</th>
						<th>Course</th>
					</tr>
						<tr>
							<td>${searchStudents.sid }</td>
							<td>${searchStudents.sname }</td>
							<td>${searchStudents.mailid }</td>
							<td>${searchStudents.contactno }</td>
							<td>${searchStudents.password }</td>
							<td>${searchStudents.gender}</td>
							<td>${searchStudents.department }</td>
							<td>${searchStudents.course }</td>
						</tr>
				</table><br />
			</c:when>
			<c:otherwise>
				<h1 style="color: red; text-align: center">Student Record Not Found</h1>
				<div class="links">
					<a href="../searchstudent.jsp">Search Student</a>
				</div>

				<div class="links">
					<a href="../welcome.html">Go Back</a>
				</div>
			</c:otherwise>
		</c:choose>

	</div>


</body>
</html>