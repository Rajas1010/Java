import java.sql.*;
public class selectQry
{
	public static void main(String[] args) throws Exception 
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
				String ary[]=new String[4];
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kgf","root","");
		System.out.println("xamp connect");
		stmt=con.createStatement();
		rs=stmt.executeQuery("SELECT * FROM workers WHERE Rollno=1");
		System.out.println("QUERY EXECUTE");
		while(rs.next())
		{
				ary[0]=Integer.toString(rs.getInt("Rollno"));
				ary[1]=rs.getString("Name");
				ary[2]=Integer.toString(rs.getInt("Sector"));
				ary[3]=rs.getString("City");
		}
		}catch(Exception e){System.out.println(e.getMessage());}
		selectQry o=new selectQry();
		String ar[]=o.sql(ary);
		for(int i=0;i<4;i++)
			System.out.println(ar[i]);
		stmt.close();
		con.close();
	}
	public String[] sql(String[] ar)
	{
		return ar;
	}

}
