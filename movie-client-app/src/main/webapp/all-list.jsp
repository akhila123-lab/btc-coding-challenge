    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie List</title>
</head>
<body>

<div>
<p><b>Movie List:</b><p>

	<ul>
		<c:forEach var="movies" items="${movies}">
		
			<li>Movie Name : ${movies.movieName}</li>
			<li>Movie Budget :${movies.movieBudget}</li>
			<li>Director :${movies.directorName}</li>
			<li>Hero : ${movies.heroName}</li>
			<li>Language :${movies.language}</li>
			<li>Category (Comedy/Hurror/Action) :${movies.movieCategory}</li>
			<br>
			<br>
		</c:forEach>
	</ul>

</div>
</body>
</html>