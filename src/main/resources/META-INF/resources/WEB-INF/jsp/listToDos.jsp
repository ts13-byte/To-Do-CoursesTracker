
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>



<title>List Todos page</title>
</head>
<body>


	<div class="container">
		<h1>Welcome to the To-Dos application</h1>
		<h2>your ToDos are:</h2>
		<table class="table">
			<thead>
				<tr>
					
					<th>description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listOfTodos}" var="listOfTodos">
					<tr>
						
						<td>${listOfTodos.description}</td>
						<td>${listOfTodos.targetDate}</td>
						<td>${listOfTodos.done}</td>
						<td><a href="delete-todo?id=${listOfTodos.id}" class="btn btn-warning">Delete</a></td>
						<td><a href="update-todo?id=${listOfTodos.id}" class="btn btn-warning">Update</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-todo" class="btn btn-success"> Add Todo</a>
	</div>
		<script src="/js/bootstrap.min.js"></script>
		<script src="/META-INF/resources/webjars/jquery/3.6.1/jquery.min.js"></script>
	
</body>
</html>