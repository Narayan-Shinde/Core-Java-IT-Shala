<%@ page import="com.itshaala.model.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 19-12-2024
  Time: 09:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Listing Page</title>
</head>
<body>
<h1> Student Listing goes here</h1>
<table style="border: red 1px solid">
    <tr style="border: red 1px solid">
        <td>ID</td>
        <td>Name</td>
        <td>Email</td>
        <td>Age</td>
    </tr>

    <%
        List<Student> studentList = (List<Student>) request.getAttribute("student");
        for (Student student : studentList) {

    %>
    <tr style="border: red 1px solid">
        <td><%=student.getId()%>
        </td>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getEmail()%>
        </td>
        <td><%=student.getAge()%>
        </td>
    </tr>

    <%}%>
</table>
</body>
</html>
