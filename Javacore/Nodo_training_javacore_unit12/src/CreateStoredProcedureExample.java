import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStoredProcedureExample {
    public static void main(String[] args) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl","SCOTT","SCOTT");
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE PROCEDURE GETAGE_KANZY(stream_name VARCHAR(255),out age int)"+
                    " PARAMETER STYLE JAVA READS"+
                    " SQL DATA LANGUAGE JAVA EXTERNAL NAME "+
                    " 'jdbc.DbFunction.getAge'");
            System.out.println("Done");
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}