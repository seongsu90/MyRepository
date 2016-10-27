<%@ page  contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myweb/"><IMAGE SRC="/myweb/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>로그인</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<form method="post">
			아이디: <input type="text" name="mid" value="${findMid}"/>
			<c:if test= "${error == 'LOGIN_FAIL_MID'}"> * 아이디가 존재하지 않음 </c:if>
			 <br/><br/>
			패스워드: <input type="password" name="mpassword"/>
			<c:if test= "${error == 'LOGIN_FAIL_MPASSWORD'}"> * 패스워드가 틀림 </c:if>
			 <br/><br/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" value="로그인"/> 
		</form>
		<a href="${pageContext.servletContext.contextPath}/member/join">회원 가입</a> <%--절대경로 --%>
		<br/>
		<a href="findMid">아이디 찾기</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%--상대경로 --%>
		비밀번호 찾기
		
	</body>
</html>