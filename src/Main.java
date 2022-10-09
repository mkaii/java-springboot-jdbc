import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {


    public static void main(String[] args) {
        Connection connection;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc",DatabaseKeys.USER,DatabaseKeys.PASSWORD);

            Statement stmt = connection.createStatement();
            String query = "create table friends(id int, name varchar(10))";
            stmt.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
