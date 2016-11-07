	<%@ page contentType="text/html;charset=UTF-8"%>
	
	<!DOCTYPE html>
	<html>
	<!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head>
	<!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<style type="text/css">
			*{
				margin: 0px;
				padding: 0px;
			}
		
			div.container{
				width: 100%;
				/* margin: auto; */
				border: 1px solid #FFCBCB;
			}
			
			header, footer{
				padding: 1em;
				color: white;
				background-color: #FFCBCB;
				text-align: center;
			}
			
			footer{
				clear: both;
			}
			
			nav{
				float: left;
				max-width: 160px;
				margin:0px;
				padding: 1em;
				width: 300px;
				heghti:500px;
				background-color: orange;
			}
			
			nav ul {
				list-style-type: none;
				padding : 0;
			}
			
			nav ul a {
				text-decoration: none;
			}
			
			article{
				margin-left:170px;
				padding: 1em;
				overflow: hidden; /*스크롤 숨기기 */
				
			}
			
		</style>
	</head>
	<body>
		<!-- 브라우저에 나오는 부분 -->
	
		
		<!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
	
		<div class="container">
	
			<header>
				<h1>City Gallery</h1>
			</header>
	
			<nav>
				<ul>
					<li><a href="#">London</a></li>
					<li><a href="#">Paris</a></li>
					<li><a href="#">Tokyo</a></li>
					<li><a href="#">Tokyo</a></li>
					<li><a href="#">Tokyo</a></li>
					<li><a href="#">Tokyo</a></li>
					<li><a href="#">Tokyo</a></li>
					<li><a href="#">Tokyo</a></li>
					<li><a href="#">Tokyo</a></li>
					<li><a href="#">Tokyo</a></li>
					<li><a href="#">Tokyo</a></li>
					<li><a href="#">Tokyo</a></li>
					<li><a href="#">Tokyo</a></li>
					<li><a href="#">Tokyo</a></li>

				</ul>
			</nav>
	
			<article>
				<h1>London</h1>
				<p>London is the capital city of England. It is the most populous
					city in the United Kingdom, with a metropolitan area of over 13
					million inhabitants.</p>
				<p>Standing on the River Thames, London has been a major
					settlement for two millennia, its history going back to its founding
					by the Romans, who named it Londinium.</p>
			</article>
	
			<footer>Copyright © W3Schools.com</footer>
	
		</div>
	
	
	</body>
	</html>