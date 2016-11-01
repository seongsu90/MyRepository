<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<style type="text/css">
			#div1 {
				position: absolute;  /* absolute 이면 left,top 만큼 브라우저 좌표(0,0)에서 떨어진다. */
				left: 100px;
				top: 200px;
				width: 100px;
				height: 100px;
				background-color: red;
			}
			
			#div2 {
				width: 100px;    /* static이면 left,top의 영향을 받지 않는다. */
				height: 100px;
				background-color: hotpink;
			}
			
			#div3 { /* fixed - left, top 만큼 브라우저 좌표(0,0)에서 떨어진다. 부모와 상관없이 브라우저를 기준한다. */
				position: fixed;
				left: 300px;
				top: 200px;
				width: 100px;
				height: 100px;
				background-color: red;
			}
			
			#div4{
				position: static;  /* relative - left,top만큼 부모의 좌표(0,0)에서 떨어진다. */
				left: 500px;
				top: 100px;
				width:300px;
				height:300px;
				border: 1px solid black;
			}
			
			#div5{  
				position:absolute;
				left: 150px;
				top:150px;
				width: 50px;
				height: 50px;
				background-color: green;
			}
		</style>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<!-- <p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>location 관련 CSS 속성</b></font></p> -->
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<div id="div1"></div>
		<div id="div2"></div>
		<div id="div3"></div>
		<div id="div4">
			<div id="div5"></div>
		</div>
		
		<%for(int i=0; i<30; i++) {%>
		<br/>
		<%} %>

	</body>
</html>