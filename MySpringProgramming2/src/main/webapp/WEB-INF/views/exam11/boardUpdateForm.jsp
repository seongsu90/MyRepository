<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp2/"><IMAGE SRC="/myapp2/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Exam11_게시물 수정</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		
		<form method="post" action="/myapp2/exam11/boardUpdate">
			글쓴이: <input type="text" name="bwriter" value="${board.bwriter}"/><br/> <%--board는 컨트롤러가 넘겨준다 --%>
			제목: <input type="text" name="btitle" value="${board.btitle}"/><br/>
			내용: <textarea rows="5" cols="20" name="bcontent">${board.bcontent}</textarea><br/>
			<input type="submit" value="글수정">
		</form>		
	</body>
</html>