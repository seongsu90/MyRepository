<%@ page  contentType="text/html;charset=UTF-8"%>
<%@ page import="com.mycompany.myapp2.exam07.Board" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html> <!-- root 태크, 엘리먼트라고 하기도 한다. -->
	<head> <!-- 헤드엘리먼트 -->
		<meta charset="UTF-8">
	</head>
	<body> <!-- 브라우저에 나오는 부분 -->
		
		<p align="left"><a href="/myapp2/"><IMAGE SRC="/myapp2/resources/spring.jpg"></IMAGE></a>
		&nbsp; <font size="6"><b>Exam07 </b></font></p>
		<hr/> <!-- 시작과 동시에 끝이다라는 의미<br/>// 태그의 의미는 수평선그리기 -->
		[HttpServletRequest]를 이용해서 찾기<br/>
		데이터1: <%=request.getAttribute("data1") %><br/>
		데이터2: <%=request.getAttribute("data2") %><br/><br/>
		
		[HttpSession]를 이용해서 찾기<br/>
		데이터1:<%=session.getAttribute("data1") %><br/>
		데이터2:<%=session.getAttribute("data2") %><br/><br/>
		
		[EL]를 이용해서 찾기<br/>
		데이터1:${data1}<br/>
		데이터2: ${data2}<br/>
		
		<br/>
		[객체의 속성(필드) 값 얻기]<br/>
		<%Board board = (Board)request.getAttribute("board");%>
		<%if(board != null){ %>
		번호: <%=board.getBno() %><br/>
		제목: <%=board.getTitle() %><br/>
		내용: <%=board.getContent() %><br/>
		조회수: <%=board.getHitcount() %><br/>
		<%} %>
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