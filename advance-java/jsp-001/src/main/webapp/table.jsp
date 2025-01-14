<html>
<body>
<h2>Hello World!</h2>
<table style="border: 1px solid red">
    <%
        for (int row = 1; row <= 10; row++) {
    %>
    <tr>
        <%
            for (int col = 1; col <= 100; col++) {
        %>
        <td>
            <%out.print(row * col); %>
        </td>
        <% }%>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
