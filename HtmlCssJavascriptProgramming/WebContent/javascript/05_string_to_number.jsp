<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>String을 숫자로 변환 </b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<script type="text/javascript">
			var v1="10";
			var v2= Number(v1);
			var v3= parseInt(v1);
			
			console.log(v2);
			console.log(v3);
			console.log(v2+v3);
			
			var v4 = "3.14";
			var v5 = parseInt(v4);
			var v6 = parseFloat(v4);
			console.log(v5);
			console.log(v6);
		</script>
	</body>
</html>