<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/821_kadai/RegiterResultServlet" method="get">

日付<input type=text name=date>
収入<input type=text name=income>
支出<input type=text name=spending>
残高<input type=text name=balanceg>
項目<input type=text name=type>
<input type="submit" value="登録する"class="button">
</form>
</body>
</html>