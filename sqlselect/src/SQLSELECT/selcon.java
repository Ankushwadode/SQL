package SQLSELECT;

import java.sql.*;

public class selcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","Root@123");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT * FROM empper");
			System.out.println(" ID"+"   "+"Name");
			System.out.println("----"+" "+"------");
			while(rs.next()){ 
				System.out.println(rs.getInt("empid")+"  "+rs.getString("empname"));
			}
			rs.close();
			stmt.close();
			con.close();  
			}
			catch(Exception e){ 
				System.out.println(e);
			}  
	}

}
