import java.sql.*;

public class JdbcMetadataExample {
    public static void main(String[] args) {
        try {
            Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl", "SCOTT", "SCOTT");
            Statement statement = connection.createStatement();
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println("db version "+metaData.getDatabaseMajorVersion());
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
