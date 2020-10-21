<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="processRequest">
		<h1 align="center">Mom's Cafe</h1>
		<hr>
		<div align="center">
			<label for="item_name">Item Name:</label> 
			<input type="text"
				name="foodType" placeholder="Food type" id="item_name" /> <br /> <input
				type="submit" value="Place request" />
		</div>
	</form>
</body>
</html>