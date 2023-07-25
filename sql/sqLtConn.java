 import java.sql.*;
 public class sqLtConn
 {
	 public static void main(String args[]) throws SQLException
	 {
		 String url="jdbc:sqlite:/C:\\Users\\rasu\\DataBase\\basefine.db";
		 Connection conn=null;
		 int ID =98;
		 String NAME="sri";
		 int AGE =19;
		 String CITY="mdu";
		 String sql="insert into users(ID,NAME,AGE,CITY)"+"values("+ID+",'"+NAME+"',"+AGE+",'"+CITY+"')";
		try
		{
			Class.forName("org.sqlite.JDBC");
			conn=DriverManager.getConnection(url);
			Statement st=conn.createStatement();
			int m=st.executeUpdate(sql);
			if(m==1)
				System.out.println("insert success ; "+sql);
			else
				System.out.println("failed");
		}catch (Exception e){System.err.println(e);}
		finally{conn.close();}
	 }
 }