<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<%@ page isELIgnored="false" %>

<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css" />

</head>

<body>

<h2>Login Form</h2>
<h4> <font color="red"> ${errorMessage} </font> </h4>

<form:form method="POST" action="login" commandName="login">
  <div class="imgcontainer">
    <img src="<%=request.getContextPath()%>/resources/images/img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <form:label path="userName"><b>Username</b></form:label>
    <form:input path="userName" type="text" placeholder="Enter Username" required="required"/>
    <form:errors path="userName" style="color:red;" /> <br>
		
    <form:label path="password"><b>Password</b></form:label>
    <form:input path="password" type="password" placeholder="Enter Password" required="required"/>
    <form:errors path="password"  style="color:red;" /> <br>    
        
    <button type="submit">Login</button>
    <input type="checkbox" checked="checked"> Remember me
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form:form>

</body>
</html>