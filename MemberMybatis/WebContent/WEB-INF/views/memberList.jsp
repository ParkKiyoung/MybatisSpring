<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>아이디</td>
			<td>비번</td>
			<td>이름</td>
			<td>주소</td>
			<td>메모</td>
			<td>틍록일</td>
			<td>삭제</td>
		</tr>
		<c:forEach items="${arr }" var="i">
			<tr>
				<td><a href = "ViewInfo.my?id=${i.id }">${i.id }</a></td>
				<td>${i.pass }</td>
				<td>${i.name }</td>
				<td>${i.addr }</td>
				<td>${i.memo }</td>
				<td>${i.reg_date }</td>
				<td><a href = "delete.my?id=${i.id }" >삭제</a></td>
			</tr>
		</c:forEach>
	</table>
<input type = "button" value = "회원 가입" onclick="location.href='myInsert.my'">
</body>
</html>