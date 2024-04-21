package bank.management.system;
import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create the connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "Bharat@2201010148");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // You may also want to add a method to close the connection when you're done using it
    public void closeConnection() {
        try {
            if (s != null) {
                s.close();
            }
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
