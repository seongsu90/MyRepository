<%@ page  contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp2/"><IMAGE SRC="/myapp2/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Exam11_게시물목록 </b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<table style="border-collapse: collapse; border: 1px solid black;width: 600px">
			<tr style="background-color:#FFADEF">
				<td style="border: 1px solid black;">제목</td> 
				<td style="border: 1px solid black;">내용</td> 
				<td style="border: 1px solid black;">글쓴이</td>
			</tr>
			
			
			<c:forEach var="board" items='${boardlist}'> 
				<tr>
					<td style="border: 1px solid black;">${board.btitle}</td> 
					<td style="border: 1px solid black;">${board.bcontent}</td>
					<td style="border: 1px solid black;">${board.bwriter}</td>
				</tr>
			</c:forEach>
			
			 
		</table> 
		<!-- ${board.title} getter 메소드를 통해 가져온다. -->
	</body>
</html>