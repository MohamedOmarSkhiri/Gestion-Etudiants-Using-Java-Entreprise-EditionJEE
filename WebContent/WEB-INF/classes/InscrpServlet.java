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

/**
 * Servlet implementation class AuthServet
 */
@WebServlet("/InscrpServlet")
public class InscrpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscrpServlet() {
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
	            
	            response.setContentType("text/html");
				PrintWriter out = response.getWriter(); 
				String Nom =request.getParameter("nom");
				String Prenom =request.getParameter("prenom");
				String Login=request.getParameter("login");
				String Password =request.getParameter("password");
				
				
				PreparedStatement psUsers = conn.prepareStatement("INSERT INTO utilisateur (nom,prenom,login,password) VALUES (?,?,?,?) ");
				
				psUsers.setString(1,Nom);
				psUsers.setString(2,Prenom);
				psUsers.setString(3,Login);
				psUsers.setString(4,Password);
				
		        
			
			if (psUsers.executeUpdate() == 1) {
				ServletContext context = getServletContext();
				RequestDispatcher dispatcher = context.getRequestDispatcher("/Connexion.jsp");
				dispatcher.forward(request, response);
			}
			else {
				out.print("<h1>échec a la l'inscription</h1>");
			}
			
		
				out.print("</html>");
				out.close();
				
		
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
