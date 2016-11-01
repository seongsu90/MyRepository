<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<title>index</title>
	<link rel="stylesheet" type="text/css"
			href="../common/bootstrap-3.3/css/bootstrap.min.css">
		<script type="text/javascript" src="../common/js/jquery-1.12.4.min.js"></script>
		<script type="text/javascrpt"
			src="../common/bootstrap-3.3/js/bootstrap.min.js"></script>
			
			<style type="text/css">
			
				
				#header,#footer{
					background-color: black;
					color:white;
					text-align: center;
				}
				
				#content #menu {
				background-color:skyblue;
				padding: 1em;
				
			}
			#content #menu ul {
				list-style-type: none;
				padding : 0;
			}
	
			</style>
			
			
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Layout 작성</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<div class="container-fluid">
		<div id="header" class="row">
				<div class="col-md-12"><h1>City Gallery</h1></div>
		</div>
		<div id="content" class="row">
			<div id="menu" class="col-xs-12 col-md-3">
				<ul>
					<li><a href="#">London</a></li>
					<li><a href="#">Paris</a></li>
					<li><a href="#">Tokyo</a></li>
					<li><a href="#">London</a></li>
					<li><a href="#">Paris</a></li>
					<li><a href="#">Tokyo</a></li>
				</ul>
			</div>
			<div id="center" class="col-xs-12 col-md-9">
			<h1>London</h1>
				<p>London is the capital city of England. It is the most populous
					city in the United Kingdom, with a metropolitan area of over 13
					million inhabitants.</p>
				<p>Standing on the River Thames, London has been a major
					settlement for two millennia, its history going back to its founding
					by the Romans, who named it Londinium.</p>
			</div>
		</div>
		<div id="footer" class="row">
				<div class="col-md-12">
					Copyright © W3Schools.com
				</div>
		</div>
		</div>
	</body>
</html>