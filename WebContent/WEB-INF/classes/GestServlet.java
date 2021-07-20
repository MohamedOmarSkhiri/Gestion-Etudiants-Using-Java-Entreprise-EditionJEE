import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Servlet implementation class GestServlet
 */
@WebServlet("/GestServlet")
public class GestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
		try {
			/**********************************************/
			String strClassName = "com.mysql.jdbc.Driver";
			Class.forName(strClassName);
	         String url = "jdbc:mysql://localhost:3306/miniprojet";
	            String user = "root";
	            String password = "";
	            Connection  conn = DriverManager.getConnection(url, user, password);
	            /***********************************/
	        	PreparedStatement psUsers = conn.prepareStatement("SELECT * FROM etudiant ");
	        	
	            ResultSet rsUsers = psUsers.executeQuery();
	            
	            List<String> listEtudiant = new ArrayList<>();
	            
	            while (rsUsers.next()) {
	                String Id = rsUsers.getString("id");
	                String Nom = rsUsers.getString("nom");
	                String Prenom = rsUsers.getString("prenom");
	                String Classe = rsUsers.getString("classe");
	                 
	                listEtudiant.add(Id);
	                listEtudiant.add( Nom );
	                listEtudiant.add(Prenom);
	                listEtudiant.add(Classe);
	            }
					
			
				conn.close();
				}
				catch(ClassNotFoundException e) {
					System.out.println("Driver non chargé !");
					e.printStackTrace(); 
				} catch(SQLException e) {
					System.out.println(e);
			
				} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
}

class Etudiant 
{
	String id;
	String nom;
	String prenom;
	String classe;
	
	public Etudiant(String id,String nom,String prenom, String classe) 
	{
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;
		this.classe=classe;
	}
	 List<String> listEtudiant = new ArrayList<>();
}