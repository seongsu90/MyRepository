<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<script type="text/javascript" src="../common/js/jquery-1.12.4.min.js"></script>
		<script type="text/javascript">
			$(function() {
				$("#btn1").on("click",function() {
					$("#div1").append('<img id="img1" src="../common/image/photo1.jpg" width="100px"/>&nbsp');
				});	
				
				$(".img2").on("mouseover",function() {
					$(".img2").attr("src","../common/image/photo2.jpg");
				});
				
				$(".img2").on("mouseout",function() {
					$(".img2").attr("src","../common/image/photo1.jpg");
				});
			});
			
			
			
		</script>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>이벤트 처리</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<button id="btn1">버튼1</button>
		<div id="div1">
			<img id="img1" src="../common/image/photo1.jpg" width="100px"/><br/>
		</div>
		<br/><br/>
		<div>
			<img class="img2" src="../common/image/photo1.jpg" width="100px"/>
			<img class="img2" src="../common/image/photo1.jpg" width="100px"/>
		</div>
	</body>
</html>