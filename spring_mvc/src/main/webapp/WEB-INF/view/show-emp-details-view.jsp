<%--<%@ taglib prefix="coponent" uri="http://java.sun.com/jstl/core_rt" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h2 style="margin-bottom: 15px">Dear Employee, you are WELCOME!!!</h2>

<div style="display: flex; flex-direction: column">
    <p style="margin-bottom: 15px">Your name: ${employee.name}</p>
    <p style="margin-bottom: 15px">Your surname: ${employee.surname}</p>
    <p style="margin-bottom: 15px">Your salary: ${employee.salary}</p>
    <p style="margin-bottom: 15px">Your department: ${employee.department}</p>
    <p style="margin-bottom: 15px">Your car: ${employee.carBrand}</p>
    <p style="margin-bottom: 15px">Your languages:</p>

        <ul>
            <c:forEach var="lang" items="${employee.languages}">
                <li> ${lang}</li>
            </c:forEach>
        </ul>


    <a href="/employee/">HOME</a>
</div>


</body>
</html>