<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<script type="text/javascript">
				function onClickButton1(){
					console.log("onClickButton1 실행");
					/* var div1 = document.getElementById("div1"); //document - 내장된 DOM 객체, */
					var div1= document.querySelector("#div1");
					console.log(div1);
					div1.innerHTML="수정 내용";
				}	
				
				function onClickButton2(){
					console.log("ocClickButton2 실행")
					var imgArr = document.querySelectorAll(".photo");
					imgArr[0].src="../common/image/photo2.jpg";
				}
				
				function onClickButton3(){
					/* var inputMid = document.querySelector("[name=mid]");
					var mid = inputMid.value;
					console.log("mid: "+ mid);
					var inputMpassword =document.querySelector("[name=mpassword]");
					var mpassword = inputMpassword.value;
					console.log("mPassword: "+ mpassword); */
					/* var mid = document.querySelector("#form1 [name=mid]").value;
					console.log("mid: "+mid);
					var mpassword = document.querySelector("#form1 [name=mpassword]").value;
					console.log("mpassword: "+ mpassword);  */
					
					//how2 입력된 mid와 mpassword 얻기
					mid = document.form1.mid.value; // document 안에 form1 이라는 이름을 가진 것을 찾고 그안에 mid를 찾아 value값을 받는다.
					// 대신 이름이 선언되있어야 된다. form1 이라는 이름이.!
					console.log("mid: "+mid);
					mpassword = document.form1.mpassword.value;
					console.log("mpassword: "+ mpassword); 
					
					//유효성 검사
					if(mid == ""){
						alert("아이디를 입력하세요.")
					}else if(mpassword =="")
						{
						alert("비밀번호를 입력하세요.")
						}
					
					
					//서버 전송
					var form1 = document.querySelector("#form1");
					form1.submit();
					
					document.querySelector("#form1").submit();
					
					//how3
					/* var mid = document.querySelector("#mid").value;
					console.log("mid: "+mid);
					var mpassword = document.querySelector("#mpassword").value;
					console.log("mpassword: "+ mpassword); */
				}
		</script>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
<!-- 		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Dom 사용</b></font></p> -->
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
			<button onclick="onClickButton1()">버튼1</button>
			<div id="div1">최초 내용</div>
			<button onclick="onClickButton2()">버튼2</button>
			<div>
				<img class="photo" src="../common/image/photo1.jpg" width="200"/>
			</div>
			<button onclick="onClickButton3()">버튼3</button>
			<div>
				<form id="form1" name="form1">
						아이디 : <input id="mid" type="text" name="mid"/><br/>
						비밀번호 : <input id="mpassword" type="password" name="mpassword"/><br/>
				</form>
				

			</div>
	</body>
</html>