package SQLINSERT;

import java.sql.*;


public class sqlinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","Root@123");  
			Statement stmt=con.createStatement();
			int count = stmt.executeUpdate("insert into empper(empid,empname)values(106,'rohan')");
			System.out.println(count+" Number of rows inserted.");
			
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
