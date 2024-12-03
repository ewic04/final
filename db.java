package shing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    public static Connection mycon() {
        Connection con = null;

        try {
            // Load the new driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Use the updated JDBC URL format
            con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login?useSSL=false&serverTimezone=UTC", 
                    "root", 
                    "");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }

        return con;
    }

}
