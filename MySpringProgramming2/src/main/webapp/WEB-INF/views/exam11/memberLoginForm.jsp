<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp2/"><IMAGE SRC="/myapp2/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Exam11</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		[로그인 폼] <br/>
		<form method="post" action="/myapp2/exam11/memberLogin" > <!-- post방식으로 전하겟다는 의미 -->
			아 이 디 : <input type="text" name="mid" value="fall"/> <br/>
			비밀번호: <input type="password" name="mpassword" value="12345"/> <br/>
				
				<br/>
				
				<input type="submit" value="로그인"/>
		</form>
	</body>
</html>