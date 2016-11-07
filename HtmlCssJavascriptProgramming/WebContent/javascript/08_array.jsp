<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>배열</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<script type="text/javascript">
			var cars = ["Saab", "Volvo", "BMW"];
			console.log(cars[0]);
			console.log(cars[1]);
			console.log(cars[2]);
			console.log("-------------------------");
			for(var i=0; i<cars.length;i++)
				{
					console.log(cars[i]);
				}
			console.log("-------------------------");
			var cars2 = new Array("Saab", "Volvo", "BMW");
			cars2.sort();
			for(var i=0; i<cars2.length;i++)
			{
				console.log(cars2[i]);
			}
			console.log("-------------------------");
			var fruits = ["Banana", "Orange", "Apple", "Mango"];
			fruits.push("Lemon");   
			fruits[5]="포도";
			for(var i=0; i<fruits.length;i++)
			{
				console.log(fruits[i]);
			}
		</script>
	</body>
</html>