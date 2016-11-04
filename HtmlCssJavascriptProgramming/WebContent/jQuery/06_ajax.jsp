<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
		<script type="text/javascript" src="../common/js/jquery-1.12.4.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$("#btn1").on("click",function() {
					$.ajax({
						url:"06_data1.jsp",
						success:function(data){ //성공적으로 응답이오면 실행하겠다는 의미, data는 HTML조각이라고 한다.
							console.log(data);
							$("#div1").html(data);
						}
					});
				});
			});
			
			function checkMid(){
				var mid=$("#mid").val();
				$.ajax({
					url:"06_data2.jsp",
					//data: "mid="+mid,
					data: {"mid": mid},
					success: function(data){
						if(data.trim() == "true"){
							$("#btn2Result").html("사용할 수 있음");
						}else{
							$("#btn2Result").html("사용할 수 없음");
						}
					}					
				});
			}
			
			function getAd(kind, keyword){
				$.ajax({
					url: "06_data3.jsp",
					data: {"kind":kind, "keyword":keyword},
					method: "post",
					success: function(data){ //datadp 들어갈수 있는건 1.HTML조각, 2.XML , 3. JSON 이다.
						$("#div3").html(data);
					}
				});
			}
			
			function getJson(){
				$.ajax({
					url: "06_data4.jsp",	
					success: function(data){ //datadp 들어갈수 있는건 1.HTML조각, 2.XML , 3. JSON 이다.
					var html = '<table>';
					html +=	'<tr>';
					html +=		'<td>';							
					for(var i=0; i<data.length;i++){
					html +=			'<div style="width:120px; height:130px; margin:5px; display:inline-block; background-image:url(' + data[i].aimg + '); background-size: 120px 130px ">';
					html +=				'<div>';
					html +=					'<table style="width:100%; height:30px; background-color: black; opacity: 0.7;">';
					html +=						'<tr>';
					html +=							'<td style="text-align:left; color:white">'+data[i].alocation +'</td>';
					html +=							'<td style="text-align:right; color:aqua;">' + data[i].ahitcount + '</td>';
					html +=						'</tr>';
					html +=					'</table>';
					html +=				'</div>';
					html +=			'</div>';	
					}
					html +=		'</td>';
					html +=	'</tr>';
					html +='</table>';
					$("#div4").html(html);
					}
				});
			}
		</script>		
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>AJAX 통신</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<button id="btn1" >버튼1</button>
		<div id="div1" style="height:300px; border:1px solid black;"></div>
		
		<br/><br/>
		
		<button id="btn2"  onclick="checkMid()">아이디 중복 체크</button>
		<input id="mid" type="text" name="mid"/>
		<span id="btn2Result"></span>

		<br/><br/>
		<button id="btn3"  onclick="getAd('book','java')">광고 정보 얻기</button>
		<div id="div3"></div>
		
		<br/><br/>
		<button id="btn4"  onclick="getJson()">JSON 응답 이용</button>
		<div id="div4"></div>
		
		
	</body>
</html>