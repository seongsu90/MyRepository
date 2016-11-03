<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<script type="text/javascript" src="../common/js/jquery-1.12.4.min.js"></script>
		<script type="text/javascript">
			function test1(){
				$("#div1").html("수정 내용");
			}
			function test2(){
				$(".div2").html("수정 내용");
				$(".div2").css("background-color","red");
			}
			function test3()
			{
				$("#img3").attr("src","../common/image/photo5.jpg");
			}
			
		</script>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>객체 찾기</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<button onclick="test1()">버튼1</button>
		<div id="div1">최초 내용</div>
		
		<button onclick="test2()">버튼2</button>
		<div class="div2">최초 내용</div>
		<div class="div2">최초 내용</div>
		<div class="div2">최초 내용</div>
	
		<br/>
		<button onclick="test3()">버튼3</button>
		<img id="img3" src="../common/image/photo1.jpg" width="300px"/>
	</body>
</html>