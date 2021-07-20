<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter Etudiant</title>
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
</style>
</head>
<body>
<center>
<div>
<h2>Ajout etudiant</h2>
<form action="AjouServlet" method="post">
<pre>	
    <label>Nom</label>       <input type="text" name="nom" required/><br>			
    <label>Prenom</label>    <input type="text" name="prenom" required/><br>
    <label>Classe</label>     <input type="text" name="classe" required/>
  </pre>	
<pre><input type="submit" class="btn btn-outline-success"  value="Ajouter"/>    <input type="reset" class="btn btn-outline-warning" value="Effacer"/></pre>

</form>
</div>
</center>
</body>
</html>