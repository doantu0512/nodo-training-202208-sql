import java.io.File;
import java.sql.*;

public class InsertDataExample {
    public static void main(String[] args) throws SQLException {
        Connection connection =null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl","SCOTT","SCOTT");
            statement = connection.createStatement();
            statement.execute("insert into Student_KANZY(id,name,age)values (Student_KANZY_SEQ.nextvaL,'Tran Van B',20)");
            statement.execute("insert into Student_KANZY(id,name,age)values (Student_KANZY_SEQ.nextvaL,'Tran Thi B',12)");
            statement.execute("insert into Student_KANZY(id,name,age)values (Student_KANZY_SEQ.nextvaL,'Nguyen Van C',56)");

            statement.close();
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }
}
