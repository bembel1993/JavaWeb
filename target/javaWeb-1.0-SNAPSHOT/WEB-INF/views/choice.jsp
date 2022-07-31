<%--
  Created by IntelliJ IDEA.
  User: Виталий
  Date: 29.07.2022
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {font-family: Arial, Helvetica, sans-serif;}

        /* Full-width input fields */
        input[type=text], input[type=password] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        /* Set a style for all buttons */
        button {
            background-color: #ecba4b;
            color: white;
            padding: 14px 20px;
            margin: 15px 0;
            cursor: pointer;
            width: 100%;
            margin: 0 auto;
            display: block;
            border: 2px solid #d5a20a;
            border-radius: 12px;
            -webkit-transition-duration: 0.4s; /* Safari */
            transition-duration: 0.4s;
        }
        button:hover {
            opacity: 0.8;
            background-color: #d5a20a;
            border: 2px solid darkgoldenrod;
        }

        /* Extra styles for the cancel button */
        .cancelbtn {
            width: auto;
            padding: 10px 18px;
            background-color: #f44336;
        }

        /* Center the image and position the close button */
        .imgcontainer {
            text-align: center;
            margin: 24px 0 12px 0;
            position: relative;
        }

        img.avatar {
            width: 40%;
            border-radius: 50%;
        }

        .container {
            padding: 16px;
        }

        span.psw {
            float: right;
            padding-top: 16px;
        }

        /* The Modal (background) */
        .modal {
            display: none; /* Hidden by default */
            position: fixed; /* Stay in place */
            z-index: 1; /* Sit on top */
            left: 0;
            top: 0;
            width: 100%; /* Full width */
            height: 100%; /* Full height */
            overflow: auto; /* Enable scroll if needed */
            background-color: rgb(0,0,0); /* Fallback color */
            background-color: rgba(196, 196, 196, 0.4); /* Black w/ opacity */
            padding-top: 60px;
        }

        /* Modal Content/Box */
        .modal-content {

            margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
            border: 0px solid #bababa;
            width: 50%; /* Could be more or less, depending on screen size */
        }

        /* The Close Button (x) */
        .close {
            position: absolute;
            right: 25px;
            top: 0;
            color: #000;
            font-size: 35px;
            font-weight: bold;
        }

        .close:hover,
        .close:focus {
            color: red;
            cursor: pointer;
        }

        /* Add Zoom Animation */
        .animate {
            -webkit-animation: animatezoom 0.6s;
            animation: animatezoom 0.6s
        }

        @-webkit-keyframes animatezoom {
            from {-webkit-transform: scale(0)}
            to {-webkit-transform: scale(1)}
        }

        @keyframes animatezoom {
            from {transform: scale(0)}
            to {transform: scale(1)}
        }

        /* Change styles for span and cancel button on extra small screens */
        @media screen and (max-width: 300px) {
            span.psw {
                display: block;
                float: none;
            }
            .cancelbtn {
                width: 100%;
            }
        }
.divbutton{
    padding-left: 20px;
    padding-top: 200px;
}
        h2{
            text-align: center;
            width: 80%;
            margin: 0px auto;
            color: white;
        }
.coolstyle{
    border-radius: 15px;
    border: 4px double darkgoldenrod;
    opacity: 0.5;
    margin-bottom: 5%;
    margin-left: 30%;
    margin-right: 5%;
    margin-top: 5%;
}
        body{
            background-image: url("img/quantum.jpeg");
            -moz-background-size: 100%; /* Firefox 3.6+ */
            -webkit-background-size: 100%; /* Safari 3.1+ и Chrome 4.0+ */
            -o-background-size: 100%; /* Opera 9.6+ */
            background-size: 100%;

        }
        .maxsize{
            margin: 10%;
            opacity: 0.2;
            background: white;
        }
    </style>
</head>
<body>
<!--<div class="navbar-collapse">
    <ul class="nav navbar-nav">
        <li class="active"><a href="RegistrationServlet">Reg</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
        <li><a href="LoginServlet">Login</a></li>
    </ul>
</div>-->
</div>
<div class="divbutton">
<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">
    <span style="font-family: LilyUPC; color:#ffffff; font-size:50px">Enter for choice
</button>
</div>

<div id="id01" class="modal">

    <form class="modal-content animate">


            <button>
                <span style="font-family: LilyUPC; color:#fcfcfc; font-size:50px">
                 <a href="LoginServlet">LogIn</a>
            </button>
            </br>

            <button>
                <span style="font-family: LilyUPC; color:deeppink; font-size:50px">
                    <a href="RegistrationServlet">Registration</a>
            </button>

    </form>
</body>
</html>
