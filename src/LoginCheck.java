
import java.io.IOException;
//import java.sql.Connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginzote.ManejadorDB;

//import loginzote.ManejadorDB;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginCheck() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ManejadorDB bd = new ManejadorDB();
		Connection connection = bd.getConnection();

		if (connection == null) {
			System.out.println("No ha sido posible conectarse a la base de datos");
		} else {

			String username = request.getParameter("username");
			String password = request.getParameter("password");

			try {

				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery("SELECT USERNAME FROM USUARIOS WHERE (USERNAME = '" + username
						+ "' AND PASSWORD = '" + password + "');");

				if (result.next()) {
					response.sendRedirect("session.jsp");

				} else {
					response.sendRedirect("error.jsp");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
