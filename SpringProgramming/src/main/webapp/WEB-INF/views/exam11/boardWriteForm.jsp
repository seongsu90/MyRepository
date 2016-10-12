<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp/"><IMAGE SRC="/myapp/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Exam11</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		
		<form method="post" action="/myapp/exam11/boardWrite">
			글쓴이: <input type="text" name="bwriter" value="늦가을"/><br/>
			제목: <input type="text" name="btitle" value="단풍은 왔는가"/><br/>
			내용: <textarea rows="5" cols="20" name="bcontent">단풍이 오기도 전에 겨울이 왔어요.</textarea><br/>
			<input type="submit" value="글쓰기">
		</form>		
	</body>
</html>