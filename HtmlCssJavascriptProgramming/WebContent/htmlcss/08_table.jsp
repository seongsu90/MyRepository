<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<style type="text/css">
			#table1{
					border-collapse:collapse;
					width:100%
				}
				
				#table1 th,#table1 td {
						    border:1px solid black;
						    text-align: center;
						}
						
							
				#table1 th {
				    background-color: hotpink;
				    color: white;
				}
				
				#table1 tr:nth-child(odd)
				{
					background-color: #a2a2a2;
				}
				
		</style>
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>table 관련 CSS 속성</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->


	<table id="table1">
		<tr>
			<th>Firstname</th>
			<th>Lastname</th>
			<th>Savings</th>
		</tr>
		<tr>
			<td>Peter</td>
			<td>Griffin</td>
			<td>$100</td>
		</tr>
		<tr>
			<td>Lois</td>
			<td>Griffin</td>
			<td>$150</td>
		</tr>
		<tr>
			<td>Joe</td>
			<td>Swanson</td>
			<td>$300</td>
		</tr>
		<tr>
			<td>Cleveland</td>
			<td>Brown</td>
			<td>$250</td>
		</tr>
	</table>

</body>
</html>