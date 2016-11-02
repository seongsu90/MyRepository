<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/HtmlCssJavascriptProgramming/"><image src="/HtmlCssJavascriptProgramming/jq.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>객체</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		<script type="text/javascript">
			var car = {
				model:"승용차",
				company:"현대",
				cc: 3000,
				speed: 0,
				start: function() {
					console.log("시동을 겁니다.");
				},
				stop: function() {
					console.log("멈춥니다.");
				},
				setSpeed: function(speed) {
					this.speed = speed;
				},
				getSpeed: function(){
					return this.speed;
				}
			};
			//필드 (속성) 값 읽기
			console.log("car.model: "+car.model);
			console.log("car.company: "+car.company);
			console.log("car.cc: "+car.cc);
			console.log("car.speed: "+car.speed);
			
			//필드(속성) 값 변경
			car.model = "자율주행";
			car.speed=60;
			console.log(car);
			
			//메소드 호출
			car.start();
			car.setSpeed(100);
			console.log("현재 속도: "+car.getSpeed());
			car.stop();
		</script>
	</body>
</html>