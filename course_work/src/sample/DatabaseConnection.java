package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String databaseName = "demo_db";
    private static final String databaseUser = "root";
    private static final String databasePassword = "167457";
    private static final String url = "jdbc:mysql://localhost/" + databaseName;
    private static Connection databaseLink;
    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public static DatabaseConnection getInstance()
    {
        if (databaseConnection == null)
            databaseConnection = new DatabaseConnection();
        return databaseConnection;
    }

    public static Connection getConnection() {
        return databaseLink;
    }
}
