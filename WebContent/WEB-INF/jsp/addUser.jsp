<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加用戶页面</title>
</head>
<body>

	<h1>用户添加</h1>
	<form:form action="addUser" method="post" modelAttribute="user">

UserName:<form:input path="userName" />
		<hr />
		<%
			Map<String, Object> sexes = new HashMap<>();
				sexes.put("男", "男");
				sexes.put("女", "女");
				request.setAttribute("sexes", sexes);
		%>
Sex:
<form:radiobuttons path="userSex" items="${requestScope.sexes}" />
		<hr />
UserAge:<form:input path="userAge" />
		<hr />
		<input type="submit" value="添加" />
	</form:form>

</body>
</html>