<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="ManageChActionadd.action" method="post">
栏目：<br>
	栏目名称：<s:textfield name="channel.name" ></s:textfield><br>
	栏目说明：<s:textfield name="channel.content" ></s:textfield><br>
<s:submit></s:submit>
</s:form>
</body>
</html>