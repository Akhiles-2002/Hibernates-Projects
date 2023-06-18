<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Issue</title>
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

input {
	border-radius: 10px;
}
</style>


</head>
<body>
	<div class="libreg">
		<br />
		<h1 style="text-align: center">Submit Book</h1>
		<br /> <br />
		<form method="post" action="./booksubmit">
			<!--  ./libtransactioncontroller/issuebook -->
			<table cellpadding="10px" align="center">

				<tr>
					<th>Student Id</th>
					<td><input type="text" name="sid"  <c:choose><c:when test="${submitBook ne 'success' }"> value="${sid }"</c:when></c:choose> /></td>
				</tr>
				<tr>

					<th>Book Id</th>
					<td><input type="text" name="bid"  <c:choose><c:when test="${issueBook ne 'success' }"> value="${bid }"</c:when></c:choose> /></td>
				</tr>
				<tr>
					<th>Submit Date</th>
					<td><input type="date" name="submitdate"  <c:choose><c:when test="${issueBook ne 'success' }"> value="${submitdate }"</c:when></c:choose>  /></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Submit Book" /></td>
				</tr>
			</table>

			<c:choose>
				<c:when test="${submitBook eq 'success' }">
					<h2 style="color: Green; text-align: center;">Book Submitted
						Successfully</h2>
				</c:when>
				<c:when test="${submitBook eq 'fail' }">
					<h3 style="color: red; text-align: center;">*Entered Id is Incorrect </h3>
				</c:when>
				<c:when test="${submitBook eq 'book already submitted' }">
					<h3 style="color: red; text-align: center;">*This Book is Already Submitted</h3>
				</c:when>
			</c:choose>
		</form>
	</div>

</body>
</html>