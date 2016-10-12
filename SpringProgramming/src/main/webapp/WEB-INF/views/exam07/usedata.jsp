<%@ page  contentType="text/html;charset=UTF-8"%> <%--이 기호 <%@는 지시자를 의미,<%= 값을 표현, <%@ page 는 페이지 지시자이다. --%>
<%@ page import="com.mycompany.myapp.exam07.Board, java.util.*" %><%--Board대신 *를 넣어도 된다. UTF-8뒤에 넣어도된다.임폴트도 2개 할 수 있다. --%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <%--taglib의 역할은 기본 HTML태그이외에 다른 태그들을 사용하기위해 지시자로 선언 --%>
										<%--똑같은 태그의 소유권이 누군지 알기위해 네임스페이스로 지정, 프리픽스는 아무거나 넣어도됨. --%>
										
										
										
<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp/"><IMAGE SRC="/myapp/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Exam07 / 데이터 찾기</b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		[HttpServletRequest]를 이용해서 찾기<br/>
		데이터1: <%=(String)request.getAttribute("data1")%> <br/> <%-- <%== %> 안에 있는 값을 데이터1에 넣어라  --%>
		데이터2: <%=(String)request.getAttribute("data2")%> <br/><br/>
		
		[HttpSession]를 이용해서 찾기<br/>
		데이터1: <%=(String)session.getAttribute("data1")%> <br/>
		데이터2: <%=(String)session.getAttribute("data2")%> <br/><br/>
		
		[EL]를 이용해서 찾기<br/>
		 <%--먼저 HttpServletRequest에서 data가 있는지 찾고 없으면 HttpSession에서 찾고 이용한다.둘다 있으면 HttpServletRequest에 있는걸 사용. --%>
		데이터1: ${data1} <br/>
		데이터2: ${data2} <br/><br/>
		
		
		[객체의 속성(필드) 값 얻기]<br/>
		<%Board board = (Board) request.getAttribute("board");%> <%-- <% %> 스플릿 플릿 이라고 부른다. 이안에 자바소스를 쓸 수 있다. --%>
		<%if(board != null) {%>
		번호: <%=board.getBno()%><br/>  <%-- <%= 하나의 값을 출력하는 기호 --%>
		제목: <%=board.getTitle()%><br/>
		내용: <%=board.getContent()%><br/>
		조회수: <%=board.getHitcount()%><br/>
		<%}%>
	<%-- 	번호:${board.bno}<br/> EL언어에서 객체이름 다음에 . 은 getter을 호출하는것
		제목:${board.title}<br/>
		내용:${board.content}<br/>
		조회수:${board.hitcount}<br/> --%>
		<br/>
		
		[컬렉션 이용하기]<br/>
		
		<table style="border-collapse: collapse; border: 1px solid black;width: 600px">
			<tr style="background-color:#FFADEF">
				<td style="border: 1px solid black;">번호</td> 
				<td style="border: 1px solid black;">제목</td> 
				<td style="border: 1px solid black;">내용</td> 
				<td style="border: 1px solid black;">조회수</td>
			</tr>
			<%-- 
			<%List<Board> list = (List<Board>)request.getAttribute("boardlist"); %>
			<%if(list != null){%>
			<%for(Board b :list) { %>
			<tr>
				<td style="border: 1px solid black;"><%=b.getBno()%></td>  
				<td style="border: 1px solid black;"><%=b.getTitle()%></td>
				<td style="border: 1px solid black;"><%=b.getContent()%></td>
				<td style="border: 1px solid black;"><%=b.getHitcount()%></td>
			</tr>
				<%}%>
			<%}%>
			--%>
			
			<c:forEach var="b" items='${boardlist}'> <%--57,58라인을 합친거 --%>
				<tr>
					<td style="border: 1px solid black;">${b.bno}</td>  
					<td style="border: 1px solid black;">${b.title}</td>
					<td style="border: 1px solid black;">${b.content}</td>
					<td style="border: 1px solid black;">${b.hitcount}</td>
				</tr>
			</c:forEach>
			
			 
		</table> 
	</body>
</html>