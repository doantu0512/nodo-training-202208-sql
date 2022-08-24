import java.sql.*;

public class BatchProcessingExample {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl", "SCOTT", "SCOTT");
            Statement statement = connection.createStatement();
            for(int i =0;i<20;i++){

                String Name ="Nguyen Van A" +i;
                int age =20+i;
                String sql ="insert into Student_KANZY(id, name,age) values " +
                "(" + "Student_KANZY_SEQ.nextval" + ",'" + Name + "'," + age + ")";
                statement.addBatch(sql);
            }
            statement.executeBatch();
            ResultSet rs;
            rs = statement.executeQuery("select  count(*) from Student_KANZY");
            if(rs.next()){
                System.out.println("total records ="+rs.getInt(1));
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
