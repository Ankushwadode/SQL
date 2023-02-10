package SQLDELETE;

import java.sql.*;

public class sqldelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","Root@123");  
			Statement stmt=con.createStatement();
			int count = stmt.executeUpdate("DELETE FROM empper WHERE empid in(106)");
			System.out.println(count+"Number of rows deleted.");
			
			//getting the data back
			ResultSet rs = stmt.executeQuery("select *from empper");
			System.out.println("list of Employee");
			while(rs.next()){
				System.out.println(" "+rs.getInt("empid")+" "+rs.getString("empname"));
			}
			rs.close();
			stmt.close();
			con.close();
	       }
		catch(Exception e){
			System.out.println("Exception:"+e.getMessage());
		}
	}

}
