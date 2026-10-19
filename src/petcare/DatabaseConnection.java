package petcare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/petcare";
        String username = "root";
        String password = "YOUR_MYSQL_PASSWORD";

        try (Connection con =
                     DriverManager.getConnection(url, username, password)) {

            System.out.println("Pet Care Database Connected Successfully!");

        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
}

