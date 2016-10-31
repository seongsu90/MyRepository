<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Html/Css_Block 엘리먼트</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<h1>Block</h1>
		<div style="background-color:#ff0000; height:50px; border: 1px solid green"></div>
		<div style="background-color:#0000ff; height:50px; border: 1px solid yellow"></div>
		<h1 style="background-color:#0000ff; height:50px; border: 1px solid yellow">제목</h1>
		<p style="background-color:#0000ff; height:50px; border: 1px solid yellow">제목</p>
		<form style="background-color:#0000ff; height:50px; border: 1px solid yellow"></form>
		
		<h1>In-line</h1>
		<span style="color:red; border: 1px solid green">Important</span>
		<span style="color:green">Important</span>
		<span style="color:blue">Important</span>
		<img src="../common/image/jq.jpg" style="border: 1px solid green"/>
		
		<h1>Block -> Inline</h1>
		<div style="height:50px; width:200px; border:1px solid green; display:inline-block;"></div>
		<div style="height:50px; width:200px; border:1px solid red; display:inline-block;"></div>
		
		<h1>Example</h1>
		<div style="height:50px; width:200px; border:1px solid green; display:inline-block;">
			<div style="background-color:#ff0000; height:30px;"></div>
		</div>
	</body>
</html>