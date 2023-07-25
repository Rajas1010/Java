import java.sql.*;
public class connectXamppSql
{
	public static void main(String[] args) throws Exception 
	{
		Connection con=null;
		Statement stmt=null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/","root","");
		System.out.println("xamp connect");
		stmt=con.createStatement();
		stmt.executeUpdate("CREATE DATABASE PROGRAMAT");
		System.out.println("database create");
		}catch(Exception e){System.out.println(e.getMessage());}
		stmt.close();
		con.close();
	}
}