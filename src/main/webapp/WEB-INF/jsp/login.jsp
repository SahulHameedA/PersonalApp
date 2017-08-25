<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<%@ page isELIgnored="false" %>

<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css" />

</head>

<body>

<h2>Login Form</h2>
<h4> <font color="red"> ${errorMessage} </font> </h4>

<form method="POST" action="login">
  <div class="imgcontainer">
    <img src="<%=request.getContextPath()%>/resources/images/img_avatar2.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label><b>Username</b></label>
    <input name="userName" type="text" placeholder="Enter Username" required/>

    <label><b>Password</b></label>
    <input name="password" type="password" placeholder="Enter Password" required/>
        
    <button type="submit">Login</button>
    <input type="checkbox" checked="checked"> Remember me
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>
</html>