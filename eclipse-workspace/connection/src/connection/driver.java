package connection;

import java.sql.*;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms?autoReconnect=true&useSSL=false", "mitwpu" , "mitwpu");
			
			Statement stmt = con.createStatement();
			
			ResultSet  rs = stmt.executeQuery("select * from emp");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " " + rs.getString(3) + " " + rs.getInt(4) + " " + rs.getInt(5));
			}
		}catch(SQLException s) {
			s.printStackTrace();
		}

	}

}
