public class DatabaseManager {
    
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }