<%--
  Created by IntelliJ IDEA.
  User: Виталий
  Date: 27.07.2022
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Title</title>
    <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        .footer {
            position: absolute;
            bottom: 0;
            width: 100%;
            height: 60px;
            background-color: #f5f5f5;
        }

        .container {
            width: auto;
            max-width: 680px;
            padding: 0 15px;
        }

        div {
            border-radius: 15px;
            border: 4px double darkgoldenrod;
            opacity: 0.5;
            margin-bottom: 5%;
            margin-left: 30%;
            margin-right: 5%;
            margin-top: 1%;
        }

        .op:hover {
            opacity: 1
        }

        body {
            background-image: url("img/shutterstock.jpg");
        }
    </style>
</head>
<body>
<div class="op" style="background-color:white; position:absolute; left:20px; top:20px">
    <!--<p><font color="red">${errorMessage}</font></p>
<form method="POST" action="PersonsList">
    <label style="float:right; width:500px; padding:10px">
                <span style="font-family: LilyUPC; color:darkgoldenrod; font-size:50px">
                    <center>Registration
        <br>First Name : <br><input name="name" type="text" placeholder="enter your name"/>
    <br>Last Name : <br><input name="surname" type="text" placeholder="enter your last name"/>

    <br>Date of birth : <br><input name="email" type="text" placeholder="enter your date of birth"/>

    <br>Email : <br><input name="date" type="text" placeholder="enter email"/>

    <br>Number phone : <br><input name="number" type="text" placeholder="enter your number"/>

    <br> Password : <br><input name="password" type="password" placeholder="enter your password"/>
    <br>
    <input name="add" type="submit"/></form>

    <table border="1">
        <caption>List of registered Users</caption>
        <tr>
            <th>name</th>
            <th>surname</th>
            <th>email</th>
            <th>date</th>
            <th>number</th>
            <th>password</th>
        </tr>

        <c:forEach items="${group}" var="person">
            <tr><td>${person.name}</td>
                <td> ${person.surname}</td>
                <td> ${person.email}</td>
                <td> ${person.date}</td>
                <td> ${person.number}</td>
                <td> ${person.login}</td>
                <td> ${person.password}</td>
            </tr>
        </c:forEach>

        </td>
        </td>

    </table>-->

    <p><font color="red">${errorMessage}</font</p>
    <form method="POST" action="RegistrationServlet">
        <label style="float:right; width:500px; padding:10px">
                <span style="font-family: LilyUPC; color:darkgoldenrod; font-size:50px">
                    <center>Registration
        <br>First Name : <br><input name="name" type="text" placeholder="enter your name"/>
    <br>Last Name : <br><input name="surname" type="text" placeholder="enter your last name"/>

    <br>Date of birth : <br><input name="email" type="text" placeholder="enter your date of birth"/>

    <br>Email : <br><input name="date" type="text" placeholder="enter email"/>

    <br>Number phone : <br><input name="number" type="text" placeholder="enter your number"/>

    <br>Login : <br><input name="login" type="text" placeholder="enter your login"/>

    <br> Password : <br><input name="password" type="password" placeholder="enter your password"/>
    <br>
    <input name="add" type="submit"/>
    </form>
</div>
</body>
</html>
