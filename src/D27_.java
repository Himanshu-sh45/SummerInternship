//JDBC -> javascript object notation.. java api that enables to execute sql
// statements and interact with relational databases. A standard way to connect
//database, execute queries and retrieve results.
// Key Components:
// 1. Driver Manager -> manages the list of manager drivers.
// 2. Connectors -> represent a connection to a database.
// 3. Statements -> represent the sql statements.
//Statement object are suitable for executing one time.
// Prepaid Statement -> is a Precompile sql statement that can be executed multiple times with different parameters.
// prepaid statement object are suitable for running sql queries such as queries with user input data.
// Benefits -> sql injection prevention separating sql  code injection from the data performance by reducing overhead of parsing and compiling
// Compiling
// 4. result set -> represent the result of a query.
// Common JDBC methods:
// 1. Executes a query and return a result set.
// Execute and update  -> executes
// GetConnection -> executes a connection with the database.
// Close -> Closes the resource such as statement, result set of the statement.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class D27_ {

    // Correct JDBC url
    private static final String DB_URL = "jdbc:mysql://localhost:3306/organization";

    // username and password
    private static final String USER = "root";
    private static final String PASS = "HB46717017@dd";

    private static void createTable() {
        String query = "CREATE TABLE IF NOT EXISTS user ("
                +"id INT AUTO_INCREMENT PRIMARY KEY, "
                +"name VARCHAR(255), "
                +"email VARCHAR(255))";

        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Table created or already exists.");
        }
        catch(SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    private static void insertTable(String name, String email) {
        String query = "INSERT INTO user (name,email) VALUES (?,?)";
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement ptmt = conn.prepareStatement(query)) {

            ptmt.setString(1, name);
            ptmt.setString(2,email);
            ptmt.executeUpdate();
            System.out.println("Data inserted successfully.");

        }
        catch(SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    // Read Data
    private static void readTable() {
        String query = "SELECT * FROM user";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("\nID | Name       | Email");
            System.out.println("-------------------------------");

            while (rs.next()) {
                System.out.printf("%d  | %-10s | %s\n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Update Data
    private static void updateTable(int id, String newName, String newEmail) {
        String query = "UPDATE user SET name = ?, email = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement ptmt = conn.prepareStatement(query)) {

            ptmt.setString(1, newName);
            ptmt.setString(2, newEmail);
            ptmt.setInt(3, id);

            int rowsAffected = ptmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record updated for ID: " + id);
            } else {
                System.out.println("No record found with ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Delete Data
    private static void deleteTable(int id) {
        String query = "DELETE FROM user WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement ptmt = conn.prepareStatement(query)) {

            ptmt.setInt(1, id);

            int rowsDeleted = ptmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Record deleted with ID: " + id);
            } else {
                System.out.println("No record found with ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        createTable();
        insertTable("Himanshu", "hb234@gmail.com");
        insertTable("Shahroz", "sa987@gmail.com");
        insertTable("Ankit","aj762@gmail.com");

        // READ
        readTable();

        // UPDATE
        updateTable(2, "Shahroz Khan", "shahroz.k@gmail.com");

        // DELETE
        deleteTable(3);

        // Final Read
        readTable();

    }
}
