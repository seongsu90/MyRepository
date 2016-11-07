<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<script type="text/javascript">
			// 스크립트에서는 로커 변수와 글로벌 변수가 있다.
			// 글로벌 변수= 자바에서의 전역변수
			// 로컬 변수 = 자바에서의 지역변수
			// var로 선언이 안된 변수를 쓰면 스크립트에서는 전역변수로 해석한다.
		
			var v1 = "A";
					
			function fun1()
			{
				var v2 = "B";
				v3="C";
				console.log("v1: " + v1);
				console.log("v2: " + v2);
				console.log("v3: " + v3);
			}
			
			function fun2()
			{
				console.log("v1: " + v1);
				/* console.log("v3: " + v3);
				console.log("v2: " + v2); */
			}
			
			function fun3(){
				/* 자바에서는 블록안에 선언된 변수는 블록안에서만 사용가능. 스크립트에서는 블록단위의 로컬변수는 없다.함수 단위의 로컬 변수다. */
				if(true)
					{
					var v4="D";
					}
				console.log("v4: "+v4);
			}
			
		</script>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>지역 변수와 전역 변수 </b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<script type="text/javascript">
		fun1();
		console.log("-----------------");
		fun2();
		console.log("-----------------");
		fun3();
		</script>
		
	</body>
</html>