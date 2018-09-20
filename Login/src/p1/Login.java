package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("Name is ---"+name);
		System.out.println("password ----"+password);
		ConnectionProvider ds=new ConnectionProvider();
		Connection con = ds.getConnection();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Statement stmt;
		int counter=0;
		try {
			stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select * from registration");
			while (res.next()) {
		if (res.getString(2).equals(name) && res.getString(4).equals(password)) {
			counter=1;
			break;
		}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		if(counter==1){
			
			out.print("Successfully");
		}
		else
		{
			out.print("Not Successfull");
		}	 
	}
}