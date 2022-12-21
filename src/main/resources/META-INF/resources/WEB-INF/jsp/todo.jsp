
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>



<title>List Todos page</title>
</head>
<body>
	<div class="container">
		<h1>Welcome to the To-Dos application</h1>
		<h2>Enter the Todo details</h2>
		<form:form method="post" modelAttribute="todo">
		   <form:label path="description">Description</form:label>
		   <form:input type="text" path="description" required="required"/>
		   <form:errors  path="description" cssClass="text-warning"/>
		   <form:input type="hidden" path="id" />
		   <form:input type="hidden" path="done"/>
		   <input type="submit" class="btn btn-success">
		
		
		
		</form:form>
	</div>
		<script src="/js/bootstrap.min.js"></script>
		<script src="/META-INF/resources/webjars/jquery/3.6.1/jquery.min.js"></script>
	
</body>
</html>