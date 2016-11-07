<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<script type="text/javascript">
			function checkMid(){
				var mid = document.querySelector("#mid");
				mid.value = mid.value.toLowerCase();
			}
			
			window.onload = function() {
				var mid = document.querySelector("#mid");
				mid.addEventListener("keypress",checkMid);
				var mid2=document.querySelector("#mid");
				mid2.addEventListener("change",checkMid);
				
				var img2 = document.querySelector("#img2");
				img2.addEventListener("mouseover",changeImg);
				
				
			};
			
			function changeImg(img){	
				if(event.type=="mouseover"){
					img.src="../common/image/photo2.jpg";
				}else if(event.type =="mouseout"){
					img.src="../common/image/photo1.jpg";
				}
			}
			
			function changeImg2(event){
				var img = event.target;
				if(event.type=="mouseover"){
					img.src="../common/image/photo2.jpg";
				}else if(event.type =="mouseout"){
					img.src="../common/image/photo1.jpg";
				}
			}
			
			window.addEventListener("load",function(){
				
				var img2 = document.querySelector("#img2");
				img2.addEventListener("mouseover", changeImg2);
				img2.addEventListener("mouseout", changeImg2);
			});
			
			function changeColor(div){
				if(event.type=="mouseover"){
					div.style.backgroundColor="skyblue";
				}else if(event.type =="mouseout"){
					div.style.backgroundColor="#FFCBCB";
				}
			}
		</script>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>다양한 Event 처리</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
			
			<h3>[Ex1]</h3>
			<form>
				<!-- <input id="mid" type="text" name="mid" onkeypress="checkMid()" onchange="checkMid()"/> -->
				<input id="mid" type="text" name="mid" />
			</form>
			<br/>
			<h3>[Ex2]</h3>
			1.<img id="img1" src="../common/image/photo1.jpg" width="200px" onmouseover="changeImg(this)" onmouseout="changeImg(this)"><br/>
			2.<img id="img2" src="../common/image/photo3.jpg" width="200px">
			<h3>[Ex3]</h3>
			<div id="div1" style="width:200px; height:200px;background-color:skyblue;" onmouseover="changeColor(this)" onmouseout="changeColor(this)"></div>
	</body>
</html>