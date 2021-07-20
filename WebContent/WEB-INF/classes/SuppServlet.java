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
@WebServlet("/SuppServlet")
public class SuppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuppServlet() {
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
	   String ID = request.getParameter("id");
	    PreparedStatement psUsers = conn.prepareStatement("DELETE FROM etudiant WHERE id=? ");
	    psUsers.setString(1,ID);
	    
		if (psUsers.executeUpdate() == 1) {
			ServletContext context = getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("/GestionEtudiant.jsp");
			dispatcher.forward(request, response);
		}
		else {
			out.print("<h1>�chec d'operation</h1>");
		}
		out.print("</html>");
		out.close();

	conn.close();
	}
catch(ClassNotFoundException e) {
	System.out.println("Driver non charg� !");
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
    
    