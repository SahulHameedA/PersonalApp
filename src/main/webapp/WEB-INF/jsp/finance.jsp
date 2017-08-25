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
<h2> Success, you are in the Finance Page now !  </h2>
<%@ include file="/WEB-INF/jsp/footer.jsp" %>
</body>
</html>
<script>
	document.getElementById("finance").className = "active";
</script>