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
		[회원 정보] <br/><hr/>
		아이디: ${member.mid}<br/>
		이름: ${member.mname}<br/>
		비밀번호: ${member.mpassword}<br/>
		나이: ${member.mage}<br/>
		생년월일: ${member.mbirth}<br/><br/>
		
	</body>
</html>