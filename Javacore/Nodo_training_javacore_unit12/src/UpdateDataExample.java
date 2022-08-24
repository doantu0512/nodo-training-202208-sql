import java.sql.*;

public class UpdateDataExample {
    public static void main(String[] args) {
        String sqlUpdate ="UPDATE Student_KANZY " +
                " SET Name = ? " +
                " WHERE ID = ? ";
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl","SCOTT","SCOTT");
            Statement statement = connection.createStatement();
            PreparedStatement prStatement= connection.prepareStatement(sqlUpdate);


            prStatement.setString(1,"LE thi z");
            prStatement.setInt(2,2);
            prStatement.executeUpdate();

            connection.close();
            prStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
