<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<h2 style="margin-bottom: 30px">Dear Employee, Please enter your details</h2>


<form:form action="showDetails" modelAttribute="employee">

    <div style="display: flex;flex-direction: column">
        <div class="inputs">
            <span>Name</span>
            <form:input path="name"/>
            <form:errors path="name" cssClass="errors" />
        </div>
        <div class="inputs">
            <span>Surname</span>
            <form:input path="surname"/>
            <form:errors path="surname" cssClass="errors"/>
        </div>
        <div class="inputs">
            <span>Salary</span>
            <form:input path="salary"/>
            <form:errors path="salary" cssClass="errors"/>
        </div>
        <div class="inputs">
            <span>Department</span>
            <form:select path="department">
                <form:options items="${employee.departments}"/>
            </form:select>
        </div>
        <div class="inputs">
            <span>Which car do you want?</span>
            <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
        </div>
        <div class="inputs">
            <span>Foreign Languages</span>
            <form:checkboxes path="languages" items="${employee.languageList}"/>
        </div>
        <div class="inputs">
            <span>Phone number</span>
            <form:input path="phoneNumber" />
            <form:errors path="phoneNumber" cssClass="errors"/>
        </div>
        <div class="inputs">
            <span>Email</span>
            <form:input path="email" />
            <form:errors path="email" cssClass="errors"/>
        </div>


        <button type="submit">Submit</button>
    </div>

</form:form>

<style>
    .inputs{
        margin-bottom: 15px;
    }
    button{
        max-width: 100px;
    }
    .errors{
        color: red;
    }
</style>

</body>
</html>