import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcFirstExample {
    public static void main(String[] args) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl", "SCOTT", "SCOTT");
                Statement statement = connection.createStatement();
                String sql = "CREATE TABLE Student_KANZY(\n" +
                        "    ID INTEGER NOT NULL CONSTRAINT  PK_STUDENT_KANZY PRIMARY KEY,\n" +
                        "    Name VARCHAR(255),\n" +
                        "    AGE INTEGER\n" +
                        ")";
                statement.execute(sql);
                System.out.println("success");
//                System.out.println(statement.execute(sql));
            } catch (SQLException e) {
                e.printStackTrace();
            }

    }


}




