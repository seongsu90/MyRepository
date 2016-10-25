<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp/"><IMAGE SRC="/myapp/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Exam12</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<b>[공통]</b><br/>
		- 메이븐 설정 파일 수정(String JDBC와 커넥션 풀의 의존성 라이브러리 추가)<br/><br/>
		
		<b>1) 웹 애플리케이션이 커넥션 풀을 가지고 있는 경우 </b><br/>
		- 스프링 설정 파일(servlet-context.xml)  설정<br/><br/>
		
		<b>2) Tomcat(WAS)가 커넥션 풀을 가지고 있는 경우</b><br/>
		- Tomcat에서 커넥션 풀 설정(참조: )<br/>
		- 웹 애플리케이션 DD 설정(참조: )<br/>
		- 스프링 설정 파일(servlet-context.xml)  설정<br/><br/>
		
		<b>[테스트]</b><br/>
		<a href="/myapp/exam12/join">회원가입</a>
	</body>
</html>