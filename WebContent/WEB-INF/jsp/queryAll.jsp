<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
<title>查詢所有页面</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>UserName</th>
				<th>UserSex</th>
				<th>UserAge</th>
				<th>Operator</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${requestScope.users.size()>0 }">
					<c:forEach items="${requestScope.users}" var="user">
						<tr>
							<td>${user.id }</td>
							<td>${user.userName }</td>
							<td>${user.userSex }</td>
							<td>${user.userAge }</td>
							<td><a
								href="delete?id=${user.id}">Delete</a>
								<a
								href="queryOne?id=${user.id}">Update</a>
							</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>没有人</c:otherwise>
			</c:choose>
		</tbody>
	</table>
</body>
</html>