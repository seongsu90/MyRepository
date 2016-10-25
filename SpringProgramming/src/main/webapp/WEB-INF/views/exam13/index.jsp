<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp/"><IMAGE SRC="/myapp/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Exam13</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<b>[설정]</b><br/>
		- 스프링 설정 파일(servlet_context.xml)에 JdbcTemplate 설정 <br/><br/>
		
		<b>[테스트]</b><br/>
		<a href="/myapp/exam13/memberJoin">회원가입</a> <br/>
		<a href="/myapp/exam13/memberInfo?mid=fall">회원정보</a>
	</body>
</html>