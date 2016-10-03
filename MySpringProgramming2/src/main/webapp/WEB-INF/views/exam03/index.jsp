<%@ page  contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp2/"><IMAGE SRC="/myapp2/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>exam03</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		[회원 가입 폼] <br/>
		<form action="/myapp2/exam03/join">
			아이디: <input type="text" name="mid" value="fall"/> <br/> <%-- name은 파라미터 이름 지정 --%>
			이름: <input type="text" name="mname" value="한가을"/> <br/>
			비밀번호: <input type="password" name="mpassword" value="12345"/> <br/>
			이메일: <input type="email" name="memail" value="fall@naver.com"/><br/>
			전화번호: <input type="tel" name="mtel" value="010-123-1234"/> <br/>
			직업: 
				<input type="radio"name="mjob"  value="대학생">대학생
				<input type="radio"name="mjob" value="회사원" checked>회사원 <!-- checked 는 디폴트값 설정 -->
				<input type="radio"name="mjob" value="공무원">공무원</br>
			개발분야:
				<input type="checkbox" name="mskill" value="web">웹 개발
				<input type="checkbox" name="mskill" value="system" checked>시스템 개발
				<input type="checkbox" name="mskill" value="bigdata">빅데이터 개발
				<input type="checkbox" name="mskill" value="iot" checked>IoT 개발 </br>
			주소:
				<select name="maddress1">
					<option>서울특별시</option>
					<option selected>경기도</option>
					<option>부산광역시</option>
					<option>대구광역시</option>
					<option>제주특별시</option>
				</select> -
				
				<select name="maddress2">
					<option>인천시</option>
					<option>수원시</option>
					<option selected>용인시</option>
					<option>부천시</option>
					<option>의왕시</option>
				</select> <br/>
				
				생년월일: <input type="date" name="mbirth"  value="2016-09-29"/>
				
				<br/>
			
			<%--
			 <input type="submit"value="가입"/>		submit과 button,image 의 기능이 같다.서버로 전송
			<button>가입</button> 	 
			--%>
			<input type="image" src="/myapp2/resources/image/join.png" width="150"/>
				
		</form>
	</body>
</html>