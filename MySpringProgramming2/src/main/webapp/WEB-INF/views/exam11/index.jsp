<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp2/"><IMAGE SRC="/myapp2/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>exam10</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
			1)<a href="/myapp2/exam11/memberJoin" >회원가입</a><br/>
			2)<a href="/myapp2/exam11/memberLogin">회원 로그인</a><br/>
			3)<a href="/myapp2/exam11/memberLogout">회원 로그아웃</a><br/>
			<br/>
			4)<a href="/myapp2/exam11/boardWrite">게시물 쓰기</a><br/>
			5)<a href="/myapp2/exam11/boardList">게시물 목록</a><br/>
			6)<a href="/myapp2/exam11/boardView?bno=5">게시물 보기</a><br/>
			7)<a href="/myapp2/exam11/boardUpdate?bno=5">게시물 수정</a><br/>
			8)<a href="/myapp2/exam11/boardDelete?bno=5">게시물 삭제</a><br/>
			
	</body>
</html>