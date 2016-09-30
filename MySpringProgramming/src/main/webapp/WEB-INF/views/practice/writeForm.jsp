<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp22/"><IMAGE SRC="/myapp22/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Practice </b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		[글쓰기 폼]<br/><br/>
		<form action="/myapp22/practice/write" method=post>
		<table style="width:20%">
		<tr>
			<th>카테고리</th>
			<th><select name="category" ><option>질문</option><option>답변</option><option>자유</option></select></th>
		</tr>
		<tr>
			<th>아이디</th>
			<th><input type="text" name="bid" value="홍길동"></input></th>
		</tr>
		<tr>
			<th>비밀번호</th>
			<th><input type="password" name="password" value="12345"></input></th>
		</tr>
		<tr>
			<th>제목</th>
			<th><input type="text" name="title" value="날아라 홍길동"></input></th>
		</tr>
		<tr>
			<th>내용</th>
			<th><textarea rows="15" cols="22" name="content" >글자를 입력해주세요</textarea></th>
		</tr>
		<tr>
			<th align ="right"><input type="submit" value="제 출"></th><th><input type="reset"></th>
			
		</tr>
		</table>
		
		</form>
	</body>
</html>