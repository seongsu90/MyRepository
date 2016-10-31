<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<!-- External Style Sheet // 이걸 많이 쓴다. 다른 jsp와도 여결 가능. 재사용 가능-->
		<link rel="stylesheet" type="text/css" href="05_style.css">
		
		<!-- Internal Style Sheet //현재 jsp에서만 사용 가능. -->
		<style type="text/css">
			.menu {
				background-color: #FFFFFF;
			}
			.menu li{
				color: orange;
			}
		</style>
		
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>CSS Location</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		
		<header>제목</header>
		<p>내용</p>
		
		<a href="http://tomcat.apache.org">톰캣</a>
		
		<div class="menu">
			<ul>
				<li>menu1</li>
				<li>menu2</li>
				<li>menu3</li>
			</ul>
		</div>
		
		<div style="background-color:yellow; text-align: center;">
			본문 내용입니다.
		</div>
		
	</body>
</html>