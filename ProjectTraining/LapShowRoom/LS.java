import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LS {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/project"; // Replace with your database URL
        String username = "root"; // Replace with your database username
        String password = ""; // Replace with your database password

        String qry1 = "SELECT * FROM Laptop WHERE id = ?";
        int i = 1;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL/MariaDB JDBC driver class
            Connection conn = DriverManager.getConnection(url, username, password);

            PreparedStatement pst = conn.prepareStatement(qry1);
            pst.setInt(1, i);
            System.out.println("SQL Query: " + pst.toString()); // Print the prepared SQL query

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                // Access data from the current row using resultSet.getXXX() methods
                int id = rs.getInt("id");
                String lname = rs.getString("lname");
                String detail = rs.getString("detail");
                String ram = rs.getString("RAM");
                int price = rs.getInt("Price");
                String available = rs.getString("Avaliable");

                System.out.println("ID: " + id);
                System.out.println("Laptop Name: " + lname);
                System.out.println("Detail: " + detail);
                System.out.println("RAM: " + ram);
                System.out.println("Price: " + price);
                System.out.println("Available: " + available);
            }

            rs.close();
            pst.close();
            conn.close();
        } catch (ClassNotFoundException ex) {
            System.err.println("JDBC driver not found. Make sure to include the MySQL/MariaDB JDBC driver JAR in your classpath.");
        } catch (SQLException ex) {
            System.err.println("Error accessing the database: " + ex);
        }
    }
}
