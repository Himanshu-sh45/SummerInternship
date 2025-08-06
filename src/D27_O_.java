import java.sql.*;

public class D27_O_ {
    public static void main(String[] args) {

        String URL =  "jdbc:mysql://localhost:3306/organization";

        String username = "root";
        String password = "HB46717017@dd";


        try {
                    Class.forName("con.mysql.jdbc.Driver");
                    System.out.println("drivers loaded successfully");
                } catch (ClassNotFoundException e) {
                    System.out.println(e.getMessage());
                }
                try {
                    Connection con = DriverManager.getConnection(URL, username, password);
                    System.out.println("Connection established successfully.");
                } catch(SQLException e) {
                    throw new RuntimeException(e);
                }

    }
}