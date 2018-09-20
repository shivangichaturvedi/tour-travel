package p1;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectDaoImpl {
	 Connection con;
 PreparedStatement psmt;
 ResultSet res;
public void insertReg(Registration register) throws SQLException
{
	Connection con=ConnectionProvider.getConnection();
	psmt = con.prepareStatement("insert into registration values(?,?,?,?)");
	psmt.setInt(1, register.getUserid());
	psmt.setString(2, register.getUsername());
	psmt.setInt(3, register.getAge());
	psmt.setString(4,register.getPassword());
	psmt.execute();
	
	System.out.println("Record inserted.");
}
}
