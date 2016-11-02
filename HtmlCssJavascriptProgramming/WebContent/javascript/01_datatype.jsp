<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<script type="text/javascript">
			var v1 =10;
			var v2="자바스크립트";
			var v3= true;
			var v4={name:"홍길동",age:27}; <%-- {}는 객체를 선언, name은 필드 , 홍길동은 필드값 --%>
			var v5=function() {}; <%-- 자바의 메소드 역할을 한다. --%>
			var v6 = null;
			var v7 = new Date(); <%-- 객체를 만들어서 대입 --%>
			var v8 = [1, 2, 3]; <%-- 배열 --%>
			
			console.log("v1: "+ typeof(v1));
			console.log("v2: "+ typeof(v2));
			console.log("v3: "+ typeof(v3));
			console.log("v4: "+ typeof(v4));
			console.log("v5: "+ typeof(v5));
			console.log("v6: "+ typeof(v6));
			console.log("v7: "+ typeof(v7));
			console.log("v8: "+ typeof(v8));
			
			v1=3.14;
			console.log("v1: "+ typeof(v1));
			v1="Java";
			console.log("v1: "+ typeof(v1)); <%-- 데이터타입은 변수에 적용할때 진행되므로 상관없다. --%>
		</script>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>데이터 타입</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		
	</body>
</html>