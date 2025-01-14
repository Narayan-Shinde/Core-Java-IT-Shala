<html>
<body>
<h2>Calculation at jsp file</h2>
<%
    int number1 = Integer.parseInt(request.getParameter("number1"));
    int number2 = Integer.parseInt(request.getParameter("number2"));
    String operator = request.getParameter("operator");
    switch (operator) {
        case "+" : out.println(number1 + number2);break;
        case "-" : out.println(number1 - number2);break;
        case "*" : out.println(number1 * number2);break;
        case "/" : out.println(number1 / number2);break;
        case "%" : out.println(number1 % number2);break;
        default : out.println("invalid input or operator");break;
    }
%>
</body>
</html>
