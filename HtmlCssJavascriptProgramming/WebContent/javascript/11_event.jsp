<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<script type="text/javascript">
			function changeImg1(){
				var img1 = document.querySelector("#img1");
				img1.src = "../common/image/photo1.jpg";
			}
			
			function changeImg2(){
				var img2 = document.querySelector("#img2");
				img2.src = "../common/image/photo2.jpg";
			}
			
			function changeImg3(){
				var img3 = document.querySelector("#img3");
				img3.src = "../common/image/photo3.jpg";
			}
			
			window.onload = function(){
				var btn2 = document.querySelector("#btn2");
				btn2.onclick = changeImg2;
				
				var btn3 = document.querySelector("#btn3");
				btn3.addEventListener("click",changeImg3);
			};
			
			
			
			/* function fun1(){
				console.log("window.onload");
			}
			window.onload = fun1; */ /* window.onload=fun1()의 경우 fun1을 실행후 onload에 집어넣는것이고 ()가 없는 경우는 특정 상황일때 지정된
			실행될 함수를 지정한다고 생각하면 된다.*/
			//() 가 있는 경우는 바로 실행되므로 지정을 할 것인지 클릭이벤트에서 바로 시작되겠금 ()를 넣어야할지 생각해야된다.
			/* window.onload = function(){ //윈도우객체에서 로드라는 속성이 실행되면 function이 실행
				console.log("window.onload");
			}; 위에 13~16과 같은 의미 */
			
			
		</script>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Event 처리</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
			<h3>[how1]</h3>
			<button onclick="changeImg1()">버튼1</button>
			<img id="img1" src="" width="100px"/>
			
			<h3>[how2]</h3>
			<button id="btn2">버튼2</button>
			<img id="img2" src="" width="100px"/>
			
			<h3>[how3]</h3>
			<button id="btn3">버튼3</button>
			<img id="img3" src="" width="100px"/>
	</body>
</html>