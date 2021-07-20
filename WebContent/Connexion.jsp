<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Connexion</title>
<link rel="stylesheet" href="https://bootswatch.com/4/cerulean/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
<style>
div{
 width: 310px;
 height: 310px;
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
h2{
font-family: "Sofia", sans-serif;
}
</style>
</head>
<body>
<center>
<div>
<h2>Connexion</h2>
<form action="ConnecServlet" method="post">
<pre>	
  <label>Login</label>       <input type="text" name="login" required/><br>			
  <label>Password</label>  <input type="password" name="password" required/>
</pre>
<br><br>		 
<pre><input type="submit"class="btn btn-outline-success" value="Connexion"/> <input type="reset" class="btn btn-outline-warning" value="Effacer"/> </pre>

</form>
</div>
</center>
</body>
</html>