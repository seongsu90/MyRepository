<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<script type="text/javascript" src="../common/js/jquery-1.12.4.min.js"></script>
		<script type="text/javascript">
			window.onload=function(){
				console.log("0");
			};
			
			$(document).on("ready",function() {
				console.log("1");
			});
			
			$(document).ready(function() {
				console.log("2");
			});
			
			$(function() {
				console.log("3");
			});
		</script>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Ready 이벤트 처리</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
	<img src="../common/image/photo1.jpg">

	</body>
</html>