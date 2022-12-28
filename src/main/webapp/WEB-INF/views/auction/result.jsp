<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>WONDER</title>
</head>
<body>
	<h1> 업로드가 완료되었습니다 </h1>
	<label>아이디 : </label>
		<!-- value="${map.id }" : map으로 넘어온 매개변수 값을 표시할 것이다 -->
		<input type="text" name="id" value="${map.id }" readonly><br>
	<label>이름:</label>
		<input type="text" name="name" value="${map.name }" readonly><br>
	
	<div class="result-images">
		<!-- 업로드한 파일들을 forEach문을 이용해 <img> 태그에 표시 -->
		<c:forEach var="imageFileName" items="${ map.fileList}"  >
			<img src="${pageContext.request.contextPath }/auction/download?imageFileName=${imageFileName }">
	        <br><br><br>
	    </c:forEach>         
	</div> <p> 
	
	<a href='${pageContext.request.contextPath }/auction/form'> 다시 업로드 하시겠습니까? </a> </p>
</body>
</html>