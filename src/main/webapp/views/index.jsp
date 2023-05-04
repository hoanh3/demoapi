<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/views/js" var="url" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo</title>
</head>
<body>
    <h1>Hello</h1>
    <hr>
    <div class="container">
        <ul id="todoList">
            
        </ul>
    </div>
    
	<div>
        <button>
            <a href="${pageContext.request.contextPath}/add">Add todo</a>
        </button>
    </div>

    <script>
        const CTX = "${pageContext.request.contextPath}"
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
		integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
		crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="${url}/main.js"></script>
</body>
</html>