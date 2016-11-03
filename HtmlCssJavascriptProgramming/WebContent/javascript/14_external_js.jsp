<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<script type="text/javascript" src="14_library.js"></script>
		<script type="text/javascript">
				function calculator(){
				var x = parseInt(document.querySelector("#x").value);
				var y = parseInt(document.querySelector("#y").value);
				var result = $.sum(x,y);
				document.querySelector("#result").value=result;
			}
		</script>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>외부 자바스크립트 파일 로딩</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
			<input type="text" id="x"/> 에서
			<input type="text" id="y"/> 까지의 합
			<button onclick="calculator()">계산</button>
			<input type="text" id="result" readonly/>
			
			
	</body>
</html>
