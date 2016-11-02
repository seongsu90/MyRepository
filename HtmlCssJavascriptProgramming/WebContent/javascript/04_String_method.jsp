<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>String 객체의 메소드 </b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<script type="text/javascript">
			var v1 = "abc";
			console.log(v1.length);
			
			var v2 = "JavaScript is easy";
			console.log(v2.indexOf("easy"));
			console.log(v2.indexOf("spring"));
			console.log(v2.search("easy"));
			
			var v3 = "123456-9876543";
			console.log(v3.substring(7,14));
			console.log(v3.substr(7,7)); /* 뒤의 7은 불러울 숫자의 수를 의미 */
			console.log(v3.charAt(7));
			
			var v4 = "Please visit Microsoft!";
			var v5 = v4.replace("Microsoft","W3Schools");
			console.log("v5: "+v5);
			
			var v6="10:20:30";
			var v7=v6.split(":");
			console.log(v7[0]);
			console.log(v7[1]);
			console.log(v7[2]);
		</script>
	</body>
</html>