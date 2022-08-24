import java.sql.*;

public class DbFunction {
    public static void getAge(String name,int []ages) throws ClassNotFoundException, SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl","SCOTT","SCOTT");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT max(age) from Student_KANZY where name like '%" + name + "%'");
            ages[0] = rs.next() ? rs.getInt(1) : -1;
            connection.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        int []ages = new int[1];
        getAge("Thi Z",ages);
        System.out.println(ages[0]);
    }
}