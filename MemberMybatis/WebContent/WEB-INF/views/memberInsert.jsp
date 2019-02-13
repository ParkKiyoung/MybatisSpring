<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h2>회원가입</h2>
   <form action = "myInsert.my" name = "form" method="post">
      <table>
         <tr>
            <th>아이디</th>
            <td><input type="text" id="id" name="id" readonly></td>
         </tr>
         <tr>
            <th>비밀번호</th>
            <td><input type="text" id="pass" name="pass"></td>
         </tr>
         <tr>
            <th>성명</th>
            <td><input type="text" id="name" name="name"></td>
         </tr>
         <tr>
            <th>주소</th>
            <td><input type="text" id="addr" name="addr"></td>
         </tr>
         <tr>
            <th>메모</th>
            <td><textarea cols="50" rows="20" id="memo" name="memo"></textarea></td>
         </tr>
         <tr align="center">
            <td colspan="2"><input type = "submit" value = "가입"></td>
         </tr>
      </table>
   </form>
   <a href = "myList.my">리스트</a>
</body>
</html>