<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<script type="text/javascript">
			 var $ = function(selector) {
				console.log("aaa");
				return document.querySelectorAll(selector);
			}; 
			
			//동적 메소드 추가
			$.ajax = function(){
				console.log("bbb");
			};
			
			function test(){
				$("#div1")[0].innerHTML = "수정 내용";
				$.ajax();
			}
		</script>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>$는 함수형 객체</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<button onclick="test()">버튼</button>
		<div id="div1">최초 내용</div>
		
	
		
	</body>
</html>