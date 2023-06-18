<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Registration Status</title>
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
            a{
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
        <h1 style=" color: white; ">College E-Library</h1>
        </header>
        <c:choose>
            <c:when test="${admin ne null}">
                <h1 style="color: green; text-align: center;">Registration Successfully</h1>
                <h1>Admin Details</h1>
                <table style="border: 1px solid black; cellpadding:10px; text-align: center; ">
                    <tr>
                        <th>Admin ID</th>
                        <td>${admin.adminId}</td>
                    </tr>
                    <tr>
                        <th>Full Name</th>
                        <td>${admin.fullname}</td> 
                    </tr>
                    <tr>
                        <th>Email Id</th>
                        <td>${admin.emailId}</td>                 
                    </tr>
                    <tr>
                        <th>Contact No.</th>
                        <td>${admin.contactno}</td>                 
                    </tr>
                    <tr>
                        <th>Password</th>
                        <td>${admin.password}</td>
                    </tr>
                </table>
                <br/><br/>
                <a href="../chooserole.html">Go to Login Page</a>
            </c:when>
            <c:otherwise>
                <h1 style="color: red; text-align: center;">Registration Failed</h1>
            </c:otherwise>
        </c:choose>
    </body>
</html>
