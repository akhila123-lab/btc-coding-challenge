<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie App</title>
</head>
<body>
<div style={{display:'flex', justifyContent:'space-between'}}>
<div>
<h2>Add Movie</h2>
 <form action="add-movie" method="post">
<p> Movie Name : <input type ="text" name="movieName"> </p>
<p> Movie Budget : <input type="number" name="movieBudget"> </p>
<p> Director Name :  <input type="text" name="directorName">  </p>
<p> Hero Name : <input type="text" name="heroName">   </p>
<p> Language : <input type="text" name="language"> </p> 
Select Category:<select name="movieCategory">
 <option value="Comedy"	></option>
   <option value="Comedy">Comedy</option>
  <option value="Hurror">Hurror</option>
  <option value="Action"	>Action</option>
  </select>
<p> <button type="submit">Enter</button></p>

 </form>

 <h2>Find Movie By Name</h2>
 
 <form action="search-movie" method="get">
 <p> Movie Name : <input type="text" name="movie-name"></p>
 <p> <button type="submit">Search</button> </p>
 </form>
 
 <h2>Delete Movie</h2>
  <form action="delete-movie" method="get">
  <p> Movie Name : <input type ="text" name="movieName">  </p>
  <p> <button type="submit">Delete</button> </p>
  </form>
  </div>
  <div>
  <h2>Update Movie</h2>
  <form action="update-movie" method="post">
  <p> Movie Name : <input type ="text" name="movieName"> </p>
<p> Movie Budget : <input type="number" name="movieBudget"> </p>
<p> Director Name :  <input type="text" name="directorName">  </p>
<p> Hero Name : <input type="text" name="heroName">   </p>
<p> Language : <input type="text" name="language"> </p> 
Select Category:<select name="movieCategory">
 <option value="Comedy"	></option>
   <option value="Comedy">Comedy</option>
  <option value="Hurror">Hurror</option>
  <option value="Action">Action</option>
  </select>
<p> <button type="submit">Update</button></p>
  
  </form>

  <h2>Get All Movies List</h2>
  <form action="get-all-movies" method="get">
  <button type="submit">Get</button>
  </form>
 
 </div>
 </div>
</body>
</html>