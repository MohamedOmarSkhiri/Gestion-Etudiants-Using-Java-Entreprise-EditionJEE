<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/miniprojet";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion Etudiant</title>
<link rel="stylesheet" href="https://bootswatch.com/4/cerulean/bootstrap.min.css">
</head>
<body>
<input type="button" class="btn btn-primary"onclick="location.href='Connexion.jsp'" value="Deconnecter" />
<center><h1>Gestion des etudiants</h1></center>
<center><br><Br>
<div>
<table class="table table-hover">
<thead>
<h3><i>Liste des etudiants</i> </h3>
</thead>
<tr>
<th scope="col">ID</th>
<th scope="col">Nom</th>
<th scope="col">Prenom</th>
<th scope="col">Classe</th>

</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl, userid, password);
statement=connection.createStatement();
String sql ="select * from etudiant";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr class="table-primary">
<td><%=resultSet.getString("id") %></td>
<td><%=resultSet.getString("nom") %></td>
<td><%=resultSet.getString("prenom") %></td>
<td><%=resultSet.getString("classe") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
<pre><input type="button" class="btn btn-success" onclick="location.href='AjouterEtudiant.jsp'" value="Ajouter" />                 <input type="button" class="btn btn-danger"onclick="location.href='SupprimerEtudiant.jsp'" value="Supprimer" />                     <input type="button" class="btn btn-warning" onclick="location.href='MiseaJourEtudiant.jsp'" value="Mise a jour" /> </pre>  

</div>
</center>
</body>
</html>