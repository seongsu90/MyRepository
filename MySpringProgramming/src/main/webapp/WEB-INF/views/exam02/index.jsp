<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp22/"><IMAGE SRC="/myapp22/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>exam02</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<a href="/myapp22/exam02/join?mid=user1&mname=홍길동&mage=30" >가입</a><br/>
		<a href="/myapp22/exam02/order?pid=5&pname=마우스&pprice=5000&pcompany=삼성" >주문</a><br/>
		<a href="/myapp22/exam02/write?bno=10&title=게시물제목&content=게시물내용&hitcount" >글쓰기</a><br/>
		<a href="/myapp22/exam02/update?bno=10&title=게시물제목&content=게시물내용&count=3" >수정</a><br/>
		<a href="/myapp22/exam02/send?bno=20&title=게시물제목&content=게시물내용&hitcount=5" >보내기</a><br/>
	</body>
</html>