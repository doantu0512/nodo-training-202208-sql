import java.sql.*;

public class SelectDataExample {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl","SCOTT","SCOTT");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM Student_KANZY");
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id+"\t"+name+"\t"+age);

            }
            rs.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
