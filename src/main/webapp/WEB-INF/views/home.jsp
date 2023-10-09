<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
</head>
<body>

<h1>home.jsp</h1>
<hr>

<h3>Hello</h3>

<h3>접속된 DB의 버전 : ${version }</h3>
<a href="login">로그인 하러 가기 </a>

</body>
</html>