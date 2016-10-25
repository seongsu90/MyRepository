<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myweb/"><IMAGE SRC="/myweb/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>■■ SpringFinalProgramming ■■</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
				1. <a href="<%=pageContext.getServletContext().getContextPath()%>/member/login">로그인</a><br/> <!-- 표현식 -->
				2. <a href="${pageContext.servletContext.contextPath}/freeboard/list">일반 게시판</a><br/> <!-- 표현 언어라고 한다. -->
				3. <a href="${pageContext.servletContext.contextPath}/photoboard/list">포토 게시판</a><br/>
	</body>
</html>
