package SqLiteConnection;
import java.sql.*;
 public class sqlite
 {
	 public sqlite(String query)
	 {
		 this.query=query;
	 }
	 public static void main(String args[]) throws SQLException
	 {
		 String url="jdbc:sqlite:/C:\\Users\\rasu\\DataBase\\basefine.db";
		 Connection conn=null; 
		try
		{
			Class.forName("org.sqlite.JDBC");
			conn=DriverManager.getConnection(url);
			Statement st=conn.createStatement();
			int m=st.executeUpdate(query);
		}catch (Exception e){System.err.println(e);}
		finally{conn.close();}
	 }
 }