<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<style type="text/css"> <%-- 가장 낮은 우선순위가 div이다. 높은 우선순위는 #div 이다. --%>
			/* * {color: red;} */<%-- 모든 태그의 글자 색상을 빨간색으로 바꾸기 --%> 
			div{background-color: yellow;} <%-- body안에 있는 모든 div를 선택하는 명령어 --%>
			.div3 {background-color: magenta;} <%-- 클래이름이 div3인것을 찾는것. --%>
			#div2 {background-color: aqua;} <%-- id를 찾는것이다. --%>
			
			#div4,#p1,#h1 {background-color: orange}
			
			#div5 p{background-color: blue;} <%-- div5 안에있는 p태그 전부 선택 --%>
			#div6 > p{background-color: fuchsia;} <%-- 바로 아래있는 p를 호출하는것 div는 통과한다. --%>
			#div7+ p{background-color: maroon;}
			
			[checked] {color:green;} /* check 설정이 된것들 색 변환 */
			[selected=true] {color:green;} /* select이 true 인 값을 색변환 */
			
			a{color:black; text-decoration: none;} /* 링크의 장식 언더바 등등 */ 
			a:active {color:red;} /* 클릭했을때(활성화 될때) */
			a:link {color:green;} /* 방문하지 않은 링크  */
			a:hover {color:blue; text-decoration: underline;} /* 마우스를 올려 놓았을 때 옵션 설정,색,밑줄 */
			
			#form1 [checked] {background-color:black;} /* form태그 한개뿐일땐 #form1 이라고 해도 된다. */
			
		</style>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>CSS 선택자</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<div>A</div> <%--아이디는 중복작성되면 안되지만 클래스는 동일한 이름이여도 된다. --%>
		<div id="div2" class="div3">B</div>
		<div class="div3">C</div>
		<div class="div3">D</div>
		<br/>
		<div id="div4">E</div>
		<p id="p1">F</p>
		<h3 id="h1">G</h3>
		<br/>
		<div id="div5">
			<p>A</p>
			<p>A</p>
		</div>
		
		<br/>
		<div id="div6">
			<div><p>A</p></div>
			<p>A</p>
		</div>
		
		<br/>
		<div id="div7"></div>
		<p>A</p>
		<p>B</p>
		
		<div>
			<div checked="true">A</div>	
			<div checked="false">B</div>
			
			<div selected="false">C</div>
			<div selected="true">D</div>
			<div selected="true">E</div>
		</div>		
		<br/><%-- 인라인 스타일 --%>
		<div style="background-color: white"> 
			<a href="http://www.naver.com">네이버</a><br/>
			<a href="http://tomcat.apache.org">톰캣</a><br/>
			<a href="http://www.w3c.org">W3C</a><br/>
		</div>
		
		<form id="form1">
			<div checked="true">A</div>
			<div checked="false">B</div>
		</form>
		
	</body>
</html>