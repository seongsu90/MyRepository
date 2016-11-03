<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"><!-- 생략가능 (브라우저해석방식) -->
<script type="text/javascript"> 
	function checkLoginForm(){
		var mid = document.querySelector("#mid").value;
		var mpassword = document.querySelector("#mpassword").value;
		if(mid == "" || mpassword==""){
			alert("아이디 혹은 패스워드가 입력되지 않았습니다.");
			return false;
		}else if(mid.length<4 || mid.length>10){
			alert("아이디의 길이가 맞지 않습니다.");
			return false;
		}else if(mpassword.length<4 || mpassword.length>10){
			alert("패스워드의 길이가 맞지 않습니다.");
			return false;
		}
		return true;
	}
</script>
<title>index</title>
</head>
<body>
	유효성 검사(입력값 검사)
	<hr/>
	<form id="loginForm" onsubmit="return checkLoginForm()">
		아이디: <input id="mid" type="text" name="mid"/><br/>
		비밀번호: <input id="mpassword" type="password" name="mpassword"/><br/>
		<input type="submit" value="로그인"/>
	</form>
</body>
</html>
<!-- 이벤트 소스(태그)에서 이벤트 함수를 지정할 경우 이벤트가 발생했을 때 함수가 실행 -->
<!-- 이벤트 소스에 add -->