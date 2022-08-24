import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl", "SCOTT", "SCOTT");
            Statement statement = connection.createStatement();
            connection.setAutoCommit(false);
            for (int i = 0; i < 10; i++) {

                String Name = "Tran Van" + i;
                int age = 10 + i;
                statement.executeUpdate("insert into Student_KANZY(id, name,age) values " +
                        "(" + "Student_KANZY_SEQ.nextval" + ",'" + Name + "'," + age + ")");

            }

            connection.rollback();
            connection.setAutoCommit(true);
            ResultSet rs;
            rs = statement.executeQuery("select count(*)from Student_KANZY");
            if (rs.next()) {
                System.out.println("total records =" + rs.getInt(1));
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
