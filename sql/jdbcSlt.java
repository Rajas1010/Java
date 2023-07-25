 import java.sql.*;
public class jdbcSlt
{
	public static void main(String args[])
	{
	
		jdbcConnection o=new jdbcConnection();
		o.jdbc();
	}
}
class jdbcConnection
{
	public void jdbc()throws SQLException
	{
		String url="jdbc:sqlite:/C:\\Users\\rasu\\DataBase\\projectLap.db";
		Connection conn=null;
		Statement st=null;
			try
		{Class.forName("org.sqlite.JDBC");
		conn=DriverManager.getConnection(url);
		st=conn.createStatement();
		String qry="select username,password from users";
		ResultSet rs=st.executeQuery(qry);
		String user,pw;
		while(rs.next())
		{
			user=rs.getString("username");
			pw=rs.getString("password");
			System.out.println("ufr  "+user);
			System.out.println("pwd  "+pw);
		}
		
		}catch(Exception e){System.err.println(e);}
		finally{
			st.close();
			conn.close();
			}
	}
}