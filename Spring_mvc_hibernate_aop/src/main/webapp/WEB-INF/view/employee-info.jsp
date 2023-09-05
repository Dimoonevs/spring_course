<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Info</title>
</head>
<body>
<h2 class="top">Info Employee</h2>


<form:form action="saveEmployee" cssClass="form" modelAttribute="employee">
    <form:hidden path="id"/>
    <div class="input_contaner">
        <span>Name</span>
        <form:input path="name"/>
    </div>
    <div class="input_contaner">
        <span>Surname</span>
        <form:input path="surname"/>
    </div>
    <div class="input_contaner">
        <span>Department</span>
        <form:input path="department"/>
    </div>
    <div class="input_contaner">
        <span>Salary</span>
        <form:input path="salary"/>
    </div>

    <input type="submit" value="OK" class="ui-button">

</form:form>

</body>
<style>
    .top{
        margin-bottom: 30px;
    }
    .input_contaner{
        margin-bottom: 15px;
    }
    .form{
        display: flex;
        flex-direction: column;
    }
    .ui-button{
        max-width: 100px;
    }


</style>
</html>