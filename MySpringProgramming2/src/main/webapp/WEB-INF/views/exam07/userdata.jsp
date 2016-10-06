<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp2/"><IMAGE SRC="/myapp2/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Exam07 </b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		[HttpServletRequest]를 이용해서 찾기<br/>
		데이터1: <%=request.getAttribute("data1") %><br/>
		데이터2: <%=request.getAttribute("data2") %><br/><br/>
		
		[HttpSession]를 이용해서 찾기<br/>
		데이터1:<%=session.getAttribute("data1") %><br/>
		데이터2:<%=session.getAttribute("data2") %><br/><br/>
		
		[EL]를 이용해서 찾기<br/>
		데이터1:<br/>
		데이터2:<br/>
		
	</body>
</html>