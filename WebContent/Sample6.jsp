<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="cb" class="mybeans.CarBean" scope="request"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>title</title>
</head>
<body>
	<div style="text-align: center;">
		<h2>御礼</h2>
		<jsp:getProperty property="cardata" name="cb"/>
	</div>
</body>
</html>