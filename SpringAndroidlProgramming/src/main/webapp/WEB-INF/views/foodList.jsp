<%@ page  contentType="application/json;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
[
<c:forEach var="food" items="${foodList}">
	{
		"image":"${food.image}",
		"foodMain":"${food.foodMain}",
		"title":"${food.title}",
		"price" : "${food.price}",
		"content":"${food.content}"
	}
	<c:if test="${!status.last}">,</c:if> <%--마지막줄이 아니면 ,를 붙여라 --%>
</c:forEach>
]