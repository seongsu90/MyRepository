<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<style type="text/css">
			body {
				background-image: url("../common/image/paper.gif");
			/* 	background-repeat: no-repeat; */
			}
			.album{
				width: 100px;
				height: 100px;
				background-image: url("../common/image/photo5.jpg");			
				display:inline-block;					
				background-size: 100px 100px;
			}
		</style>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Background 관련 CSS 속성</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<%for(int i=0; i<=10; i++) {%>
		<div class="album"></div>
		<%} %>
	</body>
</html>