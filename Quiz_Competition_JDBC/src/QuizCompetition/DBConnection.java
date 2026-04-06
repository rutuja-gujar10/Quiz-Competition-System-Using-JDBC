package QuizCompetition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        
            Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/quizdb";
			String username = "root";
			String password = "root";
            return DriverManager.getConnection(url, username, password);
        
        
    }
}
