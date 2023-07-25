 import java.sql.*;
 import java.util.*;
public class sqltrn
{
	public static void main(String args[])throws SQLException
	{
		Scanner in=new Scanner(System.in);
		String url="jdbc:sqlite:/C:\\Users\\rasu\\DataBase\\projectLap.db";
		Connection conn=null;
		Statement st=null;
		try
		{
			Class.forName("org.sqlite.JDBC");
			conn=DriverManager.getConnection(url);
			System.out.println("Enter the username");
			String qry="Select * from users where username="+in.getText();
			st=conn.createStatement();
			ResultSet rs=st.executeQuery(qry);
			System.out.println(rs.getString("password"));


		}catch(Exception e){System.err.println(e);}
		finally
		{
			st.close();
			conn.close();
		}
	}
}