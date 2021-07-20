<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
<link rel="stylesheet" href="https://bootswatch.com/4/cerulean/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
<style>
div{
 width: 310px;
 height: 370px;
 border: 3px solid #1E90FF;
 margin: 70px;
 font-family: "Sofia", sans-serif;
  
  text-shadow: 3px 3px 3px #ababab;
}
label{
font-family: "Sofia", sans-serif;
  font-size: 20px;
}
input{
border: 2px solid #ababab;
}
button{
font-family: "Sofia", sans-serif;
}

</style>
</head>
<body>
<center>
<div>
<h2>Inscription</h2>
<form action="InscrptServlet" method="post">
<pre>	
  <label>Nom</label>      <input  type="text"  name="nom" required/><br>
  <label>Prenom</label>    <input type="text" name="prenom" required/><br>		
  <label>Login</label>       <input type="text" name="login" required/><br>			
  <label>Password</label>  <input type="password" name="password" required/>
</pre>		 
<br>
<pre> <button class="btn btn-outline-success" type="submit" >Inscription</button>   <button on class="btn btn-outline-warning" type="reset" >Effacer</button>
</pre>
</form>
</div>
</center>
</body>
</html>