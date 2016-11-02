<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트, 헤더에는 선언문들이 script로 온다. 실행 코드는 body에 쓴다. -->
		<meta charset="UTF-8">
		<script type="text/javascript">
			function sum(from, to){
				var sum =0;
				for(var i=from; i<=to; i++)
					{
						sum += i;
					}
				return sum;
			}
		</script>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>함수 선언 </b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<script type="text/javascript">
			console.log("1부터 10까지의 합: "+sum(1,10));
		</script>
	</body>
</html>