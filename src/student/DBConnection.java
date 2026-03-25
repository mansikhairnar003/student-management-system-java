package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root"; // Change it if your username is different
        String password = "m@n$!#3102002"; // Add your MySQL password if you have one

        return DriverManager.getConnection(url, user, password);
    }
}
