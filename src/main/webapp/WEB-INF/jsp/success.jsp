<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head> 
<%@ page isELIgnored="false" %>
<title> Success !!! </title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style2.css" />
</head>
<body>
<%@ include file="/WEB-INF/jsp/navmenu.jsp" %>
<h2> Success !!! </h2>
<p> Your name is ${userName} <p>
<p> And your password is ${password} </p>
<%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>